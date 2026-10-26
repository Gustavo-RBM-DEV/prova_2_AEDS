/*
 * ============================================================================
 * 1+ NAO E UMA INSTRUCAO ESPECIAL DE RECURSAO
 * ============================================================================
 *
 *
 *   return 1 + contar(atual.getProximo());
 *
 * E equivalente a:
 *   int resto = contar(atual.getProximo());
 *   return 1 + resto;
 *
 * O1 e a contribuicao da celula atual. A chamada seguinte produz o numero do
 * resto. A soma e concluida so depois que esse numero existe.
 *
 * QuantosAfrente em10->20->30, buscando30:
 *   30 retorna0: o alvo nao conta.
 *   20 recebe0 e devolve1+0=1.
 *   10 recebe1 e devolve1+1=2.
 *
 * Se usar return rec(proximo), todos apenas repassam o0. Resultado0.
 * Se usar return5+rec(proximo), duas celulas anteriores somam5+5, resultado10.
 * Se chamar rec(proximo);return1;, as chamadas acontecem mas o resultado do filho
 * e descartado; a resposta da chamada inicial sera1, nao a quantidade de nos.
 *
 * A contribuicao poderia ser o valor de um extrator, e nao1:
 *   return extrator.apply(atual.getItem()) + soma(proximo);
 *
 * Cuidado com ausencia=-1. Se somar1 em cima de-1, vira0 e parece que encontrou
 * na primeira posicao. Propague o marcador sem somar ou use excecao conforme pedido.
 */
