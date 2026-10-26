/*
 * ============================================================================
 * R19 - Heapsort base um e trocas
 *
 * BASE: Lista_de_Exercicios_Revisao_unidade2_AEDS_II.docx.PDF, questao 19, pagina 5.
 * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
 *
 * PEDIDO E RACIOCINIO
 * Ignore array0. Filhos2*i/2*i+1. Construa de n/2 ate1. Troque raiz
 * com ultimo ativo, reduza heap e repare descendo pela maior crianca.
 *
 * EXEMPLO / TESTE DE MESA
 * [12,7,25,3,18,30,9,14] ->[3,7,9,12,14,18,25,30].
 *
 * CASOS DE BORDA
 * 0/1; filho direito ausente; nao tocar sufixo ja ordenado.
 *
 * CUSTO E EFEITOS
 * Construcao O(n), ordenacao O(n log n), auxiliar O(1).
 *
 * COMO ADAPTAR
 * Base zero usa outras formulas. Rastro completo R19_HeapSort.java em pasta07.
 *
 * ATENCAO AO CONTRATO
 * Use os nomes, a assinatura e as restricoes do template efetivamente entregue na prova.
 *
 * ARQUIVO COMPLETO DE REFERENCIA: src/aed/ordenacao/Ordenacoes.java
 * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
 * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
 * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
 * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
 * existem no codigo-base. As classes de apoio ficam em src/aed/base.
 *
 * ============================================================================
 */

import aed.base.Celula;
import aed.base.CelulaDupla;
import aed.base.Fila;
import aed.base.Pilha;
import aed.app.PedidoDemo;

public final class R19_HeapSort {
    public static final class Ordenacoes {


        // ================= SOLUCAO_PEDIDA_AQUI =================
        /** R19: array[0] ignorado, elementos em 1..n. */
            public static void heapSortBaseUm(int[] a) {
                int n = a.length - 1;
                for (int i = n / 2; i >= 1; i--) descerBaseUm(a, i, n);
                for (int fim = n; fim > 1; fim--) { trocar(a, 1, fim); descerBaseUm(a, 1, fim - 1); }
            }

        // =========== BASE E AUXILIARES NECESSARIOS ==============
        private Ordenacoes() { }

        public static void trocar(int[] a, int i, int j) { int t = a[i]; a[i] = a[j]; a[j] = t; }

        private static void descerBaseUm(int[] a, int pai, int n) {
                while (2 * pai <= n) {
                    int filho = 2 * pai;
                    if (filho < n && a[filho + 1] > a[filho]) filho++;
                    if (a[pai] >= a[filho]) return;
                    trocar(a, pai, filho); pai = filho;
                }
            }
    }
}
