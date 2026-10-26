/*
 * ============================================================================
 * R18 - TODAS AS CHAMADAS E INTERCALACOES
 * ============================================================================
 *
 * BASE: Revisao, questao18, pagina5. Indices base0, meio=(esq+dir)/2.
 * Rastro autoral calculado com as regras do enunciado.
 *
 * ARVORE DE CHAMADAS
 * ordenar(0,8) : [29, 14, 37, 8, 21, 3, 45, 16, 11]
 *   ordenar(0,4) : [29, 14, 37, 8, 21]
 *     ordenar(0,2) : [29, 14, 37]
 *       ordenar(0,1) : [29, 14]
 *         ordenar(0,0) : [29]
 *         ordenar(1,1) : [14]
 *       ordenar(2,2) : [37]
 *     ordenar(3,4) : [8, 21]
 *       ordenar(3,3) : [8]
 *       ordenar(4,4) : [21]
 *   ordenar(5,8) : [3, 45, 16, 11]
 *     ordenar(5,6) : [3, 45]
 *       ordenar(5,5) : [3]
 *       ordenar(6,6) : [45]
 *     ordenar(7,8) : [16, 11]
 *       ordenar(7,7) : [16]
 *       ordenar(8,8) : [11]
 *
 * INTERCALAR [0,1]: [29] com [14]
 * 29 <= 14 -> false
 * Resultado: [14, 29]
 * Comparacoes entre candidatos: 1.
 *
 * INTERCALAR [0,2]: [14, 29] com [37]
 * 14 <= 37 -> true
 * 29 <= 37 -> true
 * Resultado: [14, 29, 37]
 * Comparacoes entre candidatos: 2.
 *
 * INTERCALAR [3,4]: [8] com [21]
 * 8 <= 21 -> true
 * Resultado: [8, 21]
 * Comparacoes entre candidatos: 1.
 *
 * INTERCALAR [0,4]: [14, 29, 37] com [8, 21]
 * 14 <= 8 -> false
 * 14 <= 21 -> true
 * 29 <= 21 -> false
 * Resultado: [8, 14, 21, 29, 37]
 * Comparacoes entre candidatos: 3.
 *
 * INTERCALAR [5,6]: [3] com [45]
 * 3 <= 45 -> true
 * Resultado: [3, 45]
 * Comparacoes entre candidatos: 1.
 *
 * INTERCALAR [7,8]: [16] com [11]
 * 16 <= 11 -> false
 * Resultado: [11, 16]
 * Comparacoes entre candidatos: 1.
 *
 * INTERCALAR [5,8]: [3, 45] com [11, 16]
 * 3 <= 11 -> true
 * 45 <= 11 -> false
 * 45 <= 16 -> false
 * Resultado: [3, 11, 16, 45]
 * Comparacoes entre candidatos: 3.
 *
 * INTERCALAR [0,8]: [8, 14, 21, 29, 37] com [3, 11, 16, 45]
 * 8 <= 3 -> false
 * 8 <= 11 -> true
 * 14 <= 11 -> false
 * 14 <= 16 -> true
 * 21 <= 16 -> false
 * 21 <= 45 -> true
 * 29 <= 45 -> true
 * 37 <= 45 -> true
 * Resultado: [3, 8, 11, 14, 16, 21, 29, 37, 45]
 * Comparacoes entre candidatos: 8.
 *
 * Ultima intercalacao:8 comparacoes. Copiar sobras nao compara dois candidatos.
 * O retorno de cada metade precisa acontecer antes do merge do pai.
 */
