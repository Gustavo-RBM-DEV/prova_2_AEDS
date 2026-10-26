/*
 * ============================================================================
 * RELATO DOS TESTES DESTA EDICAO
 * ============================================================================
 *
 * EDICAO SOMENTE JAVA - 25/10/2026
 *
 * Arquivos .java no pacote final: 190.
 * As fichas, os guias e os indices tambem sao arquivos Java. Nao ha HTML/PDF/MD,
 * JSON/JAR/imagens/scripts ou arquivos.class dentro da entrega.
 *
 * VERIFICACAO EXECUTADA
 * Compilador: javac21.0.12.1, com --release8 e encodingUTF-8.
 * Execucao: JVM disponivel21. Nao foi testado em uma JVM8 separada.
 * Todos os fontes centrais e fichas com implementacao foram compilados JUNTOS.
 * Os arquivos apenas de comentarios tambem sao unidades Java validas e nao
 * precisam de main para serem lidos.
 *
 * Saida real da suite aed.testes.Testes:
 *   OK: 348458 verificacoes passaram.
 *   Testes incluem vazio, unidade, duplicatas, limites, alias, preservacao e
 *   identidade de celulas.
 *
 * Uma verificacao/assertion nao e necessariamente um problema independente:
 * inclui comparacao de cada item de vetores e repeticoes sobre varias entradas.
 * A suite enumera os3280 vetores de comprimento0..7 com valores-1,0,1, compara
 * as ordenacoes com InsertionSort e verifica ordem/multiplicidades da referencia.
 * Tambem inclui200 vetores pseudoaleatorios e300 listas para Mergesort com sementes
 * fixas. Identidade de nos e conferida em rotacoes, divisao e lista dupla.
 *
 * Outros testes: filas/pilhas/listas, vazio/unico, extremos, reutilizacao depois
 * de esvaziar, autoalias, copias, igualdade, preservacao, funcao/predicado, consultas
 * recursivas, modelos de retornos, variantes circulares/sem sentinela e classicos.
 * Reflexao e usada SOMENTE nos testes para verificar identidade, nao nos algoritmos.
 *
 * Rastros R18/R19/R20/R22 foram calculados e conferidos com as entradas exatas
 * fornecidas. R20 registra33 comparacoes com pivo final e16 com pivo central, contando
 * os testes falsos de encerramento dos whiles como exige o texto da revisao.
 *
 * LIMITES
 * Testar nao e prova formal para todas as entradas. Estruturas assumem cadeias
 * validas/aciclicas salvo metodos especificos de ciclo. Recursao muito profunda
 * pode causar StackOverflowError. Callbacks nao devem modificar a propria fila
 * durante o percurso. Dados null sao rejeitados nas estruturas principais, salvo
 * as posicoes ignoradas pelo construtor de array, conforme contrato descrito.
 *
 * Nao foi recompilado o projeto original completo do comercio: arquivos de
 * Produto/ItemDePedido e dados externos nao vieram completos como projeto.
 * A demo PedidoDemo/AppPedidos e independente e foi executada.
 * Nao foi executado Windows neste ambiente Linux. A leitura no VS Code nao
 * exige compilar nada; os comandos opcionais estao em00_COMECE_AQUI.
 *
 * As fontes centrais sao reutilizaveis. As fichas espelham os mesmos corpos em
 * classes internas com dependencias, para a consulta ser autocontida. Na prova,
 * a embalagem da ficha deve ser removida e o metodo adaptado ao template correto.
 * Nao se afirma que todo fragmento de exemplo comentado pode ser colado isolado
 * sem imports, atributos ou auxiliares. Nao e gabarito oficial nem previsao.
 */
