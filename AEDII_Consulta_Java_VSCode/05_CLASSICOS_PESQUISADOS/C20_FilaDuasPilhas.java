/*
 * ============================================================================
 * C20 - Fila por duas pilhas
 *
 * BASE: HackerRank Queue using Two Stacks: https://www.hackerrank.com/challenges/queue-using-two-stacks/problem
 * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
 *
 * PEDIDO E RACIOCINIO
 * Mesma estrutura de R03. A plataforma pede interpretar comandos de entrada;
 * aqui isolamos a implementacao da fila e mantemos nomes do curso.
 *
 * EXEMPLO / TESTE DE MESA
 * inserir1,2;retirar1;inserir3;retirar2;retirar3.
 *
 * CASOS DE BORDA
 * Entrada nova quando saida ainda possui itens;vazia;consultas repetidas.
 *
 * CUSTO E EFEITOS
 * O(1) amortizado; retirada individual podeO(n).
 *
 * COMO ADAPTAR
 * Nomes push/pop/peek da plataforma foram adaptados a empilhar/desempilhar/consultar.
 *
 * ATENCAO AO CONTRATO
 * Adaptacao autoral para as classes do curso. Nao e evidencia de que caira na prova.
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

public final class C20_FilaDuasPilhas {
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
