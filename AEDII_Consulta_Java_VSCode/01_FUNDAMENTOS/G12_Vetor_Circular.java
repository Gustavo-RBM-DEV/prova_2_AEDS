/*
 * ============================================================================
 * PILHA SEQUENCIAL E FILA CIRCULAR
 * ============================================================================
 *
 *
 * PILHA EM VETOR: topo e a primeira posicao livre nesta convencao.
 *   vazio: topo==0
 *   cheio: topo==capacidade
 *   push: itens[topo++]=item
 *   pop: item=itens[--topo]
 * Outra convencao usa topo=-1; nao misture as formulas.
 *
 * FILA CIRCULAR DOS SLIDES reserva uma posicao vazia no vetor:
 *   vazia: frente==tras
 *   cheia: (tras+1)%comprimento==frente
 *   quantidade: (tras-frente+comprimento)%comprimento
 *   enfileirar escreve em tras e avanca tras com modulo
 *   desenfileirar le em frente e avanca frente com modulo
 *
 * Vetor de comprimentoM armazena M-1 dados nessa convencao. Nao confunda esse
 * espaco reservado com uma celula sentinela criada por new Celula.
 *
 * Comprimento4/capacidade3: inserir1,2,3; retirar1; inserir4. A escrita pode voltar
 * ao indice0, mas a ordem logica continua2,3,4. Nao se desloca todo o vetor.
 *
 * Generic arrays: nao usar new E[n]. O exemplo usa Object[] e um cast controlado
 * na retirada. O cast e seguro enquanto a API tipada for respeitada.
 *
 * Teste cheio, vazio, wrap-around repetido, unidade e capacidade minima. Zero
 * pode ser dado valido; quem indica ocupado/vazio sao os controles.
 */
