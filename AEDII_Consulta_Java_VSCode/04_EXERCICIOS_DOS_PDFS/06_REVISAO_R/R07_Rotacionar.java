/*
 * ============================================================================
 * R07 - Mover prefixo sem copiar celulas
 *
 * BASE: Lista_de_Exercicios_Revisao_unidade2_AEDS_II.docx.PDF, questao 7, pagina 3.
 * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
 *
 * PEDIDO E RACIOCINIO
 * Ache a ultima celula do prefixo. Guarde novo primeiro. Ligue fim antigo
 * ao primeiro antigo, corte prefixo com null e atualize inicio/fim.
 *
 * EXEMPLO / TESTE DE MESA
 * [A,B,C,D,E],k2 ->[C,D,E,A,B].
 *
 * CASOS DE BORDA
 * k0/kn nada muda; k<0/k>n lanca; vazia aceita k0.
 *
 * CUSTO E EFEITOS
 * O(k) tempo/O(1) auxiliar. Mesmos nos, mesmo tamanho.
 *
 * COMO ADAPTAR
 * Rotacao direita r equivale a esquerda n-r se a especificacao permitir.
 *
 * ATENCAO AO CONTRATO
 * Nao criar celulas nem chamar inserir/remover. Nao usar modulo para esconder k invalido.
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

public final class R07_Rotacionar {
    public static class Lista<E extends Comparable<E>> {
        private Celula<E> inicio;
        private Celula<E> fim;
        private int tamanho;

        // ================= SOLUCAO_PEDIDA_AQUI =================
        public void rotacionar(int k) {
                if (k < 0 || k > tamanho) throw new IllegalArgumentException("k invalido");
                if (k == 0 || k == tamanho) return;
                Celula<E> antigoPrimeiro = inicio.getProximo(), corte = antigoPrimeiro;
                for (int i = 1; i < k; i++) corte = corte.getProximo();
                Celula<E> novoPrimeiro = corte.getProximo();
                fim.setProximo(antigoPrimeiro); corte.setProximo(null);
                inicio.setProximo(novoPrimeiro); fim = corte;
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

        public Object[] toArray() {
                Object[] a = new Object[tamanho]; int i = 0;
                for (Celula<E> p = inicio.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                return a;
            }
    }
}
