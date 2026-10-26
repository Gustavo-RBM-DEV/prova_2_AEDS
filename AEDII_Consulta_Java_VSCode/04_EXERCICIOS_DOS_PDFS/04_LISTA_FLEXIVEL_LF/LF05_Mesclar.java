/*
 * ============================================================================
 * LF05 - Mesclar listas alternadas
 *
 * BASE: Lista de Exercicios de Lista Flexivel.docx.PDF, questao 5, pagina 2.
 * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
 *
 * PEDIDO E RACIOCINIO
 * Dois cursores independentes. Adicione um de A e um de B quando existirem.
 * Use || para continuar enquanto ainda houver itens em qualquer origem.
 *
 * EXEMPLO / TESTE DE MESA
 * A[1,3,5],B[2,4] -> A[1,2,3,4,5]; B preservada.
 *
 * CASOS DE BORDA
 * Tamanhos diferentes; ambas/uma vazia; outra==this.
 *
 * CUSTO E EFEITOS
 * O(n+m) tempo e celulas novas.
 *
 * COMO ADAPTAR
 * Reaproveitar nos exige outro contrato: consumir origem e ajustar extremos.
 *
 * ATENCAO AO CONTRATO
 * O PDF nao fixa destruicao da segunda lista. Aqui ela e mantida.
 *
 * ARQUIVO COMPLETO DE REFERENCIA: src/aed/base/Lista.java
 * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
 * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
 * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
 * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
 * existem no codigo-base. As classes de apoio ficam em src/aed/base.
 *
 * ============================================================================
 */

import java.util.NoSuchElementException;
import aed.base.Celula;
import aed.base.CelulaDupla;
import aed.base.Fila;
import aed.base.Pilha;
import aed.app.PedidoDemo;

public final class LF05_Mesclar {
    public static class Lista<E> {
        private final Celula<E> primeiro;
        private Celula<E> ultimo;
        private int tamanho;

        // ================= SOLUCAO_PEDIDA_AQUI =================
        public void mesclar(Lista<E> outra) {
                if (outra == null) throw new IllegalArgumentException("Lista nula");
                Lista<E> nova = new Lista<>();
                Celula<E> a = primeiro.getProximo(), b = outra.primeiro.getProximo();
                while (a != null || b != null) {
                    if (a != null) { nova.inserirFinal(a.getItem()); a = a.getProximo(); }
                    if (b != null) { nova.inserirFinal(b.getItem()); b = b.getProximo(); }
                }
                primeiro.setProximo(nova.primeiro.getProximo());
                ultimo = nova.vazia() ? primeiro : nova.ultimo;
                tamanho = nova.tamanho;
            }

        // =========== BASE E AUXILIARES NECESSARIOS ==============
        public Lista() { primeiro = new Celula<>(); ultimo = primeiro; }

        public boolean vazia() { return primeiro == ultimo; }

        public void inserirFinal(E item) {
                if (item == null) throw new IllegalArgumentException("Item nulo");
                Celula<E> nova = new Celula<>(item);
                ultimo.setProximo(nova); ultimo = nova; tamanho++;
            }

        public Object[] toArray() {
                Object[] a = new Object[tamanho]; int i = 0;
                for (Celula<E> p = primeiro.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                return a;
            }
    }
}
