/*
 * ============================================================================
 * BL06 - Trocar dois itens de lugar
 *
 * BASE: Listas encadeadas - AEDs II.pdf, questao 6, pagina 1.
 * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
 *
 * PEDIDO E RACIOCINIO
 * Localize os predecessores dos dois nos antes de alterar. Trate separadamente
 * X antes de Y, Y antes de X e nao adjacentes. Corrija ultimo.
 *
 * EXEMPLO / TESTE DE MESA
 * [10,20,30,40], trocar20/40 -> [10,40,30,20].
 * [10,20], trocar10/20 -> [20,10].
 *
 * CASOS DE BORDA
 * Vizinhos nas duas ordens; extremos; mesmo no; ausencia antes de alterar.
 *
 * CUSTO E EFEITOS
 * O(n) tempo/O(1) auxiliar. Item final nao e modificado.
 *
 * COMO ADAPTAR
 * Variante com setItem troca valores, nao nos. So vale se o campo nao for final.
 *
 * ATENCAO AO CONTRATO
 * O PDF sugere retirar final; a revisao traz item final. A solucao aqui funciona por religacao.
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

public final class BL06_Trocar {
    public static class Lista<E> {
        private final Celula<E> primeiro;
        private Celula<E> ultimo;
        private int tamanho;

        // ================= SOLUCAO_PEDIDA_AQUI =================
        /** Primeiras ocorrencias; troca CELULAS, sem alterar item final. */
            public void trocar(E xItem, E yItem) {
                Celula<E> ax = primeiro, ay = primeiro;
                while (ax.getProximo() != null && !ax.getProximo().getItem().equals(xItem)) ax = ax.getProximo();
                while (ay.getProximo() != null && !ay.getProximo().getItem().equals(yItem)) ay = ay.getProximo();
                Celula<E> x = ax.getProximo(), y = ay.getProximo();
                if (x == null || y == null) throw new NoSuchElementException("Item ausente");
                if (x == y) return;
                if (x.getProximo() == y) {
                    ax.setProximo(y); x.setProximo(y.getProximo()); y.setProximo(x);
                } else if (y.getProximo() == x) {
                    ay.setProximo(x); y.setProximo(x.getProximo()); x.setProximo(y);
                } else {
                    Celula<E> nx = x.getProximo(), ny = y.getProximo();
                    ax.setProximo(y); ay.setProximo(x); x.setProximo(ny); y.setProximo(nx);
                }
                if (ultimo == x) ultimo = y; else if (ultimo == y) ultimo = x;
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
