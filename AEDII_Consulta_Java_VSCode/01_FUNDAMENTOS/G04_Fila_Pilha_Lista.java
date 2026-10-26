/*
 * ============================================================================
 * QUEM ENTRA, QUEM SAI E QUEM MUDA
 * ============================================================================
 *
 *
 * FILA (FIFO): enfileira no final, desenfileira do inicio. Chegou10,20,30: sai10.
 * PILHA (LIFO): insere e remove no topo. Empilhou10,20,30: sai30.
 * LISTA: permite inserir/remover/consultar em posicoes diversas.
 *
 * Vetor tem acesso direto por indice; lista encadeada precisa seguir links.
 * O numero10 guardado nao e necessariamente posicao10: o primeiro dado tem pos0.
 *
 * ENFILEIRAR:
 *   nova = new Celula<>(item);
 *   tras.setProximo(nova);
 *   tras = nova;
 * A sentinela permanece a mesma. Quando vazia, tras era a propria sentinela.
 *
 * DESENFILEIRAR (apos verificar vazio):
 *   removida = frente.getProximo();
 *   frente.setProximo(removida.getProximo());
 *   if (removida == tras) tras = frente;
 *   return removida.getItem();
 *
 * DESEMPILHAR (apos verificar vazio):
 *   E item = topo.getItem();
 *   topo = topo.getProximo();
 *   return item;
 *
 * Se chamou desempilhar/desenfileirar, a referencia JA foi ajustada pelo metodo.
 * Avancar topo/frente de novo faz pular um elemento. getItem sozinho nao remove.
 *
 * Consulta deve preservar estrutura; retirada modifica. Copiar e transferir sao
 * contratos diferentes, mesmo que os valores impressos parecam iguais.
 */
