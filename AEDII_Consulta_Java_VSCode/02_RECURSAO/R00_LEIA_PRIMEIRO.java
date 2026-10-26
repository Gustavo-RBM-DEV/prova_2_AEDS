/*
 * ============================================================================
 * RECURSAO EM QUATRO PERGUNTAS
 * ============================================================================
 *
 *
 * 1. Qual e o significado do retorno desta chamada?
 * 2. Qual e o menor caso que consigo responder sem chamar de novo?
 * 3. Como a proxima chamada recebe um problema MENOR?
 * 4. O que faco com o resultado que ela devolve?
 *
 * Exemplo: contar a partir de aux.
 *   Significado: numero de dados deste trecho.
 *   Base: trecho vazio(null) tem0.
 *   Reducao: aux.getProximo().
 *   Combinacao:1+numero do trecho seguinte.
 *
 * Chamar outro metodo NAO encerra o atual. A chamada atual aguarda o resultado
 * para terminar sua expressao e executar o que vem depois. O return encerra
 * somente essa execucao. Isso tambem acontece entre metodos diferentes, como
 * A chamando B; a recursao apenas usa o mesmo codigo com novos parametros.
 *
 * Nao imagine que a referencia proximo aponta para tras na volta. A volta esta
 * na PILHA DE EXECUCAO: locais e ponto de retomada foram guardados pela JVM.
 * Cada chamada tem seu proprio aux. Mudar o parametro da proxima nao substitui
 * o parametro da anterior.
 *
 * Ordem de estudo: R01_Chamadas -> R02_1Mais -> R03_Boolean -> R04_Objeto ->
 * R05_Void -> R06_CasosBase. Depois abra FF04, FF05, FF10, LF03 e R06 dos PDFs.
 */
