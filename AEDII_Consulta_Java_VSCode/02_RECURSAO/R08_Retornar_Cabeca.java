/*
 * ============================================================================
 * QUANDO A RECURSAO DEVOLVE UMA CELULA
 * ============================================================================
 *
 *
 *   Celula<E> copiar(Celula<E> atual) {
 *       if (atual==null) return null;
 *       Celula<E> resto=copiar(atual.getProximo());
 *       return new Celula<>(atual.getItem(),resto);
 *   }
 *
 * A ultima chamada devolve null. A anterior cria o ultimo no novo. A anterior
 * cria no ligado a esse ultimo. O retorno final e a cabeca da cadeia nova.
 *
 * Remover todos por recursao pode devolver OUTRA cabeca:
 *   resto=removerTodos(atual.proximo,alvo)
 *   se atual combina: devolva resto
 *   senao: atual.proximo=resto; devolva atual
 *
 * O wrapper da estrutura precisa guardar essa cabeca:
 *   sentinela.setProximo(retorno);
 * E atualizar tamanho/fim. O retorno isolado nao muda automaticamente os campos
 * do objeto Lista que o chamou. Ignorar retorno pode manter a cabeca removida.
 *
 * Codigos compilaveis: src/aed/variacoes/ModelosRecursivos.java.
 */
