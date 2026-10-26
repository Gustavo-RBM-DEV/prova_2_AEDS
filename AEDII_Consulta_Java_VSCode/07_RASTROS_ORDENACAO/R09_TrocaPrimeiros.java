/*
 * ============================================================================
 * R09 - ORDEM VISIVEL CORRETA PODE ESCONDER FIM ERRADO
 * ============================================================================
 *
 *
 * BASE: Revisao R09,pagina3.
 *
 * Entrada[4,7,1,9]: S->4->7->1->9,fim9
 * Saida:            S->7->4->1->9,fim9. Este caso funciona.
 *
 * Entrada[4,7]:     S->4->7,fim7
 * Codigo errado:   S->7->4,fim7. Ordem inverte, MAS fim continua incorreto.
 * Correto:         S->7->4,fim4.
 *
 * Se inserir9 usando fim errado,7.proximo passa a9 e a celula4 fica perdida.
 *
 * Vazia: a=null e chamar a.getProximo falha.
 * Unitaria: b=null e chamar b.getProximo falha.
 * Duas: exige atualizar fim.
 * Tres ou mais: fim continua no ultimo original.
 *
 * Antes de acessar: se tamanho<2 lance. Depois de trocar: se fim==b,fim=a.
 * Tamanho nao muda. Veja R09_TrocarPrimeiros.java para a solucao.
 */
