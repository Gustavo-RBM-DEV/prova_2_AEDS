/*
 * ============================================================================
 * BF03 - Existencia por igualdade
 *
 * BASE: Filas - AEDs II.pdf, questao 3, pagina 1.
 * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
 *
 * PEDIDO E RACIOCINIO
 * null encerra com false. Encontrar equals verdadeiro encerra com true.
 * Se nao encontrou nesta celula, retorne o resultado da proxima.
 *
 * EXEMPLO / TESTE DE MESA
 * [10,20,30], alvo20 -> true; alvo99 -> false.
 *
 * CASOS DE BORDA
 * Vazia; primeiro; ultimo; ausente; repetidos.
 *
 * CUSTO E EFEITOS
 * O(n) pior; esta versao usa O(n) pilha de chamadas e nao altera a fila.
 *
 * COMO ADAPTAR
 * Um while sem return antecipado pode ser usado se recursao nao for obrigatoria.
 *
 * ATENCAO AO CONTRATO
 * A folha fala em criterio de comparacao do item. Escolhemos equals para igualdade.
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

public final class BF03_Existe {
    public static class Fila<E> {
        private final Celula<E> frente;
        private Celula<E> tras;

        // ================= SOLUCAO_PEDIDA_AQUI =================
        public boolean verificarExistencia(E item) { return contem(item); }

        public boolean contem(E item) { return contem(item, frente.getProximo()); }

        public boolean contem(E item, Celula<E> aux) {
                if (aux == null) return false;
                if (aux.getItem().equals(item)) return true;
                return contem(item, aux.getProximo());
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
