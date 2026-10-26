/*
 * ============================================================================
 * DUAS SETAS, UMA SENTINELA INICIAL
 * ============================================================================
 *
 *
 *   inicio->[S]<->[A]<->[B]<->[C]<-fim
 *   S.anterior=null              C.proximo=null
 *
 * Inserir entre anterior e seguinte muda quatro ligacoes:
 *   nova.anterior=anterior; nova.proximo=seguinte;
 *   anterior.proximo=nova; se seguinte existe, seguinte.anterior=nova.
 * Se nao existe seguinte, atualize fim. Tamanho sobe1.
 *
 * Retirar no conhecido e O(1): o no conhece seu anterior. Atualize a seta do
 * predecessor e a do sucessor. Se nao ha sucessor, predecessor vira fim.
 * Retirar ultimo na simples e O(n) porque nao ha acesso direto ao predecessor.
 *
 * Inverter R13 nao pode incluir a sentinela na inversao nem alterar os itens.
 * Guarde antigoPrimeiro/antigoFim e o proximo original a cada passo. Vire os
 * links dos dados, depois S.proximo=antigoFim e fim=antigoPrimeiro.
 *
 * Palindromo: compare primeiro/ultimo e avance para o centro. Fazer tamanho/2
 * comparacoes funciona para pares/impares. Lista vazia e palindromo no enunciado.
 *
 * Concatenar R16: fimA.proximo=primeiroB; primeiroB.anterior=fimA; adote fimB.
 * Esvazie os controles de B. Deixar B ainda ligada a seus dados cria duas listas
 * compartilhando a mesma cadeia e pode causar corrupcao futura.
 */
