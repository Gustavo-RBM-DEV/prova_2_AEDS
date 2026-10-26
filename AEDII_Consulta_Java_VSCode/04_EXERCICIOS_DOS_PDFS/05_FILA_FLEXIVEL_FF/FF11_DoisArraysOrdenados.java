/*
 * ============================================================================
 * FF11 - Construtor com merge de dois arrays
 *
 * BASE: Lista de Exercicios Fila Flexivel.docx.PDF, questao 11, pagina 2.
 * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
 *
 * PEDIDO E RACIOCINIO
 * i e j apontam os candidatos de arrays ja ordenados. Enfileire menor e
 * avance so o indice usado. Depois acrescente os que sobraram.
 *
 * EXEMPLO / TESTE DE MESA
 * A[1,3,7],B[2,3,8] ->[1,2,3A,3B,7,8].
 *
 * CASOS DE BORDA
 * Vazios; empates; um termina antes; dados nao nulos.
 *
 * CUSTO E EFEITOS
 * O(n+m) tempo/O(n+m) resultado; preserva arrays.
 *
 * COMO ADAPTAR
 * Para decrescente ajuste comparacao e precondicao das entradas.
 *
 * ATENCAO AO CONTRATO
 * Requer Comparable. Nao confundir com FF01 que ignora nulls do array.
 *
 * ARQUIVO COMPLETO DE REFERENCIA: src/aed/revisao/Fila.java
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

public final class FF11_DoisArraysOrdenados {
    public static class Fila<E extends Comparable<E>> {
        private final Celula<E> inicio;
        private Celula<E> fim;

        // ================= SOLUCAO_PEDIDA_AQUI =================
        public Fila() { inicio = new Celula<>(); fim = inicio; }

        public Fila(E[] a, E[] b) {
                this();
                if (a == null || b == null) throw new IllegalArgumentException("Array nulo");
                int i = 0, j = 0;
                while (i < a.length && j < b.length) {
                    if (a[i].compareTo(b[j]) <= 0) enfileirar(a[i++]);
                    else enfileirar(b[j++]);
                }
                while (i < a.length) enfileirar(a[i++]);
                while (j < b.length) enfileirar(b[j++]);
            }

        // =========== BASE E AUXILIARES NECESSARIOS ==============
        public boolean vazia() { return inicio == fim; }

        public void enfileirar(E item) {
                if (item == null) throw new IllegalArgumentException("Item nulo");
                Celula<E> nova = new Celula<>(item);
                fim.setProximo(nova); fim = nova;
            }

        public Object[] toArray() {
                int n = 0;
                for (Celula<E> p = inicio.getProximo(); p != null; p = p.getProximo()) n++;
                Object[] a = new Object[n]; int i = 0;
                for (Celula<E> p = inicio.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                return a;
            }
    }
}
