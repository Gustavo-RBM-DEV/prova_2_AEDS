/*
 * ============================================================================
 * R21 - Escolha justificada de ordenacao
 *
 * BASE: Lista_de_Exercicios_Revisao_unidade2_AEDS_II.docx.PDF, questao 21, pagina 6.
 * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
 *
 * PEDIDO E RACIOCINIO
 * Escolha pelos requisitos antes de falar em rapidez: estabilidade, memoria,
 * pior caso e acesso sequencial/importancia de indices.
 *
 * EXEMPLO / TESTE DE MESA
 * a) lista encadeada grande: Mergesort, merge sequencial.
 * b) nota preservando nomes empatados: Mergesort estavel, empate pela esquerda.
 * c) O(1) memoria/pior caso nao quadratico: Heapsort iterativo.
 * d) quase ordenado: Insertion, poucos deslocamentos/inversoes.
 *
 * CASOS DE BORDA
 * Quick/heap padroes nao sao estaveis. Insertion tem pior caso quadratico.
 *
 * CUSTO E EFEITOS
 * Merge/heap piorO(nlogn). Insertion O(n+I),I=inversoes; piorO(n^2).
 *
 * COMO ADAPTAR
 * Uma restricao nova pode mudar a resposta. Apresente motivo, nao somente nome.
 *
 * ATENCAO AO CONTRATO
 * Use os nomes, a assinatura e as restricoes do template efetivamente entregue na prova.
 *
 * ============================================================================
 */
