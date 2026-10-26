/*
 * ============================================================================
 * APP: QUEM DECLARA, QUEM CHAMA, QUEM RETORNA
 * ============================================================================
 *
 *
 * 1. App declara static Fila<Pedido> filaPedidos=new Fila<>(); fora dos metodos.
 * 2. FinalizarPedido enfileira os pedidos nessa MESMA fila.
 * 3. App cria Function/Predicate, com condicao fixa ou parametro vindo do usuario.
 * 4. Chama filaPedidos.calcularValorMedio(extrator,k) ou filtrar(condicao,k).
 * 5. Fila percorre celulas e entrega aux.getItem() para apply/test.
 *
 * Function NAO adivinha preco: a lambda define exatamente o codigo executado.
 *   Function<Pedido,Double> extrator=p->p.valorFinal();
 * Predicate NAO le teclado: a App pode ler minimo e captura-lo na lambda.
 *   Predicate<Pedido> condicao=p->p.valorFinal()>=minimo;
 *
 * Os nomes dos parametros da Fila nao precisam ser iguais aos nomes na App.
 * condicao na App pode ser condicional dentro de Fila: valor da referencia foi
 * passado, nao o nome da variavel.
 *
 * E item=aux.getItem(); valor=extrator.apply(item) e equivalente a aplicar direto
 * extrator.apply(aux.getItem()). A variavel intermediaria so torna o tipo visivel.
 *
 * O recorte de media fornecido especifica os primeiros quantidade. Parte do texto
 * do filtro estava cortada; o acervo adota quantidade de EXAMINADOS e explicita
 * isso. Sempre compare com o enunciado integral entregue na prova.
 *
 * A01_AppCompleta.java mostra uma demo realmente compilavel. Fonte reutilizavel
 * original:src/aed/app/AppPedidos.java. Nao precisa de navegador nem produtos.txt.
 */
