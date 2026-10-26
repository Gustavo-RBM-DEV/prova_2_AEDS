/*
 * ============================================================================
 * R20 - PIVOS, CHAMADAS, TROCAS E COMPARACOES
 * ============================================================================
 *
 * BASE: Revisao R20,pagina5. Conta CADA teste elemento/pivo, inclusive falso.
 * Nao conta testes de indices i<=j. Troca consigo mesmo e exibida.
 *
 *
 * PIVO ULTIMO - TOTAL 33 COMPARACOES
 *
 * Chamada[0,6],profundidade0,pivo20
 * a[0]=3 < 20 -> true
 * a[1]=5 < 20 -> true
 * a[2]=8 < 20 -> true
 * a[3]=11 < 20 -> true
 * a[4]=14 < 20 -> true
 * a[5]=17 < 20 -> true
 * a[6]=20 < 20 -> false
 * a[6]=20 > 20 -> false
 * troca(6,6) -> [3, 5, 8, 11, 14, 17, 20]
 * Comparacoes nesta chamada:8;proximas chamadas:[(0, 5)]
 *
 * Chamada[0,5],profundidade1,pivo17
 * a[0]=3 < 17 -> true
 * a[1]=5 < 17 -> true
 * a[2]=8 < 17 -> true
 * a[3]=11 < 17 -> true
 * a[4]=14 < 17 -> true
 * a[5]=17 < 17 -> false
 * a[5]=17 > 17 -> false
 * troca(5,5) -> [3, 5, 8, 11, 14, 17, 20]
 * Comparacoes nesta chamada:7;proximas chamadas:[(0, 4)]
 *
 * Chamada[0,4],profundidade2,pivo14
 * a[0]=3 < 14 -> true
 * a[1]=5 < 14 -> true
 * a[2]=8 < 14 -> true
 * a[3]=11 < 14 -> true
 * a[4]=14 < 14 -> false
 * a[4]=14 > 14 -> false
 * troca(4,4) -> [3, 5, 8, 11, 14, 17, 20]
 * Comparacoes nesta chamada:6;proximas chamadas:[(0, 3)]
 *
 * Chamada[0,3],profundidade3,pivo11
 * a[0]=3 < 11 -> true
 * a[1]=5 < 11 -> true
 * a[2]=8 < 11 -> true
 * a[3]=11 < 11 -> false
 * a[3]=11 > 11 -> false
 * troca(3,3) -> [3, 5, 8, 11, 14, 17, 20]
 * Comparacoes nesta chamada:5;proximas chamadas:[(0, 2)]
 *
 * Chamada[0,2],profundidade4,pivo8
 * a[0]=3 < 8 -> true
 * a[1]=5 < 8 -> true
 * a[2]=8 < 8 -> false
 * a[2]=8 > 8 -> false
 * troca(2,2) -> [3, 5, 8, 11, 14, 17, 20]
 * Comparacoes nesta chamada:4;proximas chamadas:[(0, 1)]
 *
 * Chamada[0,1],profundidade5,pivo5
 * a[0]=3 < 5 -> true
 * a[1]=5 < 5 -> false
 * a[1]=5 > 5 -> false
 * troca(1,1) -> [3, 5, 8, 11, 14, 17, 20]
 * Comparacoes nesta chamada:3;proximas chamadas:[]
 *
 *
 * PIVO MEIO - TOTAL 16 COMPARACOES
 *
 * Chamada[0,6],profundidade0,pivo11
 * a[0]=3 < 11 -> true
 * a[1]=5 < 11 -> true
 * a[2]=8 < 11 -> true
 * a[3]=11 < 11 -> false
 * a[6]=20 > 11 -> true
 * a[5]=17 > 11 -> true
 * a[4]=14 > 11 -> true
 * a[3]=11 > 11 -> false
 * troca(3,3) -> [3, 5, 8, 11, 14, 17, 20]
 * Comparacoes nesta chamada:8;proximas chamadas:[(0, 2), (4, 6)]
 *
 * Chamada[0,2],profundidade1,pivo5
 * a[0]=3 < 5 -> true
 * a[1]=5 < 5 -> false
 * a[2]=8 > 5 -> true
 * a[1]=5 > 5 -> false
 * troca(1,1) -> [3, 5, 8, 11, 14, 17, 20]
 * Comparacoes nesta chamada:4;proximas chamadas:[]
 *
 * Chamada[4,6],profundidade1,pivo17
 * a[4]=14 < 17 -> true
 * a[5]=17 < 17 -> false
 * a[6]=20 > 17 -> true
 * a[5]=17 > 17 -> false
 * troca(5,5) -> [3, 5, 8, 11, 14, 17, 20]
 * Comparacoes nesta chamada:4;proximas chamadas:[]
 *
 * Ultimo em crescente e sempre extremo: particoes desequilibradas, padrao quadratico.
 * Central funciona equilibrado NESTE vetor. Mediana de tres entre primeiro/meio/ultimo
 * evita o extremo deste exemplo, mas nao garante bom balanceamento para toda entrada.
 */
