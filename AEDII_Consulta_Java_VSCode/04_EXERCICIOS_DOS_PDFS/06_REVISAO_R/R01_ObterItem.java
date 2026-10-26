/*
 * ============================================================================
 * R01 - Obter posicao recursivamente
 *
 * BASE: Lista_de_Exercicios_Revisao_unidade2_AEDS_II.docx.PDF, questao 1, pagina 2.
 * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
 *
 * PEDIDO E RACIOCINIO
 * Pos e a distancia restante a partir de aux. Quando pos==0, devolva item.
 * Caso geral avanca aux e reduz pos. Sem laços nem contador extra.
 *
 * EXEMPLO / TESTE DE MESA
 * (A,2)->(B,1)->(C,0); retorno C->C->C.
 *
 * CASOS DE BORDA
 * Pos negativa/fora/vazia: excecao. Pos0: primeiro.
 *
 * CUSTO E EFEITOS
 * O(pos+1) tempo/stack para posicao valida; pior O(n).
 *
 * COMO ADAPTAR
 * Para k-esimo do fim use dois cursores, nao apenas pos++.
 *
 * ATENCAO AO CONTRATO
 * Use os nomes, a assinatura e as restricoes do template efetivamente entregue na prova.
 *
 * ARQUIVO COMPLETO DE REFERENCIA: src/aed/revisao/Fila.java
 * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
 * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
 * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
 * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
 * existem no codigo-base. As classes de apoio ficam em src/aed/base.
 *
 * ============================================================================
 */

import aed.base.Celula;
import java.util.NoSuchElementException;
import aed.base.CelulaDupla;
import aed.base.Fila;
import aed.base.Pilha;
import aed.app.PedidoDemo;

public final class R01_ObterItem {
    public static class Fila<E extends Comparable<E>> {
        private final Celula<E> inicio;
        private Celula<E> fim;

        // ================= SOLUCAO_PEDIDA_AQUI =================
        public E obterItem(int pos) { return obterItem(inicio.getProximo(), pos); }

        public E obterItem(Celula<E> aux, int pos) {
                if (pos < 0 || aux == null) throw new IndexOutOfBoundsException("Posicao inexistente");
                if (pos == 0) return aux.getItem();
                return obterItem(aux.getProximo(), pos - 1);
            }

        // =========== BASE E AUXILIARES NECESSARIOS ==============
        public Fila() { inicio = new Celula<>(); fim = inicio; }

        public Fila(E[] a, E[] b) {
                this();
                if (a == null || b == null) throw new IllegalArgumentException("Array nulo");
                int i = 0, j = 0;
                while (i < a.length && j < b.length) {
                    if (a[i].compareTo(b[j]) <= 0) enfileirar(a[i++]);
                    else enfileirar(b[j++]);
                }
                while (i < a.length) enfileirar(a[i++]);
                while (j < b.length) enfileirar(b[j++]);
            }

        public boolean vazia() { return inicio == fim; }

        public void enfileirar(E item) {
                if (item == null) throw new IllegalArgumentException("Item nulo");
                Celula<E> nova = new Celula<>(item);
                fim.setProximo(nova); fim = nova;
            }

        public Object[] toArray() {
                int n = 0;
                for (Celula<E> p = inicio.getProximo(); p != null; p = p.getProximo()) n++;
                Object[] a = new Object[n]; int i = 0;
                for (Celula<E> p = inicio.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                return a;
            }
    }
}
