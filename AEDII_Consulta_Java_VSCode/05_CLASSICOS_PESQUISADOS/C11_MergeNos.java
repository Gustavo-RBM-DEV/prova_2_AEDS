/*
 * ============================================================================
 * C11 - Intercalar cadeias reaproveitando nos
 *
 * BASE: LeetCode21: https://leetcode.com/problems/merge-two-sorted-lists/
 * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
 *
 * PEDIDO E RACIOCINIO
 * Ligue fim do resultado ao menor no candidato, avance origem correspondente.
 * Ao acabar uma, anexe o restante da outra sem copiar todos os dados.
 *
 * EXEMPLO / TESTE DE MESA
 * [1,4,7] e[2,5,8] ->[1,2,4,5,7,8].
 *
 * CASOS DE BORDA
 * Vazias;empates;cadeias devem ser DISJUNTAS.
 *
 * CUSTO E EFEITOS
 * O(n+m) tempo/O(1) auxiliar; altera links das entradas.
 *
 * COMO ADAPTAR
 * Diferente de R05, que exige preservar ambas e criar novos nos.
 *
 * ATENCAO AO CONTRATO
 * Adaptacao autoral para as classes do curso. Nao e evidencia de que caira na prova.
 *
 * ARQUIVO COMPLETO DE REFERENCIA: src/aed/classicos/Classicos.java
 * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
 * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
 * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
 * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
 * existem no codigo-base. As classes de apoio ficam em src/aed/base.
 *
 * ============================================================================
 */

import aed.base.Celula;
import aed.base.Fila;
import aed.base.Pilha;
import java.text.Normalizer;
import java.util.Locale;
import aed.base.CelulaDupla;
import aed.app.PedidoDemo;

public final class C11_MergeNos {
    public static final class Classicos {


        // ================= SOLUCAO_PEDIDA_AQUI =================
        /** Consome ligacoes. Entradas devem ser disjuntas e ordenadas. */
            public static <E extends Comparable<E>> Celula<E> intercalarNos(Celula<E> a, Celula<E> b) {
                Celula<E> s = new Celula<>(), fim = s;
                while (a != null && b != null) {
                    if (a.getItem().compareTo(b.getItem()) <= 0) { fim.setProximo(a); a = a.getProximo(); }
                    else { fim.setProximo(b); b = b.getProximo(); }
                    fim = fim.getProximo();
                }
                fim.setProximo(a != null ? a : b);
                return s.getProximo();
            }

        // =========== BASE E AUXILIARES NECESSARIOS ==============
        private Classicos() { }
    }
}
