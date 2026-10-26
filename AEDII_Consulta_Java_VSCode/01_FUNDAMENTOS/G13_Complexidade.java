/*
 * ============================================================================
 * CUSTOS PARA JUSTIFICAR E NAO SO DECORAR
 * ============================================================================
 *
 *
 * Suposicao: comparar dois itens tem custoO(1). Textos/objetos grandes podem
 * acrescentar o custo de equals/compareTo.
 *
 *   push/pop e enqueue/dequeue com controles: O(1)
 *   buscar/contar sem contador armazenado: O(n)
 *   localizar indice na encadeada: O(pos+1)
 *   inverter ligacoes: O(n) tempo/O(1) auxiliar
 *   copiar n celulas: O(n) tempo/O(n) resultado
 *   remover todos em uma passagem: O(n)/O(1)
 *   intercalar duas ordenadas: O(n+m)
 *   remover final simples: O(n); dupla:O(1)
 *   concatenar dupla transferindo nos:O(1)
 *
 * Recursao conta memoria: n chamadas pendentes custam O(n) stack. Nao ter
 * new Pilha no codigo nao significa O(1) de memoria auxiliar.
 *
 * PseudoFila: um dequeue pode transferir n itens e custar O(n). Em muitas
 * operacoes, cada item e transferido uma vez: custo amortizado O(1). Isso nao
 * significa que toda chamada isolada seja constante.
 *
 * MergeSort O(nlogn) garantido. HeapSort iterativo O(nlogn) garantido/O(1) extra.
 * QuickSort pode O(n^2) e stackO(n); particoes equilibradas daoO(nlogn).
 * Insertion quase ordenado custaO(n+I),I=numero de inversoes; piorO(n^2).
 * Selection sempre percorre comparacoes quadraticas. Bubble com parada cedo e
 * linear na entrada ja ordenada, mas quadratico no pior caso.
 *
 * A revisao R23 usa merge que copia nos: alocacoes TOTAIS O(nlogn), enquanto
 * memoria viva auxiliar pode ser O(n), alem de stackO(logn).
 */
