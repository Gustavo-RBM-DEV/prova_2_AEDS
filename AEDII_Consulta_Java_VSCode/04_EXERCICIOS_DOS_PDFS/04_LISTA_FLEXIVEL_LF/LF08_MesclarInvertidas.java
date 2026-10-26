/*
 * ============================================================================
 * LF08 - Intercalar duas listas invertidas
 *
 * BASE: Lista de Exercicios de Lista Flexivel.docx.PDF, questao 8, pagina 2.
 * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
 *
 * PEDIDO E RACIOCINIO
 * Crie copia invertida de cada lista e mescle as copias. Segue a ordem do
 * EXEMPLO do PDF: this invertida primeiro, outra invertida depois; acrescente sobras.
 *
 * EXEMPLO / TESTE DE MESA
 * X1 X3 X5 X7 X9 X11 / Y1 Y3 Y9 Y2 Y5 Y7 Y4 Y6
 * -> X11 Y6 X9 Y4 X7 Y7 X5 Y5 X3 Y2 X1 Y9 Y3 Y1
 *
 * CASOS DE BORDA
 * Comprimentos diferentes; vazias; autoalias; origens intactas.
 *
 * CUSTO E EFEITOS
 * O(n+m) tempo e memoria.
 *
 * COMO ADAPTAR
 * Comecar pela outra daria resultado diferente do exemplo.
 *
 * ATENCAO AO CONTRATO
 * A redacao mistura concatenacao/mesclagem. O exemplo orienta esta escolha.
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

public final class LF08_MesclarInvertidas {
    public static class Lista<E> {
        private final Celula<E> primeiro;
        private Celula<E> ultimo;
        private int tamanho;

        // ================= SOLUCAO_PEDIDA_AQUI =================
        /** LF08: segue o exemplo do PDF, this invertida primeiro. */
            public Lista<E> mesclarInvertidas(Lista<E> outra) {
                Lista<E> a = invertida(); a.mesclar(outra.invertida()); return a;
            }

        // =========== BASE E AUXILIARES NECESSARIOS ==============
        public Lista() { primeiro = new Celula<>(); ultimo = primeiro; }

        public boolean vazia() { return primeiro == ultimo; }

        public void inserirFinal(E item) {
                if (item == null) throw new IllegalArgumentException("Item nulo");
                Celula<E> nova = new Celula<>(item);
                ultimo.setProximo(nova); ultimo = nova; tamanho++;
            }

        public void inserir(E item, int pos) {
                if (pos < 0 || pos > tamanho) throw new IndexOutOfBoundsException("Posicao invalida");
                if (item == null) throw new IllegalArgumentException("Item nulo");
                Celula<E> anterior = primeiro;
                for (int i = 0; i < pos; i++) anterior = anterior.getProximo();
                Celula<E> nova = new Celula<>(item, anterior.getProximo());
                anterior.setProximo(nova);
                if (anterior == ultimo) ultimo = nova;
                tamanho++;
            }

        public Lista<E> invertida() {
                Lista<E> nova = new Lista<>();
                for (Celula<E> p = primeiro.getProximo(); p != null; p = p.getProximo()) nova.inserir(p.getItem(), 0);
                return nova;
            }

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

        public Object[] toArray() {
                Object[] a = new Object[tamanho]; int i = 0;
                for (Celula<E> p = primeiro.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                return a;
            }
    }
}
