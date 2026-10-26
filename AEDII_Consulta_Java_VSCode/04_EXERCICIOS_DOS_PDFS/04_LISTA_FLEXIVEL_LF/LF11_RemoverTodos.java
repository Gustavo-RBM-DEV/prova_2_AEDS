/*
 * ============================================================================
 * LF11 - Remover todas as ocorrencias
 *
 * BASE: Lista de Exercicios de Lista Flexivel.docx.PDF, questao 11, pagina 3.
 * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
 *
 * PEDIDO E RACIOCINIO
 * Ao remover o sucessor, anterior fica parado para examinar o NOVO sucessor.
 * Ao manter, avance anterior. Corrija ultimo e tamanho em cada remocao.
 *
 * EXEMPLO / TESTE DE MESA
 * [2,2,3,2],alvo2 ->[3],true; [3,4],alvo2 ->false.
 *
 * CASOS DE BORDA
 * Vazia lanca; consecutivos; todos; nenhum; inicio/fim.
 *
 * CUSTO E EFEITOS
 * O(n) tempo/O(1) auxiliar, uma passagem.
 *
 * COMO ADAPTAR
 * Lista dupla usa atual.anterior e dispensa manter predecessor externo.
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

public final class LF11_RemoverTodos {
    public static class Lista<E> {
        private final Celula<E> primeiro;
        private Celula<E> ultimo;
        private int tamanho;

        // ================= SOLUCAO_PEDIDA_AQUI =================
        public boolean removerTodos(E item) {
                if (vazia()) throw new IllegalStateException("Lista vazia");
                boolean removeu = false;
                Celula<E> anterior = primeiro;
                while (anterior.getProximo() != null) {
                    Celula<E> atual = anterior.getProximo();
                    if (atual.getItem().equals(item)) {
                        anterior.setProximo(atual.getProximo());
                        if (atual == ultimo) ultimo = anterior;
                        atual.setProximo(null); tamanho--; removeu = true;
                    } else anterior = atual;
                }
                return removeu;
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
