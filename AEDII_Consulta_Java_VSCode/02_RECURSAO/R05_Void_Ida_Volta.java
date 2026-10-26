/*
 * ============================================================================
 * ACAO ANTES E DEPOIS DA CHAMADA
 * ============================================================================
 *
 *
 *   void mostrar(Celula<E> atual) {
 *       if (atual==null) return;
 *       println("ENTRA "+atual.getItem());
 *       mostrar(atual.getProximo());
 *       println("SAI "+atual.getItem());
 *   }
 *
 * Cadeia10,20,30 produz:
 *   ENTRA10
 *   ENTRA20
 *   ENTRA30
 *   SAI30
 *   SAI20
 *   SAI10
 *
 * A instrucao anterior a chamada acontece na ida. A posterior espera o resto
 * terminar e acontece na volta. Cada execucao conserva sua referencia atual.
 *
 * Para copiar na ordem original:
 *   destino.enfileirar(atual.getItem());
 *   copiar(proximo,destino);
 *
 * Para copiar em ordem inversa:
 *   copiar(proximo,destino);
 *   destino.enfileirar(atual.getItem());
 *
 * Passar destino como argumento em cada chamada nao cria novas filas. Cada
 * parametro recebe uma copia da referencia para o MESMO objeto destino.
 *
 * return; encerra a chamada void sem devolver valor. Ainda assim quem a chamou
 * continua apos ela terminar. Nao confunda 'nao devolver valor' com 'nao voltar'.
 */
