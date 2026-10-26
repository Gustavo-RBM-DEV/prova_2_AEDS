/*
 * ============================================================================
 * QUANDO HA DUAS CHAMADAS RECURSIVAS
 * ============================================================================
 *
 *
 * Merge Sort nao visita somente proximo: divide em duas partes menores.
 *   if (tamanho<=1) return;
 *   direita=dividirAoMeio();
 *   this.ordenar();
 *   direita.ordenar();
 *   resultado=intercalarOrdenadas(direita);
 *
 * A chamada da esquerda termina inteira antes de comecar a da direita nessa
 * ordem de codigo. Somente depois das DUAS prontas a intercalacao acontece.
 * Nao ha execucao paralela automatica.
 *
 * Quick Sort primeiro particiona e depois chama os subintervalos. Lomuto retorna
 * indice final do pivo e usa esq..p-1,p+1..dir. A versao de dois cursores do PDF
 * usa esq..j e i..dir. Os esquemas nao sao intercambiaveis.
 *
 * Heap Sort nao precisa ser inteiro recursivo. A reorganizacao do heap pode ser
 * implementada iterativamente (como no acervo) ou recursivamente. Pilha de chamadas
 * nao e a estrutura heap: stack e heap sao conceitos diferentes.
 */
