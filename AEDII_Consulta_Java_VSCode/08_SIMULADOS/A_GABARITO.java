/*
 * ============================================================================
 * GABARITO COMENTADO A
 * ============================================================================
 *
 *
 * A1. Cursor depois de S, enfileirar em outra. Copia fica[4,9] apos retirada;
 * original[8,4,9]. Novas celulas, mesmos E. Arquivos BF05_Copiar/FF12_Copiar.
 *
 * A2. Resultado[2,3],true,tamanho2. Mantenha anterior parado depois de remover:
 * assim o segundo7 consecutivo nao e pulado. Arquivo LF11_RemoverTodos.
 *
 * A3. Topo antes40,30,20,10; depois10,20,30,40. Pop retorna10. Anterior inicial
 * na inversao deve ser fundo, nao null. Arquivo BP03_Inverter.
 *
 * A4. Examina12,5,18. Resultado[12,18].30 nao foi examinado. Chamada:
 *   Fila<Integer> r=fila.filtrar(n->n>=10,3);
 * O metodo conta EXAMINADOS. Arquivo A03_FiltroPredicate.
 *
 * A5. (80+250)/2=165. Dobro tem media330. Chamada ilustrativa com Pedido:
 *   fila.calcularValorMedio(p->p.valorFinal()*2,2);
 * Function define qual numero extrair; Fila define a caminhada e a media.
 * Arquivo A02_MediaFunction. Nao dividir por quantidade0.
 */
