/*
 * ============================================================================
 * ONDE CHAMA, ONDE ESPERA E ONDE RECEBE
 * ============================================================================
 *
 *
 * Codigo simplificado DENTRO da classe apropriada:
 *
 *   int contar(Celula<E> aux) {
 *       if (aux == null) return 0;
 *       int resposta = contar(aux.getProximo());
 *       return 1 + resposta;
 *   }
 *
 * Cadeia10->20->null. Os numeros abaixo identificam CELULAS; o argumento nao e
 * um int, e uma referencia Celula<E>.
 *
 * CHAMADA A: aux referencia10
 *   chegou a: int resposta = contar(celula20);
 *   resposta de A ainda nao foi atribuida. A espera.
 *
 *     CHAMADA B: aux referencia20
 *       chegou a: int resposta = contar(null);
 *       resposta de B tambem espera.
 *
 *         CHAMADA C: aux=null
 *           if e verdadeiro. return0 encerra C.
 *
 *     B recebe o0 que C devolveu:
 *       sua linha termina como int resposta=0;
 *       agora executa return1+0, devolve1 e encerra B.
 *
 * A recebe o1 que B devolveu:
 *   sua linha termina como int resposta=1;
 *   agora executa return1+1, devolve2 e encerra A.
 *
 * QUEM CHAMOU A recebe2.
 *
 * Nao sao tres variaveis aux sincronizadas. Sao tres execucoes independentes,
 * cada uma com parametros e locais. A nao reinicia do comeco quando B retorna:
 * retoma precisamente o ponto em que esperava.
 *
 * EXEMPLO EXECUTAVEL: src/aed/app/RecursaoPassoAPasso.java.
 * Nao precisa executa-lo para consultar: este rastro mostra todas as etapas.
 */
