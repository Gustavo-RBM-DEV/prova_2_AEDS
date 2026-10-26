/*
 * ============================================================================
 * VARIAVEL, OBJETO E REFERENCIA
 * ============================================================================
 *
 *
 * ABRA QUANDO: nao souber se topo e uma variavel ou uma celula.
 *
 * Celula<Integer> topo; declara uma variavel. Ela guarda uma referencia, nao um
 * numero da pilha. new Celula<>(30) cria um objeto. topo = esseObjeto faz topo
 * referenciar aquela celula. O campo item da celula guarda o Integer30.
 *
 *   topo ---------> CELULA A
 *                   item ------------> Integer 30
 *                   proximo ---------> CELULA B
 *
 * Duas variaveis podem conter a mesma referencia:
 *   Celula<Integer> aux = topo;
 *
 * Nao foi criada uma segunda celula. aux e topo passam a referenciar A.
 * Agora execute:
 *   aux = aux.getProximo();
 *
 * Somente aux passa a referenciar B. topo continua em A. A atribuicao COPIA um
 * valor de referencia; nao cria um vinculo permanente entre os nomes.
 *
 * Compare:
 *   aux = nova;                 // muda o valor da variavel local aux
 *   topo = nova;                // muda a referencia do atributo topo
 *   aux.setProximo(nova);       // altera um campo do objeto referenciado por aux
 *   E item = aux.getItem();     // le o item; nao remove nem anda na estrutura
 *
 * Java passa argumentos por valor. Para objetos, esse valor e a referencia.
 * Reatribuir um parametro nao reatribui a variavel de quem chamou. Modificar um
 * objeto atraves dessa referencia pode ser observado por outros que o referenciam.
 *
 * Null NAO e uma celula vazia. Null significa ausencia de referencia. Uma
 * sentinela criada por new Celula<>() existe mesmo tendo item null.
 *
 * TESTE: a aponta para celula10; b=a; a=new Celula<>(20).
 * Resultado: b continua na celula10. Nao acompanha a nova atribuicao a a.
 */
