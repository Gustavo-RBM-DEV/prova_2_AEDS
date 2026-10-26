/*
 * ============================================================================
 * BL05 - Consultar posicao
 *
 * BASE: Listas encadeadas - AEDs II.pdf, questao 5, pagina 1.
 * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
 *
 * PEDIDO E RACIOCINIO
 * Pos0 corresponde ao primeiro dado. Avance pos vezes, nao pos+1.
 * Consulta nao remove. Intervalo valido:0..n-1.
 *
 * EXEMPLO / TESTE DE MESA
 * [10,20,30]: localizar(0)=10; localizar(2)=30; localizar(3)=erro.
 *
 * CASOS DE BORDA
 * Pos negativa; pos==n; vazia; primeiro/ultimo.
 *
 * CUSTO E EFEITOS
 * O(pos+1) tempo/O(1) auxiliar.
 *
 * COMO ADAPTAR
 * Sem campo tamanho, detecte aux==null durante a caminhada. Veja R01 para recursao.
 *
 * ATENCAO AO CONTRATO
 * Use os nomes, a assinatura e as restricoes do template efetivamente entregue na prova.
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

public final class BL05_Localizar {
    public static class Lista<E> {
        private final Celula<E> primeiro;
        private Celula<E> ultimo;
        private int tamanho;

        // ================= SOLUCAO_PEDIDA_AQUI =================
        public E localizar(int pos) {
                if (pos < 0 || pos >= tamanho) throw new IndexOutOfBoundsException("Posicao invalida");
                Celula<E> p = primeiro.getProximo();
                for (int i = 0; i < pos; i++) p = p.getProximo();
                return p.getItem();
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
