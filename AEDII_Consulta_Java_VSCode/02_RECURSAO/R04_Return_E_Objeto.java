/*
 * ============================================================================
 * RETORNANDO O ITEM OU O MAIOR
 * ============================================================================
 *
 *
 * OBTER ITEM POR POSICAO:
 *   base pos0 -> retorna atual.getItem()
 *   passo -> retorna obterItem(atual.getProximo(),pos-1)
 *
 * (A,2)->(B,1)->(C,0). C devolve seu item. B e A repassam esse MESMO item.
 * Se E=Pedido, devolvem uma referencia para Pedido, nao o preco e nao a Celula.
 *
 * MAIOR:
 *   base ultima celula -> item dessa celula
 *   maiorResto = obterMaior(atual.getProximo())
 *   compare atual.item com maiorResto
 *   devolva o maior dos dois
 *
 * Exemplo[10,40,20]:20 retorna20;40 ganha e retorna40;10 perde e retorna40.
 * Exemplo[-8,-3,-10]:resposta-3. Inicializar maior com0 estaria errado, pois0 nao
 * esta na lista e e maior que todos os dados.
 *
 * compareTo devolve int que representa a COMPARACAO. O metodo obterMaior deve
 * retornar E, portanto retorna item atual ou maiorResto, nao o int do compareTo.
 *
 * Wrapper sem parametros verifica lista vazia e comeca no primeiro dado. Isso
 * permite manter a assinatura recursiva restrita a uma Celula<E>.
 */
