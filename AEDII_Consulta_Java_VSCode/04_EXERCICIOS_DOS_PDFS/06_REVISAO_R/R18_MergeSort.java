/*
 * ============================================================================
 * R18 - Arvore e ultima intercalacao do Mergesort
 *
 * BASE: Lista_de_Exercicios_Revisao_unidade2_AEDS_II.docx.PDF, questao 18, pagina 5.
 * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
 *
 * PEDIDO E RACIOCINIO
 * Divida intervalos fechados em meio=(esq+dir)/2. Ordene metades e intercale
 * usando dois indices. Testes entre candidatos contam; copiar sobras nao.
 *
 * EXEMPLO / TESTE DE MESA
 * [29,14,37,8,21,3,45,16,11]
 * ultima: [8,14,21,29,37] com [3,11,16,45]
 * resultado[3,8,11,14,16,21,29,37,45];8 comparacoes finais.
 *
 * CASOS DE BORDA
 * 0/1 base; esquerda com item extra; empate escolhe esquerda.
 *
 * CUSTO E EFEITOS
 * O(n log n) tempo/O(n) auxiliar no vetor; O(log n) chamadas.
 *
 * COMO ADAPTAR
 * Rastro de TODAS divisoes/mesclagens na pasta07, arquivo R18_MergeSort.java.
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

public final class R18_MergeSort {
    public static final class Ordenacoes {


        // ================= SOLUCAO_PEDIDA_AQUI =================
        public static void mergeSort(int[] a) { mergeSort(a, new int[a.length], 0, a.length - 1); }

        private static void mergeSort(int[] a, int[] aux, int esq, int dir) {
                if (esq >= dir) return;
                int meio = esq + (dir - esq) / 2;
                mergeSort(a, aux, esq, meio); mergeSort(a, aux, meio + 1, dir);
                int i = esq, j = meio + 1, k = esq;
                while (i <= meio && j <= dir) aux[k++] = a[i] <= a[j] ? a[i++] : a[j++];
                while (i <= meio) aux[k++] = a[i++];
                while (j <= dir) aux[k++] = a[j++];
                for (k = esq; k <= dir; k++) a[k] = aux[k];
            }

        // =========== BASE E AUXILIARES NECESSARIOS ==============
        private Ordenacoes() { }
    }
}
