/*
 * ============================================================================
 * BP01 - Concatenar pilhas com ordem declarada
 *
 * BASE: Pilhas - AEDs II.pdf, questao 1, pagina 1.
 * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
 *
 * PEDIDO E RACIOCINIO
 * Adotamos final como fim da sequencia topo->fundo. Copie outra, encontre ultimo
 * dado de this e anexe os itens da copia mantendo a ordem. Nao anexe a sentinela alheia.
 *
 * EXEMPLO / TESTE DE MESA
 * Topo A=[3,2], topo B=[9,8] -> topo A=[3,2,9,8]; B intacta.
 *
 * CASOS DE BORDA
 * Vazias; unidade; autoalias; fim precisa apontar para fundo de A.
 *
 * CUSTO E EFEITOS
 * O(n+m) tempo/O(m) auxiliar e celulas.
 *
 * COMO ADAPTAR
 * Se final significar empilhar sobre o topo, a ordem muda; desenhe antes.
 *
 * ATENCAO AO CONTRATO
 * A palavra final e ambigua na folha. Esta ficha declara sua convencao.
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

public final class BP01_Concatenar {
    public static class Pilha<E> {
        private Celula<E> topo;
        private final Celula<E> fundo;

        // ================= SOLUCAO_PEDIDA_AQUI =================
        /** Convencao: topo[A,B] + topo[C,D] = topo[A,B,C,D]. Preserva outra. */
            public void concatenar(Pilha<E> outra) {
                if (outra == null) throw new IllegalArgumentException("Pilha nula");
                Pilha<E> copia = outra.copiar();
                Celula<E> anterior = fundo;
                for (Celula<E> p = topo; p != fundo; p = p.getProximo()) anterior = p;
                while (!copia.vazia()) {
                    Celula<E> nova = new Celula<>(copia.desempilhar(), fundo);
                    if (anterior == fundo) topo = nova;
                    else anterior.setProximo(nova);
                    anterior = nova;
                }
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

        public Pilha<E> copiar() { return subPilha(obterNumeroItens()); }

        /** Conveniencia do acervo para testes; nao assumir que existe no template. */
            public Object[] toArray() {
                Object[] a = new Object[obterNumeroItens()];
                int i = 0;
                for (Celula<E> p = topo; p != fundo; p = p.getProximo()) a[i++] = p.getItem();
                return a;
            }
    }
}
