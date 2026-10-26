/*
 * ============================================================================
 * TABELA DE CASOS-BASE E COMBINACOES
 * ============================================================================
 *
 *
 * CONTAR TODOS    null ->0                 1+resultadoDoResto
 * CONTAR IGUAIS   null ->0                 (igual?1:0)+resto
 * EXISTE          null->false/achou->true  repassar resultado
 * QUANTOS ANTES   null->erro/achou->0      1+resto
 * POSICAO         pos0->item              proximo,pos-1; erro se fora
 * MAIOR           ultima celula->item     comparar atual com maiorResto
 * SOMA            null->0.0               valorAtual+somaResto
 * ALGUM           null->false             testeAtual || algumResto
 * TODOS           null->true              testeAtual && todosResto
 * COPIA DE NOS    null->null              new Celula(item,copiaResto)
 * ACAO REVERSA    null->return            rec(proximo); processarAtual
 * MERGESORT       tamanho<=1->return      ordenar metades;intercalar
 *
 * Valor neutro depende da operacao. Soma usa0, produto usa1, maior nao usa0
 * arbitrariamente. Lista vazia em uma consulta de maior normalmente gera erro.
 *
 * COMO PROVAR QUE TERMINA: em uma cadeia ACICLICA, passar proximo reduz numero de
 * nos restantes. No indice, pos diminui. No Merge Sort, metades sao menores.
 * Chamar sempre frente.proximo nao reduz problema. Uma cadeia com ciclo viola a
 * precondicao e pode causar recursao infinita.
 *
 * Recursao profunda pode causar StackOverflowError. Nao presuma otimizacao de
 * recursao de cauda em Java. Nao ha um tamanho universal seguro: depende do ambiente.
 */
