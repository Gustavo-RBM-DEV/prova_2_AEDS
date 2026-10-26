/*
 * ============================================================================
 * P15 - Subpilha mantendo ordem e original
 *
 * BASE: Extensao autoral dos padroes da disciplina.
 * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
 *
 * PEDIDO E RACIOCINIO
 * Leitura por cursor preserva original; duas transferencias conservam ordem.
 *
 * EXEMPLO / TESTE DE MESA
 * topo[30,20,10],k2 ->topo[30,20].
 *
 * CASOS DE BORDA
 * k0;negativo;insuficiente sem perder dados.
 *
 * CUSTO E EFEITOS
 * O(k) tempo/memoria.
 *
 * COMO ADAPTAR
 * Confirme a assinatura permitida. Estes metodos extras nao substituem assinaturas fixas dos PDFs.
 *
 * ATENCAO AO CONTRATO
 * Modelos de cadeia recebem primeiro DADO, nao sentinela. Retorno de cabeca exige atualizar controles da estrutura no wrapper.
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

public final class P15_SubPilha {
    public static class Pilha<E> {
        private Celula<E> topo;
        private final Celula<E> fundo;

        // ================= SOLUCAO_PEDIDA_AQUI =================
        /** Copia celulas; nao clona profundamente os objetos E. Preserva this. */
            public Pilha<E> subPilha(int numItens) {
                if (numItens < 0) throw new IllegalArgumentException("Quantidade negativa");
                Celula<E> aux = topo;
                Pilha<E> inversa = new Pilha<>();
                for (int i = 0; i < numItens; i++) {
                    if (aux == fundo) throw new IllegalArgumentException("Itens insuficientes");
                    inversa.empilhar(aux.getItem());
                    aux = aux.getProximo();
                }
                Pilha<E> resultado = new Pilha<>();
                while (!inversa.vazia()) resultado.empilhar(inversa.desempilhar());
                return resultado;
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

        /** Conveniencia do acervo para testes; nao assumir que existe no template. */
            public Object[] toArray() {
                Object[] a = new Object[obterNumeroItens()];
                int i = 0;
                for (Celula<E> p = topo; p != fundo; p = p.getProximo()) a[i++] = p.getItem();
                return a;
            }
    }
}
