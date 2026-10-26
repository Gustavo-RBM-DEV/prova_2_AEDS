/*
 * ============================================================================
 * DIFERENCAS ENTRE OS TEMPLATES
 * ============================================================================
 *
 *
 * Os nove PDFs nao mostram exatamente a mesma classe.
 *
 * Slides: fila frente/tras; lista primeiro/ultimo; pilha topo/fundo sentinela.
 * Revisao: fila/lista inicio/fim; lista tem tamanho. R04 usa frente/tras novamente.
 * Pilha da revisao mostra so topo e corpos omitidos: nao supor automaticamente a
 * mesma sentinela dos slides. O acervo oferece as duas variantes separadas.
 *
 * Item de Celula e final na revisao. BL06 sugere retirar final para trocar itens.
 * Nossa solucao principal troca nos por religacao e nao depende de setItem.
 *
 * FF10 fixa quantosAfrente(Celula<E> atual,E item), nesta ordem. R01 fixa
 * obterItem(Celula<E> aux,int pos) e pede wrapper obterItem(int pos).
 *
 * Algumas questoes deixam ordem/preservacao ambiguas. As fichas declaram escolhas:
 * BP01 final=sequencia topo->fundo; FF02 fila segue topo->fundo e restaura pilha;
 * FF06 altera a fila recebida; FF07 retorna copia invertida; LF08 segue o exemplo
 * de alternancia this invertida/outra invertida.
 *
 * Tamanho aparece dentro do desenho de CelulaDupla e tambem da ListaDupla na
 * revisao. A contagem usada nas solucoes pertence a lista; nao depende de tamanho
 * em cada celula. Um template inicial de Lista Flexivel usa nome desenfileirar
 * para remover por posicao; adapte para o nome realmente presente no arquivo.
 *
 * Contratos null/quantidade que nao aparecem no recorte foram escolhidos e
 * identificados. Nao atribua essas escolhas como regra universal da professora.
 *
 * Os algoritmos nao usam ArrayList, LinkedList, java.util.Stack ou Collections.sort.
 * Function/Predicate, excecoes, Scanner e Random dos testes nao sao colecoes.
 */
