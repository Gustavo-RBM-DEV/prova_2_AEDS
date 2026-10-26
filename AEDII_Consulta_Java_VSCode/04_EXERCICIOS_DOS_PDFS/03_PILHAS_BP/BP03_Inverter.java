/*
 * ============================================================================
 * BP03 - Inverter pilha por links ou recursao
 *
 * BASE: Pilhas - AEDs II.pdf, questao 3, pagina 1.
 * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
 *
 * PEDIDO E RACIOCINIO
 * Por links, anterior comeca no fundo. Guarde seguinte antes de virar cada seta.
 * Por API recursiva: retire topo, inverta resto, coloque o salvo no fundo.
 *
 * EXEMPLO / TESTE DE MESA
 * topo[30,20,10] -> topo[10,20,30]; primeiro pop retorna10.
 *
 * CASOS DE BORDA
 * Vazia/unidade; inverter duas vezes; sentinela continua fundo.
 *
 * CUSTO E EFEITOS
 * Links O(n)/O(1). Recursao com inserirFundo O(n^2) tempo/O(n) chamadas.
 *
 * COMO ADAPTAR
 * Uma transferencia entre pilhas inverte; duas restauram. Conte as inversoes.
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

public final class BP03_Inverter {
    public static class Pilha<E> {
        private Celula<E> topo;
        private final Celula<E> fundo;

        // ================= SOLUCAO_PEDIDA_AQUI =================
        public void inverter() {
                Celula<E> anterior = fundo;
                Celula<E> atual = topo;
                while (atual != fundo) {
                    Celula<E> seguinte = atual.getProximo();
                    atual.setProximo(anterior);
                    anterior = atual;
                    atual = seguinte;
                }
                topo = anterior;
            }

        /** Apenas API de pilha. O(n^2) tempo e O(n) chamadas. */
            public void inverterRecursivamente() {
                if (vazia()) return;
                E item = desempilhar();
                inverterRecursivamente();
                inserirFundo(item);
            }

        // =========== BASE E AUXILIARES NECESSARIOS ==============
        public Pilha() { fundo = new Celula<>(); topo = fundo; }

        public boolean vazia() { return topo == fundo; }

        public void empilhar(E item) {
                if (item == null) throw new IllegalArgumentException("Item nulo");
                topo = new Celula<>(item, topo);
            }

        public E consultarTopo() {
                if (vazia()) throw new NoSuchElementException("Pilha vazia");
                return topo.getItem();
            }

        public E desempilhar() {
                E removido = consultarTopo();
                topo = topo.getProximo();
                return removido;
            }

        public int obterNumeroItens() {
                int n = 0;
                for (Celula<E> p = topo; p != fundo; p = p.getProximo()) n++;
                return n;
            }

        private void inserirFundo(E item) {
                if (vazia()) { empilhar(item); return; }
                E salvo = desempilhar();
                inserirFundo(item);
                empilhar(salvo);
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
