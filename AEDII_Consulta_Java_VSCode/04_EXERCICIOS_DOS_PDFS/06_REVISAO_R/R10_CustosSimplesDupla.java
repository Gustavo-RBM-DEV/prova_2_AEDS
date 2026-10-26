/*
 * ============================================================================
 * R10 - Tabela de custos simples versus dupla
 *
 * BASE: Lista_de_Exercicios_Revisao_unidade2_AEDS_II.docx.PDF, questao 10, pagina 4.
 * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
 *
 * PEDIDO E RACIOCINIO
 * A dupla guarda predecessor em cada no. Na simples, ter fim nao entrega
 * o predecessor de fim. Memoria extra: uma referencia anterior por no.
 *
 * EXEMPLO / TESTE DE MESA
 * OPERACAO                 SIMPLES                   DUPLA
 * Inserir final            O(1)                      O(1)
 * Remover final            O(n)                      O(1)
 * Remover no conhecido     O(n)                      O(1)
 * Inserir antes de no      O(n)                      O(1)
 * Percorrer reverso        O(n) com stack O(n)       O(n),auxO(1)
 *                         O(n^2) buscando predecessores sem auxiliar
 *
 * CASOS DE BORDA
 * No conhecido deve ser valido, pertencer a lista e nao ser sentinela.
 *
 * CUSTO E EFEITOS
 * Dupla: O(n) referencias adicionais; mais setas precisam ser mantidas por alteracao.
 *
 * COMO ADAPTAR
 * O custo de percurso reverso na simples depende da memoria permitida. Declare a hipotese.
 *
 * ATENCAO AO CONTRATO
 * A sentinela simplifica inicio ao fornecer predecessor real. Item final impede truques de copiar sucessor.
 *
 * ============================================================================
 */
