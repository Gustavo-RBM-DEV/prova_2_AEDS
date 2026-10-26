/*
 * ============================================================================
 * R04 - Desenfileirar com tras incorreto
 *
 * BASE: Lista_de_Exercicios_Revisao_unidade2_AEDS_II.docx.PDF, questao 4, pagina 2.
 * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
 *
 * PEDIDO E RACIOCINIO
 * O codigo defeituoso esquece tras ao retirar o unico dado. A insercao
 * seguinte se liga ao no removido, desconectado da sentinela. Corrija tras=frente.
 *
 * EXEMPLO / TESTE DE MESA
 * enq5,enq8,deq5,enq2,deq8,deq2 -> S->null,tras=2 (errado)
 * enq7 liga2->7 mas S continua null. Novo deq causa NullPointerException.
 *
 * CASOS DE BORDA
 * Teste esvaziar e imediatamente enfileirar novamente.
 *
 * CUSTO E EFEITOS
 * A correcao custa O(1).
 *
 * COMO ADAPTAR
 * A lista simples tambem precisa atualizar ultimo ao remover o ultimo dado.
 *
 * ATENCAO AO CONTRATO
 * Rastro completo em 07_RASTROS_ORDENACAO/R04_EstadoDaFila.java.
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

public final class R04_CorrigirTras {
    public static class Fila<E> {
        private final Celula<E> frente;
        private Celula<E> tras;

        // ================= SOLUCAO_PEDIDA_AQUI =================
        public E desenfileirar() {
                if (vazia()) throw new NoSuchElementException("Fila vazia");
                Celula<E> removida = frente.getProximo();
                frente.setProximo(removida.getProximo());
                if (removida == tras) tras = frente;
                removida.setProximo(null);
                return removida.getItem();
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

        public Object[] toArray() {
                Object[] a = new Object[tamanho()]; int i = 0;
                for (Celula<E> p = frente.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                return a;
            }
    }
}
