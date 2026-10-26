/*
 * ============================================================================
 * R09 - Trocar dois primeiros e corrigir fim
 *
 * BASE: Lista_de_Exercicios_Revisao_unidade2_AEDS_II.docx.PDF, questao 9, pagina 3.
 * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
 *
 * PEDIDO E RACIOCINIO
 * Guarde a/b. a.proximo=b.proximo; b.proximo=a; S.proximo=b.
 * Se b era fim, a passa a fim. Menos de2 itens lanca.
 *
 * EXEMPLO / TESTE DE MESA
 * [4,7,1,9]->[7,4,1,9],fim9
 * [4,7]->[7,4],fim4
 *
 * CASOS DE BORDA
 * 0/1 lanca;2 exige corrigir fim;3+ mantem fim.
 *
 * CUSTO E EFEITOS
 * O(1) tempo/espaco; mesmo tamanho.
 *
 * COMO ADAPTAR
 * Para quaisquer duas ocorrencias veja BL06.
 *
 * ATENCAO AO CONTRATO
 * O rastro do codigo incorreto esta em 07_RASTROS_ORDENACAO/R09_TrocaPrimeiros.java.
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

public final class R09_TrocarPrimeiros {
    public static class Lista<E extends Comparable<E>> {
        private Celula<E> inicio;
        private Celula<E> fim;
        private int tamanho;

        // ================= SOLUCAO_PEDIDA_AQUI =================
        public void trocarDoisPrimeiros() {
                if (tamanho < 2) throw new IllegalStateException("Menos de dois itens");
                Celula<E> a = inicio.getProximo(), b = a.getProximo();
                a.setProximo(b.getProximo()); b.setProximo(a); inicio.setProximo(b);
                if (fim == b) fim = a;
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
