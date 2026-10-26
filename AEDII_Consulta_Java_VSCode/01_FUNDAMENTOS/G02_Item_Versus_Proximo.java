/*
 * ============================================================================
 * O CAMPO ITEM E O CAMPO PROXIMO
 * ============================================================================
 *
 *
 * ABRA QUANDO: confundir aux, aux.getItem() e aux.getProximo().
 *
 *   tipo de aux                 Celula<E>
 *   tipo de aux.getItem()       E
 *   tipo de aux.getProximo()    Celula<E>
 *
 * Se E=Pedido, item referencia um Pedido. Proximo referencia OUTRA celula,
 * nao outro Pedido diretamente. O Pedido pode possuir preco, data e produtos;
 * nenhuma dessas informacoes e descoberta automaticamente pela celula.
 *
 *   Celula<Pedido> aux = frente.getProximo();
 *   Pedido pedido = aux.getItem();
 *   double valor = pedido.valorFinal();
 *
 * Navegar nao e alterar:
 *   aux.getProximo();           // calcula/devolve a referencia; ignora resultado
 *   aux = aux.getProximo();     // guarda essa referencia em aux; agora anda
 *
 * Insercao no topo:
 *   Celula<E> nova = new Celula<>(item, topo);
 *   topo = nova;
 *
 * O construtor recebe a referencia da CELULA que topo apontava. Nao recebe um
 * endereco especial da variavel topo. nova.proximo conserva a referencia antiga
 * mesmo depois de topo ser reatribuido.
 *
 * Se item e final, nao pode ser substituido depois da construcao. Isso nao torna
 * necessariamente o objeto E imutavel: um Pedido pode continuar permitindo
 * alteracoes em seus proprios campos.
 */
