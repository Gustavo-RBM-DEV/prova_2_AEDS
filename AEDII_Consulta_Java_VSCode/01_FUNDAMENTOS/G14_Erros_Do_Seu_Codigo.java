/*
 * ============================================================================
 * DIAGNOSTICO DOS ERROS MAIS IMPORTANTES
 * ============================================================================
 *
 *
 * 1) throws IllegalArgumentException(...) no corpo: errado. Use throw new ...;
 *    throws declara excecoes na assinatura, nao dispara uma excecao.
 * 2) Codigo depois de throw no mesmo ramo: inalcancavel; feche o if antes.
 * 3) Constructor com frente=tras=null e enfileirar que usa tras.setProximo:
 *    mistura fila sem sentinela com operacao que espera sentinela.
 * 4) Declarar Pilha<Pedido> nova dentro de finalizarPedido: cria pilha vazia nova
 *    a cada finalizacao; use a estrutura compartilhada ou recebida por parametro.
 * 5) Declarar o mesmo atributo pilhaPedidos duas vezes: nome duplicado na classe.
 * 6) subPilha(int numItens) dentro da CHAMADA: errado; chamada usa subPilha(numItens).
 * 7) for i<=itens.length: ultimo indice e length-1; use i<length.
 * 8) Vetor de pedidos parcialmente ocupado: verificar itens[i]!=null antes de usar.
 * 9) aux=frente.proximo dentro do while: reinicia todo passo. Declare antes.
 * 10) Nao incrementar contador ou aux: laco infinito.
 * 11) Chamar desempilhar(item): a sua assinatura desempilhar() nao recebe item.
 * 12) Desempilhar e depois topo=topo.proximo: pula dois nos.
 * 13) apply(item) sem guardar resultado: numero foi calculado e descartado.
 * 14) Retornar soma em metodo de media: faltou dividir por quantidade valida.
 * 15) return1+... em metodo Celula<E>: resultado numerico nao combina com referencia.
 * 16) Recursao usando frente.proximo sempre: nao progride; use atual.proximo.
 * 17) Remover ultimo sem atualizar tras/fim/ultimo: proxima insercao corrompe cadeia.
 * 18) private frente acessado pela App: visibilidade errada. Use metodos publicos.
 * 19) Metodo declarado com parametro chamado sem argumento: assinatura nao bate.
 * 20) Usar helper que nao foi fornecido/implementado: cannot find symbol.
 *
 * Classifique: erro de COMPILACAO, EXCECAO de execucao, LOGICA ou CONTRATO.
 * Uma solucao pode produzir o vetor certo e ainda violar a proibicao de lacos,
 * colecoes prontas ou novos nos. Leia as restricoes antes de escolher algoritmo.
 */
