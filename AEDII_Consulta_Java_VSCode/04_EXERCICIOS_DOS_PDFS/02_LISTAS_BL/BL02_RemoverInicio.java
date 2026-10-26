/*
 * ============================================================================
 * BL02 - Retirar primeiro dado
 *
 * BASE: Listas encadeadas - AEDs II.pdf, questao 2, pagina 1.
 * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
 *
 * PEDIDO E RACIOCINIO
 * O predecessor do primeiro dado e S. S passa a apontar ao sucessor do removido.
 * Se era ultimo, ultimo=S. O helper remover(0) executa esse movimento.
 *
 * EXEMPLO / TESTE DE MESA
 * S->10->20; retorna10 e sobra S->20. Tirar20 deixa primeiro==ultimo.
 *
 * CASOS DE BORDA
 * Vazia lanca; unico exige restaurar ultimo; reinserir depois.
 *
 * CUSTO E EFEITOS
 * O(1) para inicio; helper por posicao custa O(pos).
 *
 * COMO ADAPTAR
 * Se nao existir remover(int), escreva diretamente o corpo com predecessor=primeiro.
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

public final class BL02_RemoverInicio {
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

        public E removerInicio() {
                if (vazia()) throw new NoSuchElementException("Lista vazia");
                return remover(0);
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
