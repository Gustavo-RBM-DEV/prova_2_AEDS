/*
 * ============================================================================
 * LER NAO EXIGE EXECUTAR
 * ============================================================================
 *
 *
 * Para CONSULTAR: abra os arquivos no VS Code. Nada precisa ser instalado.
 * Guias que contem somente comentarios nao possuem main e nao precisam executar.
 *
 * Para EXECUTAR, quando houver JDK:
 *   java -version
 *   javac -version
 * O acervo usa sintaxe/APIs compativeis com Java8 ou superior.
 *
 * Windows PowerShell, no terminal da PASTA RAIZ:
 *   $fontes = Get-ChildItem -Recurse -Filter *.java | ForEach-Object FullName
 *   javac -encoding UTF-8 -d out $fontes
 *   java -cp out aed.testes.Testes
 *
 * macOS/Linux, na PASTA RAIZ:
 *   find . -name '*.java' > fontes.txt
 *   javac -encoding UTF-8 -d out @fontes.txt
 *   java -cp out aed.testes.Testes
 *
 * Esses comandos geram temporariamente fontes.txt/out no seu computador. O ZIP
 * entregue contem APENAS.java. Nao precisa fazer isso para ler durante a prova.
 *
 * DEMOS:
 *   java -cp out aed.app.AppPedidos
 *   java -cp out aed.app.AppPedidos --interativo
 *   java -cp out aed.app.RecursaoPassoAPasso
 *
 * O fonte central tem package e fica em src/aed. Preserve suas pastas. As fichas
 * fora de src usam nomes unicos e classes internas, para compilar tudo junto.
 * Nao coloque Fila de aed.base e Fila de aed.revisao no mesmo pacote: sao variantes.
 *
 * Se extensao Java do VS Code nao reconhecer automaticamente as pastas como um
 * projeto, isso nao impede ler os arquivos. A compilacao direta pelos comandos
 * acima considera todos os fontes, sem Maven, Gradle ou extensoes extras.
 *
 * javac nao encontrado = JDK/PATH do ambiente, nao erro do seu algoritmo.
 * Could not find main class = classpath/pacote errado ou compilacao nao feita.
 * cannot find symbol = nome/import/helper ausente.
 * StackOverflowError = recursao sem progresso ou profunda demais.
 */
