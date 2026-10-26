/*
 * ============================================================================
 * LF07 - Inverter lista atual
 *
 * BASE: Lista de Exercicios de Lista Flexivel.docx.PDF, questao 7, pagina 2.
 * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
 *
 * PEDIDO E RACIOCINIO
 * Guarde antigo primeiro para novo ultimo. Salve seguinte, vire seta para
 * anterior e avance. Ao final, sentinela aponta para o antigo ultimo.
 *
 * EXEMPLO / TESTE DE MESA
 * S->10->20->30 vira S->30->20->10. ultimo=10.
 *
 * CASOS DE BORDA
 * Vazia: ultimo=S; unidade; inverter duas vezes.
 *
 * CUSTO E EFEITOS
 * O(n) tempo/O(1) auxiliar. Mesmos nos e tamanho.
 *
 * COMO ADAPTAR
 * Mudar somente primeiro/ultimo nao vira as setas internas.
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

public final class LF07_Inverter {
    public static class Lista<E> {
        private final Celula<E> primeiro;
        private Celula<E> ultimo;
        private int tamanho;

        // ================= SOLUCAO_PEDIDA_AQUI =================
        public void inverter() {
                Celula<E> antigoPrimeiro = primeiro.getProximo();
                Celula<E> anterior = null, atual = antigoPrimeiro;
                while (atual != null) {
                    Celula<E> seguinte = atual.getProximo();
                    atual.setProximo(anterior); anterior = atual; atual = seguinte;
                }
                primeiro.setProximo(anterior);
                ultimo = antigoPrimeiro == null ? primeiro : antigoPrimeiro;
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
