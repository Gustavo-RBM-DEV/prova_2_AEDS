/*
 * ============================================================================
 * C19 - Minimo em tempo constante
 *
 * BASE: LeetCode155: https://leetcode.com/problems/min-stack/
 * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
 *
 * PEDIDO E RACIOCINIO
 * Use uma pilha de dados e outra dos minimos. Empilhe novo minimo quando
 * valor<=minimo atual, inclusive empates. Ao retirar esse valor, retire um minimo.
 *
 * EXEMPLO / TESTE DE MESA
 * push3,push1,push1;pop1 ->minimo ainda1;pop1 ->minimo3.
 *
 * CASOS DE BORDA
 * Minimos repetidos;primeiro;vazia;consulta sem remover.
 *
 * CUSTO E EFEITOS
 * O(1) por operacao/O(n) memoria.
 *
 * COMO ADAPTAR
 * Usar somente < em vez de <= perde informacao sobre minimos duplicados.
 *
 * ATENCAO AO CONTRATO
 * Adaptacao autoral para as classes do curso. Nao e evidencia de que caira na prova.
 *
 * ARQUIVO COMPLETO DE REFERENCIA: src/aed/classicos/PilhaMinima.java
 * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
 * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
 * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
 * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
 * existem no codigo-base. As classes de apoio ficam em src/aed/base.
 *
 * ============================================================================
 */

import aed.base.Pilha;
import aed.base.Celula;
import aed.base.CelulaDupla;
import aed.base.Fila;
import aed.app.PedidoDemo;

public final class C19_PilhaMinima {
    public static class PilhaMinima<E extends Comparable<E>> {
        private final Pilha<E> dados = new Pilha<>();
        private final Pilha<E> minimos = new Pilha<>();

        // ================= SOLUCAO_PEDIDA_AQUI =================
        public void empilhar(E item) {
                dados.empilhar(item);
                if (minimos.vazia() || item.compareTo(minimos.consultarTopo()) <= 0) minimos.empilhar(item);
            }

        public E desempilhar() {
                E item = dados.desempilhar();
                if (item.compareTo(minimos.consultarTopo()) == 0) minimos.desempilhar();
                return item;
            }

        public E consultarTopo() { return dados.consultarTopo(); }

        public E minimo() { return minimos.consultarTopo(); }

        // =========== BASE E AUXILIARES NECESSARIOS ==============
        public boolean vazia() { return dados.vazia(); }
    }
}
