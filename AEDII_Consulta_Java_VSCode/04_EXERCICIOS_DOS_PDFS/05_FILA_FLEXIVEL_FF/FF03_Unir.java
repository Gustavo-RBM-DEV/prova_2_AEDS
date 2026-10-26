/*
 * ============================================================================
 * FF03 - Uniao preservando fila atual
 *
 * BASE: Lista de Exercicios Fila Flexivel.docx.PDF, questao 3, pagina 1.
 * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
 *
 * PEDIDO E RACIOCINIO
 * Copie this para a nova fila; acrescente os itens da outra. Ambas ficam
 * inalteradas nesta implementacao.
 *
 * EXEMPLO / TESTE DE MESA
 * A[1,2],B[3,4] -> retorno[1,2,3,4]; A e B iguais ao inicio.
 *
 * CASOS DE BORDA
 * Vazias; comprimentos diferentes; mesma instancia.
 *
 * CUSTO E EFEITOS
 * O(n+m) tempo e celulas.
 *
 * COMO ADAPTAR
 * Nao consumir this: essa proibicao e explicita no PDF.
 *
 * ATENCAO AO CONTRATO
 * Use os nomes, a assinatura e as restricoes do template efetivamente entregue na prova.
 *
 * ARQUIVO COMPLETO DE REFERENCIA: src/aed/base/Fila.java
 * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
 * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
 * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
 * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
 * existem no codigo-base. As classes de apoio ficam em src/aed/base.
 *
 * ============================================================================
 */

import java.util.NoSuchElementException;
import java.util.function.Function;
import java.util.function.Predicate;
import aed.base.Celula;
import aed.base.CelulaDupla;
import aed.base.Fila;
import aed.base.Pilha;
import aed.app.PedidoDemo;

public final class FF03_Unir {
    public static class Fila<E> {
        private final Celula<E> frente;
        private Celula<E> tras;

        // ================= SOLUCAO_PEDIDA_AQUI =================
        public Fila<E> unir(Fila<E> outra) {
                Fila<E> nova = copiar();
                nova.concatenar(outra);
                return nova;
            }

        // =========== BASE E AUXILIARES NECESSARIOS ==============
        public Fila() { frente = new Celula<>(); tras = frente; }

        /** FF01: ignora os elementos null do vetor. */
            public Fila(E[] itens) {
                this();
                if (itens == null) throw new IllegalArgumentException("Vetor nulo");
                for (E e : itens) if (e != null) enfileirar(e);
            }

        /** FF02: escolha explicita, ordem topo->fundo; restaura a pilha. */
            public Fila(Pilha<E> pilha) {
                this();
                if (pilha == null) throw new IllegalArgumentException("Pilha nula");
                Pilha<E> aux = new Pilha<>();
                while (!pilha.vazia()) {
                    E e = pilha.desempilhar();
                    enfileirar(e);
                    aux.empilhar(e);
                }
                while (!aux.vazia()) pilha.empilhar(aux.desempilhar());
            }

        public boolean vazia() { return frente == tras; }

        public void enfileirar(E item) {
                if (item == null) throw new IllegalArgumentException("Item nulo");
                Celula<E> nova = new Celula<>(item);
                tras.setProximo(nova);
                tras = nova;
            }

        public int tamanho() {
                int n = 0;
                for (Celula<E> p = frente.getProximo(); p != null; p = p.getProximo()) n++;
                return n;
            }

        public Fila<E> copiar() {
                Fila<E> nova = new Fila<>();
                for (Celula<E> p = frente.getProximo(); p != null; p = p.getProximo()) nova.enfileirar(p.getItem());
                return nova;
            }

        public void concatenar(Fila<E> outra) {
                if (outra == null) throw new IllegalArgumentException("Fila nula");
                Fila<E> fonte = outra == this ? outra.copiar() : outra;
                for (Celula<E> p = fonte.frente.getProximo(); p != null; p = p.getProximo()) enfileirar(p.getItem());
            }

        public Object[] toArray() {
                Object[] a = new Object[tamanho()]; int i = 0;
                for (Celula<E> p = frente.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                return a;
            }
    }
}
