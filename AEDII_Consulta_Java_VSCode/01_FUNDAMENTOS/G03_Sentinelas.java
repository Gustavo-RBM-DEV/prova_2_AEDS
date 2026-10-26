/*
 * ============================================================================
 * SENTINELA E ESTADO VAZIO
 * ============================================================================
 *
 *
 *   FILA: frente -> [S] -> [10] -> [20] -> null
 *                                   ^ tras
 *   LISTA: primeiro -> [S] -> [10] -> [20] -> null
 *                                       ^ ultimo
 *   PILHA: topo -> [30] -> [20] -> [S] -> null
 *                                   ^ fundo
 *
 * Cada uma dessas estruturas possui UMA sentinela. Vazia significa que os dois
 * controles referenciam a MESMA sentinela, nao que existam duas sentinelas.
 *
 *   Fila vazia: frente==tras. Primeiro dado: frente.getProximo().
 *   Lista vazia: primeiro==ultimo. Primeiro dado: primeiro.getProximo().
 *   Pilha vazia dos slides: topo==fundo. Primeiro dado: topo.
 *
 * Pilha dos slides deve parar seu percurso em fundo, nao em null, para nao
 * contar a sentinela. Fila/lista com sentinela inicial pulam S e param em null.
 *
 * Ultimo no de dados aponta para null em fila/lista. Na pilha com sentinela
 * inferior, ultimo dado aponta para fundo. A sentinela nao armazena item valido.
 *
 * REMOVER O UNICO ITEM DA FILA:
 *   antes: S->10, frente=S, tras=10
 *   depois: S->null, frente=S, tras=S
 * Se tras continuar no10 removido, a proxima insercao se liga numa cadeia
 * inacessivel a partir de S.
 *
 * VARIANTES: existem fila sem sentinela e fila com sentinela movel. Nao combine
 * construtor de uma convencao com retirar de outra. A revisao mostra Pilha apenas
 * com topo, sem revelar corpo do construtor. O acervo oferece variante SEM
 * sentinela, mas nao afirma que conhece a implementacao omitida da professora.
 */
