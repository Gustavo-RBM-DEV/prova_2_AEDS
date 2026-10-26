/*
 * ============================================================================
 * BP02 - Contar pilha com fundo sentinela
 *
 * BASE: Pilhas - AEDs II.pdf, questao 2, pagina 1.
 * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
 *
 * PEDIDO E RACIOCINIO
 * Comece em topo e pare em fundo. O fundo e um objeto real; parar somente em
 * null pode contar a sentinela.
 *
 * EXEMPLO / TESTE DE MESA
 * topo->30->20->10->S->null:3 dados.
 *
 * CASOS DE BORDA
 * topo==fundo retorna0; unidade1; sentinela nao e item.
 *
 * CUSTO E EFEITOS
 * Iterativa O(n)/O(1); recursiva O(n)/O(n).
 *
 * COMO ADAPTAR
 * Na pilha SEM sentinela a parada correta e null, nao fundo.
 *
 * ATENCAO AO CONTRATO
 * Use os nomes, a assinatura e as restricoes do template efetivamente entregue na prova.
 *
 * ARQUIVO COMPLETO DE REFERENCIA: src/aed/base/Pilha.java
 * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
 * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
 * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
 * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
 * existem no codigo-base. As classes de apoio ficam em src/aed/base.
 *
 * ============================================================================
 */

import java.util.NoSuchElementException;
import aed.base.Celula;
import aed.base.CelulaDupla;
import aed.base.Fila;
import aed.base.Pilha;
import aed.app.PedidoDemo;

public final class BP02_Contar {
    public static class Pilha<E> {
        private Celula<E> topo;
        private final Celula<E> fundo;

        // ================= SOLUCAO_PEDIDA_AQUI =================
        public int obterNumeroItens() {
                int n = 0;
                for (Celula<E> p = topo; p != fundo; p = p.getProximo()) n++;
                return n;
            }

        public int contarRecursivo() { return contarRecursivo(topo); }

        private int contarRecursivo(Celula<E> atual) {
                if (atual == fundo) return 0;
                return 1 + contarRecursivo(atual.getProximo());
            }

        // =========== BASE E AUXILIARES NECESSARIOS ==============
        public Pilha() { fundo = new Celula<>(); topo = fundo; }

        public boolean vazia() { return topo == fundo; }

        public void empilhar(E item) {
                if (item == null) throw new IllegalArgumentException("Item nulo");
                topo = new Celula<>(item, topo);
            }

        /** Conveniencia do acervo para testes; nao assumir que existe no template. */
            public Object[] toArray() {
                Object[] a = new Object[obterNumeroItens()];
                int i = 0;
                for (Celula<E> p = topo; p != fundo; p = p.getProximo()) a[i++] = p.getItem();
                return a;
            }
    }
}
