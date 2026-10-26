/*
 * ============================================================================
 * COPIAR, CONSUMIR, REAPROVEITAR E RESTAURAR
 * ============================================================================
 *
 *
 * COPIA RASA DA ESTRUTURA: novos nos, mesmos objetosE. Tirar da copia nao retira
 * da original, mas modificar um Pedido compartilhado pode aparecer nas duas.
 * COPIA PROFUNDA: exige copiar tambem os itens, conforme regra propria.
 * TRANSFERIR NOS: religar celulas existentes e retirar sua propriedade da origem.
 * RESTAURAR POR API: retirar/reinserir pode restaurar itens/ordem, nao identidade
 * de todas as celulas internas.
 *
 * Uma fila auxiliar mantem a ordem. Uma transferencia entre pilhas inverte;
 * duas transferencias restauram. Fila->pilha->fila inverte.
 *
 * AUTOALIAS: outra==this e possivel. Concatenar na mesma fila enquanto a percorre
 * pode criar laco infinito porque o fim cresce. Use snapshot ou rejeite conforme
 * contrato. Concatenacao estrutural O(1) de uma lista nela mesma criaria ciclo.
 *
 * FALHA PARCIAL: subPilha que desempilha antes de descobrir que k excede tamanho
 * pode perder itens ao lancar excecao. A versao do acervo le por cursor; a origem
 * permanece intacta mesmo quando falta quantidade.
 *
 * CONTRATOS REAIS DOS PDFs:
 *   R05: nova lista, preservar ambas.
 *   R07: religar, sem novos nos.
 *   R08: reutilizar nos da segunda metade.
 *   R13: inverter dupla sem novos nos e sem setItem.
 *   R16: transferir em O(1) e esvaziar outra.
 *
 * Uma sequencia impressa corretamente nao prova que os links estao corretos.
 * Depois da operacao, insira/retire de novo e confira os extremos.
 */
