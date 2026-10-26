/*
 * ============================================================================
 * BL04 - Contar lista sem incluir sentinela
 *
 * BASE: Listas encadeadas - AEDs II.pdf, questao 4, pagina 1.
 * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
 *
 * PEDIDO E RACIOCINIO
 * Conte os nos a partir de primeiro.proximo. Nao modifique primeiro/ultimo.
 *
 * EXEMPLO / TESTE DE MESA
 * []->0; [9]->1; [9,9,9]->3.
 *
 * CASOS DE BORDA
 * Vazia; unidade; depois de insercoes/remocoes.
 *
 * CUSTO E EFEITOS
 * O(n) tempo/O(1) memoria.
 *
 * COMO ADAPTAR
 * Retornar tamanho e O(1) se o campo existir e suas atualizacoes forem corretas.
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

public final class BL04_Contar {
    public static class Lista<E> {
        private final Celula<E> primeiro;
        private Celula<E> ultimo;
        private int tamanho;

        // ================= SOLUCAO_PEDIDA_AQUI =================
        public int obterNumeroItens() {
                int n = 0;
                for (Celula<E> p = primeiro.getProximo(); p != null; p = p.getProximo()) n++;
                return n;
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
