/*
 * ============================================================================
 * R22 - Particionar nao e ordenar
 *
 * BASE: Lista_de_Exercicios_Revisao_unidade2_AEDS_II.docx.PDF, questao 22, pagina 6.
 * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
 *
 * PEDIDO E RACIOCINIO
 * Ultimo e pivo. i encerra prefixo<=pivo; j percorre antes do pivo. Ao
 * final troque pivo para i+1. O retorno e POSICAO final do pivo.
 *
 * EXEMPLO / TESTE DE MESA
 * [7,2,9,4,6,1,5] ->[2,4,1,5,6,9,7],retorna3.
 *
 * CASOS DE BORDA
 * Lados ainda nao ordenados; recursao exclui p:esq..p-1,p+1..dir.
 *
 * CUSTO E EFEITOS
 * ParticaoO(n). Quick piorO(n^2) em crescente/inverso/todosiguais com <=.
 *
 * COMO ADAPTAR
 * Nao misture os limites desta versao com R20. Rastro pasta07/R22_Lomuto.java.
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

public final class R22_Lomuto {
    public static final class Ordenacoes {


        // ================= SOLUCAO_PEDIDA_AQUI =================
        public static int particionar(int[] a, int esq, int dir) {
                int pivo = a[dir], i = esq - 1;
                for (int j = esq; j < dir; j++) if (a[j] <= pivo) trocar(a, ++i, j);
                trocar(a, i + 1, dir); return i + 1;
            }

        public static void quickSortLomuto(int[] a) { lomuto(a, 0, a.length - 1); }

        // =========== BASE E AUXILIARES NECESSARIOS ==============
        private Ordenacoes() { }

        public static void trocar(int[] a, int i, int j) { int t = a[i]; a[i] = a[j]; a[j] = t; }

        private static void lomuto(int[] a, int e, int d) {
                if (e >= d) return;
                int p = particionar(a, e, d);
                lomuto(a, e, p - 1); lomuto(a, p + 1, d);
            }
    }
}
