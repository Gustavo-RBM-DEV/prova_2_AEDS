/*
 * ============================================================================
 * R05 - Merge copiador e estavel
 *
 * BASE: Lista_de_Exercicios_Revisao_unidade2_AEDS_II.docx.PDF, questao 5, pagina 3.
 * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
 *
 * PEDIDO E RACIOCINIO
 * Percorra cada origem uma vez com um cursor. Escolha menor por compareTo.
 * No empate, <= escolhe this primeiro. Crie novos nos, nao altere entradas.
 *
 * EXEMPLO / TESTE DE MESA
 * A[1,4a,7],B[2,4b,8] ->[1,2,4a,4b,7,8].
 *
 * CASOS DE BORDA
 * Vazias; duplicados; comprimentos distintos; mesmo objeto.
 *
 * CUSTO E EFEITOS
 * O(n+m) tempo/O(n+m) novas celulas.
 *
 * COMO ADAPTAR
 * Merge por religacao usa menos alocacoes, mas consome entradas e nao atende este contrato.
 *
 * ATENCAO AO CONTRATO
 * Inserir ao final precisa ser O(1) para manter custo linear.
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

public final class R05_IntercalarOrdenadas {
    public static class Lista<E extends Comparable<E>> {
        private Celula<E> inicio;
        private Celula<E> fim;
        private int tamanho;

        // ================= SOLUCAO_PEDIDA_AQUI =================
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
