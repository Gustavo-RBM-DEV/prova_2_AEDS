/*
 * ============================================================================
 * RETORNANDO TRUE/FALSE
 * ============================================================================
 *
 *
 *   boolean contem(E alvo,Celula<E> atual) {
 *       if (atual==null) return false;
 *       if (atual.getItem().equals(alvo)) return true;
 *       return contem(alvo,atual.getProximo());
 *   }
 *
 * 10 chama20;20 chama30;30 acha o alvo e retorna true.
 * 20 estava esperando o resultado de contem(30): recebeu true e repassa true.
 * 10 recebe true da chamada20 e repassa true a App. Nao soma numeros.
 *
 * BOOLEAN PODE COMBINAR:
 *   algum: testeAtual || algum(resto)
 *   todos: testeAtual && todos(resto)
 *
 * Caso vazio de algum=false; de todos=true (nao existe contraexemplo). O curto
 * circuito pode evitar visitar o resto: || para no primeiro true, && no primeiro
 * false. Essas escolhas devem seguir o contrato solicitado.
 *
 * Nao escrever return1+contem(...): boolean nao participa dessa soma.
 * A recursividade vem de chamar o mesmo metodo, nao da presenca de1+.
 */
