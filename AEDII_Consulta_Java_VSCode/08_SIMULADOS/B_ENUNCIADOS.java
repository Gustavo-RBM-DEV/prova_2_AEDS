/*
 * ============================================================================
 * SIMULADO B - RECURSAO
 * ============================================================================
 *
 *
 * Nao usar lacos nos metodos que exigem recursividade. Respeite assinatura.
 *
 * B1. contarQtos(E item,Celula<E> aux), sem contador adicional. Lista[5,2,5,5],
 * alvo5. Mostre todos os retornos.
 *
 * B2. obterItem(Celula<E> aux,int pos), fila[A,B,C,D],pos2. Mostre parametros de
 * cada chamada e o valor devolvido. Lance se posicao nao existe.
 *
 * B3. obterMaior(Celula<E> aux), apenas esse parametro, lista[-8,-3,-10].
 * Por que inicializar maior em0 estaria errado?
 *
 * B4. Copie cadeia[10,20,30] para uma nova fila em ordem inversa sem modificar
 * original. Enfileire DEPOIS da chamada recursiva. Mostre ordem das acoes.
 *
 * B5. Caso-base null->0 e3 celulas de dados. Compare:
 *   X: return1+contar(proximo);
 *   Y: return contar(proximo);
 *   Z: contar(proximo);return1;
 * Quanto devolve cada versao? O aux das tres chamadas e a mesma variavel?
 */
