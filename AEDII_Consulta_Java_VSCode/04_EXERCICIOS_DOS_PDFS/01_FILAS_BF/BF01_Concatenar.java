/*
 * ============================================================================
 * BF01 - Concatenar duas filas
 *
 * BASE: Filas - AEDs II.pdf, questao 1, pagina 1.
 * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
 *
 * PEDIDO E RACIOCINIO
 * Anexe os dados de outra no final de this. Percorra com cursor, enfileirando no destino.
 * Se outra==this, copie primeiro para nao percorrer uma fila que cresce indefinidamente.
 *
 * EXEMPLO / TESTE DE MESA
 * A=[10,20], B=[30,40] -> A=[10,20,30,40], B preservada.
 * A.concatenar(A) duplica a sequencia original uma vez.
 *
 * CASOS DE BORDA
 * A/B vazias; unidade; outra==this; origem null rejeitada.
 *
 * CUSTO E EFEITOS
 * O(m) tempo. O(m) novas celulas no destino; auxiliar O(1), ou O(m) em autoalias.
 *
 * COMO ADAPTAR
 * Religar e consumir origem pode ser O(1), mas viola preservacao quando exigida.
 *
 * ATENCAO AO CONTRATO
 * O PDF nao fixa se a segunda fila deve ser destruida. Aqui ela e preservada.
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

public final class BF01_Concatenar {
    public static class Fila<E> {
        private final Celula<E> frente;
        private Celula<E> tras;

        // ================= SOLUCAO_PEDIDA_AQUI =================
        public void concatenar(Fila<E> outra) {
                if (outra == null) throw new IllegalArgumentException("Fila nula");
                Fila<E> fonte = outra == this ? outra.copiar() : outra;
                for (Celula<E> p = fonte.frente.getProximo(); p != null; p = p.getProximo()) enfileirar(p.getItem());
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

        public Object[] toArray() {
                Object[] a = new Object[tamanho()]; int i = 0;
                for (Celula<E> p = frente.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                return a;
            }
    }
}
