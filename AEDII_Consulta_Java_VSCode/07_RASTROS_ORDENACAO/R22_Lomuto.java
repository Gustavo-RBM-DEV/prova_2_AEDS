/*
 * ============================================================================
 * R22 - PASSO A PASSO DO PARTICIONAR
 * ============================================================================
 *
 * BASE: Revisao R22,pagina6. Lomuto, indices0..6.
 * Inicial:[7, 2, 9, 4, 6, 1, 5]
 * j=0: 7 <= 5 -> false
 * j=1: 2 <= 5 -> true
 * troca(0,1) -> [2, 7, 9, 4, 6, 1, 5]
 * j=2: 9 <= 5 -> false
 * j=3: 4 <= 5 -> true
 * troca(1,3) -> [2, 4, 9, 7, 6, 1, 5]
 * j=4: 6 <= 5 -> false
 * j=5: 1 <= 5 -> true
 * troca(2,5) -> [2, 4, 1, 7, 6, 9, 5]
 * troca(3,6) -> [2, 4, 1, 5, 6, 9, 7]
 * Retorno:3, indice final do pivo5.
 * Ha6 comparacoes de elementos no for. Os dois lados ainda nao estao ordenados.
 * Chamadas corretas:esq..p-1 e p+1..dir. Nao reutilizar limites da versao R20.
 */
