/*
 * ============================================================================
 * R20 - Quick pivo final versus central
 *
 * BASE: Lista_de_Exercicios_Revisao_unidade2_AEDS_II.docx.PDF, questao 20, pagina 5.
 * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
 *
 * PEDIDO E RACIOCINIO
 * i avanca ate >=pivo; j ate <=pivo; troque e avance ambos. Recurse em
 * esq..j e i..dir. O VALOR do pivo permanece salvo mesmo apos trocas.
 *
 * EXEMPLO / TESTE DE MESA
 * [3,5,8,11,14,17,20]
 * pivo final:33 testes elemento/pivo; central:16.
 *
 * CASOS DE BORDA
 * Contar testes falsos finais dos whiles; nao contar i<=j como teste de elemento.
 *
 * CUSTO E EFEITOS
 * Equilibrado O(n log n); desequilibrado O(n^2); stack podeO(n).
 *
 * COMO ADAPTAR
 * Mediana de tres evita extremo neste vetor crescente, nao garante melhor caso em toda entrada.
 *
 * ATENCAO AO CONTRATO
 * Rastro exato e chamadas em pasta07/R20_QuickSort.java.
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

public final class R20_QuickSort {
    public static final class Ordenacoes {


        // ================= SOLUCAO_PEDIDA_AQUI =================
        public static void quickSortCentro(int[] a) { quick(a, 0, a.length - 1, false); }

        public static void quickSortUltimo(int[] a) { quick(a, 0, a.length - 1, true); }

        // =========== BASE E AUXILIARES NECESSARIOS ==============
        private Ordenacoes() { }

        public static void trocar(int[] a, int i, int j) { int t = a[i]; a[i] = a[j]; a[j] = t; }

        private static void quick(int[] a, int esq, int dir, boolean ultimo) {
                if (esq >= dir) return;
                int i = esq, j = dir;
                int pivo = a[ultimo ? dir : esq + (dir - esq) / 2];
                while (i <= j) {
                    while (a[i] < pivo) i++;
                    while (a[j] > pivo) j--;
                    if (i <= j) { trocar(a, i, j); i++; j--; }
                }
                if (esq < j) quick(a, esq, j, ultimo);
                if (i < dir) quick(a, i, dir, ultimo);
            }
    }
}
