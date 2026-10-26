/*
 * ============================================================================
 * BL03 - Retirar primeira ocorrencia
 *
 * BASE: Listas encadeadas - AEDs II.pdf, questao 3, pagina 1.
 * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
 *
 * PEDIDO E RACIOCINIO
 * Busque o predecessor da primeira ocorrencia por equals. Religue antes de avancar.
 * O metodo devolve o objeto encontrado, nao o argumento procurado.
 *
 * EXEMPLO / TESTE DE MESA
 * [10,20,20,30], remover valor20 -> [10,20,30].
 *
 * CASOS DE BORDA
 * Inicio/meio/fim; unico; ausente; repetidos.
 *
 * CUSTO E EFEITOS
 * O(n) tempo/O(1) auxiliar.
 *
 * COMO ADAPTAR
 * Remover todas exige continuar e manter predecessor parado quando remove.
 *
 * ATENCAO AO CONTRATO
 * Sobrecarga: Lista<Integer>.remover(2) remove POSICAO2; use Integer.valueOf(2) para VALOR2.
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

public final class BL03_RemoverValor {
    public static class Lista<E> {
        private final Celula<E> primeiro;
        private Celula<E> ultimo;
        private int tamanho;

        // ================= SOLUCAO_PEDIDA_AQUI =================
        public E remover(int pos) {
                if (pos < 0 || pos >= tamanho) throw new IndexOutOfBoundsException("Posicao invalida");
                Celula<E> anterior = primeiro;
                for (int i = 0; i < pos; i++) anterior = anterior.getProximo();
                Celula<E> r = anterior.getProximo();
                anterior.setProximo(r.getProximo());
                if (r == ultimo) ultimo = anterior;
                r.setProximo(null); tamanho--;
                return r.getItem();
            }

        /** Com E=Integer: remover(2) escolhe posicao; remover(Integer.valueOf(2)) escolhe valor. */
            public E remover(E itemProcurado) {
                Celula<E> anterior = primeiro;
                while (anterior.getProximo() != null && !anterior.getProximo().getItem().equals(itemProcurado)) anterior = anterior.getProximo();
                if (anterior.getProximo() == null) throw new NoSuchElementException("Item ausente");
                Celula<E> r = anterior.getProximo();
                anterior.setProximo(r.getProximo());
                if (r == ultimo) ultimo = anterior;
                r.setProximo(null); tamanho--;
                return r.getItem();
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
