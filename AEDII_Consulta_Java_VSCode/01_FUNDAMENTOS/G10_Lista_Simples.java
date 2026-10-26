/*
 * ============================================================================
 * INSERIR, RETIRAR, LOCALIZAR E CORRIGIR EXTREMOS
 * ============================================================================
 *
 *
 * Intervalo para inserir em n itens:0..n. Intervalo para consultar/remover:0..n-1.
 * A sentinela nao ocupa posicao de dados. Pos0 e primeiro.getProximo().
 *
 * INSERIR DEPOIS DE anterior:
 *   nova.proximo = anterior.proximo;
 *   anterior.proximo = nova;
 *   if (anterior == ultimo) ultimo = nova;
 * Nao troque as duas primeiras linhas sem guardar o antigo sucessor: pode criar
 * um enlace nova->nova ou perder o restante.
 *
 * REMOVER O SUCESSOR:
 *   removida = anterior.proximo;
 *   anterior.proximo = removida.proximo;
 *   if (removida == ultimo) ultimo = anterior;
 *
 * REMOVER TODAS: se remove, anterior fica parado. Seu NOVO sucessor ainda precisa
 * ser testado. Se nao remove, anterior avanca. Isso evita pular repetidos juntos.
 *
 * Consultar por indice percorre O(pos) links. Um for chamando localizar(i) para
 * cada i pode virar O(n^2); uma caminhada de cursor e O(n).
 *
 * Item final impede setItem, mas nao impede trocar ordem de celulas. Para trocar
 * dois nos, trate adjacencia nas duas ordens, identidade e ultimo. Veja BL06.
 *
 * Se template nao tem tamanho, valide posicao durante percurso. Se tem tamanho,
 * atualize-o exatamente uma vez por no inserido/removido.
 */
