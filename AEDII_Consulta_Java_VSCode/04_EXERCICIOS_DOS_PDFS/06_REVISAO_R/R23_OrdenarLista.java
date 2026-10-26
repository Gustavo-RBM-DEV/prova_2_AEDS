/*
 * ============================================================================
 * R23 - Mergesort recursivo da lista
 *
 * BASE: Lista_de_Exercicios_Revisao_unidade2_AEDS_II.docx.PDF, questao 23, pagina 6.
 * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
 *
 * PEDIDO E RACIOCINIO
 * Base tamanho<=1. Divida em duas, ordene THIS e direita, intercale em
 * nova lista e adote seus campos. this=ordenada nao e atribuicao permitida em Java.
 *
 * EXEMPLO / TESTE DE MESA
 * [4,1,3,2] ->metades[4,1]/[3,2] ->[1,4]/[2,3] ->[1,2,3,4].
 *
 * CASOS DE BORDA
 * Vazia/unidade; impar/par; empates; crescente/inversa.
 *
 * CUSTO E EFEITOS
 * T(n)=T(ceil(n/2))+T(floor(n/2))+Theta(n)=Theta(nlogn).
 * Memoria viva auxiliar O(n), stackO(logn); alocacoes totais O(nlogn) no merge copiador.
 *
 * COMO ADAPTAR
 * Merge por religacao economiza alocacoes, mas R05 exige copia preservando entradas.
 *
 * ATENCAO AO CONTRATO
 * Usa dividirAoMeio(R08) e intercalarOrdenadas(R05). Funcoes incluidas como dependencias abaixo.
 *
 * ARQUIVO COMPLETO DE REFERENCIA: src/aed/revisao/Lista.java
 * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
 * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
 * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
 * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
 * existem no codigo-base. As classes de apoio ficam em src/aed/base.
 *
 * ============================================================================
 */

import aed.base.Celula;
import java.util.NoSuchElementException;
import aed.base.CelulaDupla;
import aed.base.Fila;
import aed.base.Pilha;
import aed.app.PedidoDemo;

public final class R23_OrdenarLista {
    public static class Lista<E extends Comparable<E>> {
        private Celula<E> inicio;
        private Celula<E> fim;
        private int tamanho;

        // ================= SOLUCAO_PEDIDA_AQUI =================
        public void ordenar() {
                if (tamanho <= 1) return;
                Lista<E> direita = dividirAoMeio();
                this.ordenar(); direita.ordenar();
                Lista<E> ordenada = intercalarOrdenadas(direita);
                inicio = ordenada.inicio; fim = ordenada.fim; tamanho = ordenada.tamanho;
            }

        // =========== BASE E AUXILIARES NECESSARIOS ==============
        public Lista() { inicio = new Celula<>(); fim = inicio; }

        /** LF01: copia via API publica; entradas ficam na mesma ordem. */
            public Lista(aed.base.Fila<E> a, aed.base.Fila<E> b) {
                this();
                if (a == null || b == null) throw new IllegalArgumentException("Fila nula");
                aed.base.Fila<E> ca = copiarPorAPI(a), cb = copiarPorAPI(b);
                E x = ca.vazia() ? null : ca.desenfileirar();
                E y = cb.vazia() ? null : cb.desenfileirar();
                while (x != null && y != null) {
                    if (x.compareTo(y) <= 0) {
                        inserirFinal(x); x = ca.vazia() ? null : ca.desenfileirar();
                    } else {
                        inserirFinal(y); y = cb.vazia() ? null : cb.desenfileirar();
                    }
                }
                if (x != null) inserirFinal(x);
                if (y != null) inserirFinal(y);
                while (!ca.vazia()) inserirFinal(ca.desenfileirar());
                while (!cb.vazia()) inserirFinal(cb.desenfileirar());
            }

        private aed.base.Fila<E> copiarPorAPI(aed.base.Fila<E> fila) {
                aed.base.Fila<E> copia = new aed.base.Fila<>(), auxiliar = new aed.base.Fila<>();
                while (!fila.vazia()) {
                    E e = fila.desenfileirar(); copia.enfileirar(e); auxiliar.enfileirar(e);
                }
                while (!auxiliar.vazia()) fila.enfileirar(auxiliar.desenfileirar());
                return copia;
            }

        public boolean vazia() { return inicio == fim; }

        public void inserirFinal(E novo) {
                if (novo == null) throw new IllegalArgumentException("Item nulo");
                Celula<E> c = new Celula<>(novo);
                fim.setProximo(c); fim = c; tamanho++;
            }

        public Lista<E> intercalarOrdenadas(Lista<E> outra) {
                if (outra == null) throw new IllegalArgumentException("Lista nula");
                Lista<E> nova = new Lista<>();
                Celula<E> a = inicio.getProximo(), b = outra.inicio.getProximo();
                while (a != null && b != null) {
                    if (a.getItem().compareTo(b.getItem()) <= 0) {
                        nova.inserirFinal(a.getItem()); a = a.getProximo();
                    } else { nova.inserirFinal(b.getItem()); b = b.getProximo(); }
                }
                while (a != null) { nova.inserirFinal(a.getItem()); a = a.getProximo(); }
                while (b != null) { nova.inserirFinal(b.getItem()); b = b.getProximo(); }
                return nova;
            }

        public Lista<E> dividirAoMeio() {
                Lista<E> outra = new Lista<>();
                int esquerda = (tamanho + 1) / 2;
                if (esquerda == tamanho) return outra;
                Celula<E> corte = inicio;
                for (int i = 0; i < esquerda; i++) corte = corte.getProximo();
                outra.inicio.setProximo(corte.getProximo());
                outra.fim = fim; outra.tamanho = tamanho - esquerda;
                corte.setProximo(null); fim = corte; tamanho = esquerda;
                return outra;
            }

        public Object[] toArray() {
                Object[] a = new Object[tamanho]; int i = 0;
                for (Celula<E> p = inicio.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                return a;
            }
    }
}
