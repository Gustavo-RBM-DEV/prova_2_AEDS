/*
 * ============================================================================
 * R19 - VETOR E ARVORE APOS AS TROCAS
 * ============================================================================
 *
 * BASE: Revisao R19,pagina5. Array tratado de1..n, slot0 ignorado.
 * Representacao em niveis da arvore: filhos de i sao2*i e2*i+1.
 * Inicial:[12, 7, 25, 3, 18, 30, 9, 14]
 *   nivel 0: 12
 *   nivel 1: 7 25
 *   nivel 2: 3 18 30 9
 *   nivel 3: 14
 *
 * CONSTRUCAO BOTTOM-UP
 *
 * Reorganizar no 4
 * restaurar: troca(4,8) -> vetor [12, 7, 25, 14, 18, 30, 9, 3]
 *   nivel 0: 12
 *   nivel 1: 7 25
 *   nivel 2: 14 18 30 9
 *   nivel 3: 3
 *
 * Reorganizar no 3
 * restaurar: troca(3,6) -> vetor [12, 7, 30, 14, 18, 25, 9, 3]
 *   nivel 0: 12
 *   nivel 1: 7 30
 *   nivel 2: 14 18 25 9
 *   nivel 3: 3
 *
 * Reorganizar no 2
 * restaurar: troca(2,5) -> vetor [12, 18, 30, 14, 7, 25, 9, 3]
 *   nivel 0: 12
 *   nivel 1: 18 30
 *   nivel 2: 14 7 25 9
 *   nivel 3: 3
 *
 * Reorganizar no 1
 * restaurar: troca(1,3) -> vetor [30, 18, 12, 14, 7, 25, 9, 3]
 *   nivel 0: 30
 *   nivel 1: 18 12
 *   nivel 2: 14 7 25 9
 *   nivel 3: 3
 * restaurar: troca(3,6) -> vetor [30, 18, 25, 14, 7, 12, 9, 3]
 *   nivel 0: 30
 *   nivel 1: 18 25
 *   nivel 2: 14 7 12 9
 *   nivel 3: 3
 *
 * Maxheap final:[30, 18, 25, 14, 7, 12, 9, 3]
 *
 * FASE DE ORDENACAO: cada troca e registrada
 *
 * Fixar posicao 8
 * maior para final: troca(1,8) -> vetor [3, 18, 25, 14, 7, 12, 9, 30]
 *   nivel 0: 3
 *   nivel 1: 18 25
 *   nivel 2: 14 7 12 9
 * restaurar: troca(1,3) -> vetor [25, 18, 3, 14, 7, 12, 9, 30]
 *   nivel 0: 25
 *   nivel 1: 18 3
 *   nivel 2: 14 7 12 9
 * restaurar: troca(3,6) -> vetor [25, 18, 12, 14, 7, 3, 9, 30]
 *   nivel 0: 25
 *   nivel 1: 18 12
 *   nivel 2: 14 7 3 9
 * Heap ativo:[25, 18, 12, 14, 7, 3, 9] | Sufixo fixado:[30]
 *
 * Fixar posicao 7
 * maior para final: troca(1,7) -> vetor [9, 18, 12, 14, 7, 3, 25, 30]
 *   nivel 0: 9
 *   nivel 1: 18 12
 *   nivel 2: 14 7 3
 * restaurar: troca(1,2) -> vetor [18, 9, 12, 14, 7, 3, 25, 30]
 *   nivel 0: 18
 *   nivel 1: 9 12
 *   nivel 2: 14 7 3
 * restaurar: troca(2,4) -> vetor [18, 14, 12, 9, 7, 3, 25, 30]
 *   nivel 0: 18
 *   nivel 1: 14 12
 *   nivel 2: 9 7 3
 * Heap ativo:[18, 14, 12, 9, 7, 3] | Sufixo fixado:[25, 30]
 *
 * Fixar posicao 6
 * maior para final: troca(1,6) -> vetor [3, 14, 12, 9, 7, 18, 25, 30]
 *   nivel 0: 3
 *   nivel 1: 14 12
 *   nivel 2: 9 7
 * restaurar: troca(1,2) -> vetor [14, 3, 12, 9, 7, 18, 25, 30]
 *   nivel 0: 14
 *   nivel 1: 3 12
 *   nivel 2: 9 7
 * restaurar: troca(2,4) -> vetor [14, 9, 12, 3, 7, 18, 25, 30]
 *   nivel 0: 14
 *   nivel 1: 9 12
 *   nivel 2: 3 7
 * Heap ativo:[14, 9, 12, 3, 7] | Sufixo fixado:[18, 25, 30]
 *
 * Fixar posicao 5
 * maior para final: troca(1,5) -> vetor [7, 9, 12, 3, 14, 18, 25, 30]
 *   nivel 0: 7
 *   nivel 1: 9 12
 *   nivel 2: 3
 * restaurar: troca(1,3) -> vetor [12, 9, 7, 3, 14, 18, 25, 30]
 *   nivel 0: 12
 *   nivel 1: 9 7
 *   nivel 2: 3
 * Heap ativo:[12, 9, 7, 3] | Sufixo fixado:[14, 18, 25, 30]
 *
 * Fixar posicao 4
 * maior para final: troca(1,4) -> vetor [3, 9, 7, 12, 14, 18, 25, 30]
 *   nivel 0: 3
 *   nivel 1: 9 7
 * restaurar: troca(1,2) -> vetor [9, 3, 7, 12, 14, 18, 25, 30]
 *   nivel 0: 9
 *   nivel 1: 3 7
 * Heap ativo:[9, 3, 7] | Sufixo fixado:[12, 14, 18, 25, 30]
 *
 * Fixar posicao 3
 * maior para final: troca(1,3) -> vetor [7, 3, 9, 12, 14, 18, 25, 30]
 *   nivel 0: 7
 *   nivel 1: 3
 * Heap ativo:[7, 3] | Sufixo fixado:[9, 12, 14, 18, 25, 30]
 *
 * Fixar posicao 2
 * maior para final: troca(1,2) -> vetor [3, 7, 9, 12, 14, 18, 25, 30]
 *   nivel 0: 3
 * Heap ativo:[3] | Sufixo fixado:[7, 9, 12, 14, 18, 25, 30]
 *
 * Vetor final:[3, 7, 9, 12, 14, 18, 25, 30]
 */
