/*
 * ============================================================================
 * RETORNO, RESULTADO E EFEITO COLATERAL
 * ============================================================================
 *
 *
 *   int           numero de itens/indice/contagem
 *   boolean       true ou false
 *   double        numero de ponto flutuante
 *   E             referencia ao item armazenado
 *   Celula<E>     referencia ao no, com item e ligacao
 *   Fila<E>       referencia ao objeto fila
 *   void          sem valor devolvido
 *
 * O tipo de retorno NAO define sozinho o padrao de recursao. int pode repassar
 * sem somar; boolean pode combinar com &&/||; E pode selecionar o maior.
 *
 *   return 0;               encerra AGORA devolvendo0
 *   return rec(proximo);     executa filho, espera, repassa resultado
 *   return 1+rec(proximo);   executa filho, espera, soma1, devolve
 *   rec(proximo); return0;   executa filho, DESCARTA resultado e devolve0
 *   return atual;           devolve Celula<E>
 *   return atual.getItem();  devolve E
 *   return;                 encerra sem valor, num metodo void
 *
 * Retornar uma fila nao a copia automaticamente. Novas celulas precisam ter
 * sido criadas pelo metodo. Passar uma fila como parametro tambem nao a copia.
 *
 * O return sai da CHAMADA atual, nao necessariamente do programa inteiro. No
 * recursivo, ele entrega uma resposta a chamada anterior que estava esperando.
 * Throw abandona o fluxo normal com excecao. Uma soma pendente nao e concluida
 * se a chamada filha lanca e a excecao nao e tratada ali.
 */
