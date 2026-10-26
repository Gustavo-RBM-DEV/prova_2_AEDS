/*
 * ============================================================================
 * FF06 - Inverter a fila recebida
 *
 * BASE: Lista de Exercicios Fila Flexivel.docx.PDF, questao 6, pagina 2.
 * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
 *
 * PEDIDO E RACIOCINIO
 * Chame inverter sobre o argumento e retorne a mesma referencia. This so
 * muda se o argumento e a propria this.
 *
 * EXEMPLO / TESTE DE MESA
 * A[1],B[2,3,4]: R=A.inverterOutra(B); B[4,3,2] e R==B.
 *
 * CASOS DE BORDA
 * Vazia; unidade; autoalias; null.
 *
 * CUSTO E EFEITOS
 * O(m) tempo/O(1) auxiliar. Modifica B.
 *
 * COMO ADAPTAR
 * return B.invertida() devolveria uma copia e preservaria B: outro contrato.
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

public final class FF06_InverterRecebida {
    public static class Fila<E> {
        private final Celula<E> frente;
        private Celula<E> tras;

        // ================= SOLUCAO_PEDIDA_AQUI =================
        public Fila<E> inverterOutra(Fila<E> outra) {
                if (outra == null) throw new IllegalArgumentException("Fila nula");
                outra.inverter();
                return outra;
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

        public void inverter() {
                Celula<E> antigoPrimeiro = frente.getProximo();
                Celula<E> anterior = null, atual = antigoPrimeiro;
                while (atual != null) {
                    Celula<E> seguinte = atual.getProximo();
                    atual.setProximo(anterior);
                    anterior = atual;
                    atual = seguinte;
                }
                frente.setProximo(anterior);
                tras = antigoPrimeiro == null ? frente : antigoPrimeiro;
            }

        public Object[] toArray() {
                Object[] a = new Object[tamanho()]; int i = 0;
                for (Celula<E> p = frente.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                return a;
            }
    }
}
