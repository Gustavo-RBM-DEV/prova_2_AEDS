/*
 * ============================================================================
 * LEMBRETES ANTES DE ESCREVER O CODIGO
 * ============================================================================
 *
 *
 * TIPOS: aux e Celula<E>; aux.getItem() e E; aux.getProximo() e Celula<E>.
 * Atribuir uma referencia nao cria acompanhamento automatico entre variaveis.
 *
 * FILA: frente e S, primeiro dado frente.proximo, ultimo tras, vazio frente==tras.
 * PILHA dos slides: primeiro dado topo, fim sentinela fundo, vazio topo==fundo.
 * LISTA: primeiro/inicio e S; ultimo/fim e ultimo dado; pos0 depois de S.
 * DUPLA: S.anterior=null;fim.proximo=null;primeiroDado.anterior=S.
 *
 * PERDAS DE REFERENCIA
 * Antes de religar atual.proximo, salve o proximo original se ainda vai usa-lo.
 * Ao remover todos, anterior nao avanca no ramo que remove.
 * Ao remover unico, restaure extremo final para S.
 * Ao inverter, antigo primeiro vira ultimo.
 *
 * RECURSAO
 * contar:null->0;return1+rec(proximo).
 * contem:null->false;achou->true;senao return rec(proximo).
 * quantos antes:achou->0;null->excecao;return1+rec(proximo).
 * obter pos:pos0->item;rec(proximo,pos-1);invalida->excecao.
 * maior:ultima celula->item;compare atual com maiorResto.
 * Acao antes da chamada:ordem original;depois:ordem reversa.
 *
 * Nao ha uma 'referencia que volta': a pilha de chamadas guarda execucoes pendentes.
 * return1+f(...) espera f devolver, soma1 e termina a chamada atual.
 * return f(...) espera e repassa. f(...);return0 descarta o filho e devolve0.
 *
 * COMPARAR
 * == entre celulas testa identidade. equals testa igualdade dos itens.
 * compareTo<0/==0/>0 testa ordem. Resultado nao precisa ser exatamente-1/1.
 * new Fila cria estrutura NOVA E VAZIA. Passar fila como argumento nao a clona.
 *
 * FUNCTION/PREDICATE
 * App define:p->p.valorFinal() ou p->p.valorFinal()>=minimo.
 * Fila aplica:extrator.apply(item),condicao.test(item).
 * Quantidade no filtro deste acervo=EXAMINADOS,nao APROVADOS.
 * Media exige quantidade>0. Soma precisa usar o retorno de apply.
 *
 * TESTES MINIMOS
 * Vazio;um;dois;muitos;primeiro;ultimo;ausente;repetidos juntos;todosiguais;
 * k0;kexato;kinvalido;outra==this;origem preservada;inserir apos esvaziar.
 *
 * LEIA O CONTRATO
 * Pode usar laco? Pode criar no? Pode destruir entrada? Precisa ser estavel?
 * Pode acrescentar parametro? Qual assinatura? Existe helper que voce quer chamar?
 * Sair com valores certos mas violar uma dessas restricoes ainda pode estar errado.
 */
