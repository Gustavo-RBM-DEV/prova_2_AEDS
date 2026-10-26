/*
 * ============================================================================
 * R03 - Fila com duas pilhas e custo amortizado
 *
 * BASE: Lista_de_Exercicios_Revisao_unidade2_AEDS_II.docx.PDF, questao 3, pagina 2.
 * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
 *
 * PEDIDO E RACIOCINIO
 * Entrada recebe. Saida entrega. Somente quando saida estiver vazia transfira
 * tudo de entrada para saida, invertendo uma vez a ordem.
 *
 * EXEMPLO / TESTE DE MESA
 * enqueue1,2,3:entrada topo[3,2,1]
 * dequeue transfere:saida topo[1,2,3],retira1
 * enqueue4 nao muda saida; proximas retiradas2,3,4.
 *
 * CASOS DE BORDA
 * Vazia; saida com itens e entrada nova; consulta repetida.
 *
 * CUSTO E EFEITOS
 * Pior de uma retirada O(n). Cada item transfere uma vez: O(1) amortizado por operacao.
 *
 * COMO ADAPTAR
 * Transferir sempre, mesmo quando saida nao esta vazia, quebra FIFO ou desperdiça trabalho.
 *
 * ATENCAO AO CONTRATO
 * Use os nomes, a assinatura e as restricoes do template efetivamente entregue na prova.
 *
 * ARQUIVO COMPLETO DE REFERENCIA: src/aed/base/PseudoFila.java
 * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
 * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
 * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
 * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
 * existem no codigo-base. As classes de apoio ficam em src/aed/base.
 *
 * ============================================================================
 */

import aed.base.Celula;
import aed.base.CelulaDupla;
import aed.base.Fila;
import aed.base.Pilha;
import aed.app.PedidoDemo;

public final class R03_PseudoFila {
    public static class PseudoFila<E> {
        private final Pilha<E> entrada = new Pilha<>();
        private final Pilha<E> saida = new Pilha<>();

        // ================= SOLUCAO_PEDIDA_AQUI =================
        public boolean vazia() { return entrada.vazia() && saida.vazia(); }

        public void enfileirar(E item) { entrada.empilhar(item); }

        public E desenfileirar() { prepararSaida(); return saida.desempilhar(); }

        public E consultarInicio() { prepararSaida(); return saida.consultarTopo(); }

        // =========== BASE E AUXILIARES NECESSARIOS ==============
        private void prepararSaida() {
                if (saida.vazia()) while (!entrada.vazia()) saida.empilhar(entrada.desempilhar());
            }
    }
}
