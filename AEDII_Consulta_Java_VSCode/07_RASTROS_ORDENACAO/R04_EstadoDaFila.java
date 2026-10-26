/*
 * ============================================================================
 * R04 - O QUE ACONTECE QUANDO TRAS NAO E ATUALIZADO
 * ============================================================================
 *
 *
 * BASE: Revisao R04,paginas2-3. Usando EXATAMENTE a retirada defeituosa.
 *
 * Inicial              frente->S->null;tras=S
 * Enfileirar5          frente->S->5->null;tras=5
 * Enfileirar8          frente->S->5->8->null;tras=8
 * Desenfileirar5       frente->S->8->null;tras=8
 * Enfileirar2          frente->S->8->2->null;tras=2
 * Desenfileirar8       frente->S->2->null;tras=2
 * Desenfileirar2       frente->S->null;tras=2 FORA DA CADEIA
 * Enfileirar7          frente->S->null
 *                     cadeia separada2->7->null;tras=7
 *
 * Proxima retirada: frente!=tras, logo vazia() responde false indevidamente.
 * removida=frente.getProximo() recebe null. removida.getProximo() gera
 * NullPointerException. O7 existe mas nao e alcancavel a partir da sentinela.
 *
 * Correcao: se removida==tras, tras=frente. Nao troque frente por null: ela deve
 * continuar referenciando a sentinela. Veja a ficha R04_CorrigirTras.java.
 */
