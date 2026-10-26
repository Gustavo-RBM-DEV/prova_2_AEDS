/*
 * ============================================================================
 * CONSTRUTOR, THIS E SOBRECARGA
 * ============================================================================
 *
 *
 * Construtor tem nome da classe e NAO tem retorno nem void. Inicializa o objeto
 * que acabou de ser criado com new.
 *
 *   public Celula() { this(null, null); }
 *   public Celula(E item) { this(item, null); }
 *   public Celula(E item, Celula<E> proximo) {
 *       this.item = item;
 *       this.proximo = proximo;
 *   }
 *
 * Sobrecarga: nomes iguais, parametros diferentes em quantidade/tipos/ordem.
 * Trocar apenas o nome do parametro de item para valor nao cria outra assinatura.
 *
 *   new Celula<>()               seleciona construtor sem parametros
 *   new Celula<>(10)             seleciona construtor com item
 *   new Celula<>(10, topo)       seleciona construtor item+proximo
 *
 * this.item e o atributo do objeto; item e o parametro. this(...) chama outro
 * construtor da MESMA classe; nesta base Java8 precisa ser a primeira instrucao.
 *
 * Fila(E[] itens) chama this() para criar sentinela e depois enfileira os dados.
 * Isso nao cria uma segunda instancia de Fila; inicializa a mesma instancia.
 *
 * ARQUIVOS PARA PRATICAR: FF01, FF02, FF11, LF01 e R17.
 *
 * PEGADINHA de sobrecarga:
 *   lista.remover(2)                     // remover(int): POSICAO2
 *   lista.remover(Integer.valueOf(2))    // remover(E): VALOR2
 * Isso importa quando E e Integer. Em projetos livres, nomes diferentes evitam
 * ambiguidade; na prova, respeite as assinaturas fornecidas.
 */
