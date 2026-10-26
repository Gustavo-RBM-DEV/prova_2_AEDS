/*
 * ============================================================================
 * LF01 - Construtor com duas filas ordenadas
 *
 * BASE: Lista de Exercicios de Lista Flexivel.docx.PDF, questao 1, pagina 1.
 * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
 *
 * PEDIDO E RACIOCINIO
 * Copie cada fila pela API publica e restaure-a. Mantenha um candidato de cada
 * origem; escolha o menor por compareTo, avance so esse lado e copie sobras.
 *
 * EXEMPLO / TESTE DE MESA
 * A[1,4,7],B[2,4,9] -> nova[1,2,4A,4B,7,9].
 *
 * CASOS DE BORDA
 * Ambas/uma vazia; comprimentos distintos; empates; A==B.
 *
 * CUSTO E EFEITOS
 * O(n+m) tempo/O(n+m) espaco. Entradas preservadas logicamente.
 *
 * COMO ADAPTAR
 * Se consumir entradas for permitido, pode dispensar copias auxiliares.
 *
 * ATENCAO AO CONTRATO
 * Classe com E extends Comparable<E>. Os helpers desta ficha foram implementados, nao sao presumidos prontos.
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

public final class LF01_ConstrutorFilasOrdenadas {
    public static class Lista<E extends Comparable<E>> {
        private Celula<E> inicio;
        private Celula<E> fim;
        private int tamanho;

        // ================= SOLUCAO_PEDIDA_AQUI =================
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

        // =========== BASE E AUXILIARES NECESSARIOS ==============
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
