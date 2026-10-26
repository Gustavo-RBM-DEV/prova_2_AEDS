/*
 * ============================================================================
 * IGUALDADE LOGICA, IDENTIDADE E ORDENACAO
 * ============================================================================
 *
 *
 *   aux == fim                    Mesma celula? Identidade.
 *   item.equals(procurado)        Iguais conforme contrato da classe?
 *   item.compareTo(outro) < 0     Vem antes na ordem natural?
 *   item.compareTo(outro) == 0    Empate para essa ordenacao?
 *   item.compareTo(outro) > 0     Vem depois?
 *
 * CompareTo pode devolver qualquer negativo/positivo, nao apenas-1/1.
 * Use o sinal, nao compare ==1 para significar maior.
 *
 * Em inteiros use Integer.compare(a,b), nao a-b, que pode sofrer overflow.
 * Equals/hashCode: iguais por equals precisam ter mesmo hashCode; hashCodes
 * iguais nao provam igualdade. O projeto de comercio usava ID como hashCode:
 * isso e uma convencao daquele projeto, nao um algoritmo universal de busca.
 *
 * Se Pedido.compareTo compara ID, ordenar Pedido ordena por ID, nao por preco.
 * O criterio de um Predicate/Function nao altera o compareTo da classe.
 *
 * O acervo principal rejeita null como DADO. Assim, depois de pular S e testar
 * aux!=null, aux.getItem().equals(alvo) nao tenta chamar equals na sentinela.
 * Permitir null requer contrato diferente e comparacao protegida.
 *
 * ESTABILIDADE: empatados conservam a ordem relativa anterior. No merge, escolher
 * a metade esquerda no empate com <= mantem estabilidade. Heap/Quick comuns
 * nao sao estaveis. Ordenar notas estavelmente conserva nomes ja ordenados nos
 * empates, como em R21.
 */
