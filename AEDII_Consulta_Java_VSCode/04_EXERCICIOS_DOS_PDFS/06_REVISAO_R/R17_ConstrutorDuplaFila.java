/*
 * ============================================================================
 * R17 - Dupla por fila preservando ordem
 *
 * BASE: Lista_de_Exercicios_Revisao_unidade2_AEDS_II.docx.PDF, questao 17, pagina 5.
 * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
 *
 * PEDIDO E RACIOCINIO
 * Retire da fila, insira na lista e numa auxiliar. Devolva a auxiliar a
 * origem no fim. Use SOMENTE API publica, nao campos privados da Fila.
 *
 * EXEMPLO / TESTE DE MESA
 * Fila[A,B,C] ->lista[A,B,C]; fila restaurada[A,B,C].
 *
 * CASOS DE BORDA
 * Vazia/unidade; origem deve manter sequencia.
 *
 * CUSTO E EFEITOS
 * O(n) tempo e auxiliar. Itens/ordem preservados, nao identidade das celulas internas.
 *
 * COMO ADAPTAR
 * A API de retirar/reinserir nao permite prometer identidade de cada no da fila.
 *
 * ATENCAO AO CONTRATO
 * Use os nomes, a assinatura e as restricoes do template efetivamente entregue na prova.
 *
 * ARQUIVO COMPLETO DE REFERENCIA: src/aed/base/ListaDupla.java
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

public final class R17_ConstrutorDuplaFila {
    public static class ListaDupla<E> {
        private final CelulaDupla<E> inicio;
        private CelulaDupla<E> fim;
        private int tamanho;

        // ================= SOLUCAO_PEDIDA_AQUI =================
        public ListaDupla() { inicio = new CelulaDupla<>(); fim = inicio; }

        public ListaDupla(Fila<E> fila) {
                this();
                if (fila == null) throw new IllegalArgumentException("Fila nula");
                Fila<E> aux = new Fila<>();
                while (!fila.vazia()) { E e = fila.desenfileirar(); inserirFim(e); aux.enfileirar(e); }
                while (!aux.vazia()) fila.enfileirar(aux.desenfileirar());
            }

        // =========== BASE E AUXILIARES NECESSARIOS ==============
        public boolean vazia() { return inicio == fim; }

        public void inserirFim(E item) { inserir(item, tamanho); }

        public void inserir(E item, int posicao) {
                if (posicao < 0 || posicao > tamanho) throw new IndexOutOfBoundsException();
                if (item == null) throw new IllegalArgumentException("Item nulo");
                CelulaDupla<E> anterior;
                if (posicao == tamanho) anterior = fim;
                else {
                    anterior = inicio;
                    for (int i = 0; i < posicao; i++) anterior = anterior.getProximo();
                }
                CelulaDupla<E> seguinte = anterior.getProximo();
                CelulaDupla<E> nova = new CelulaDupla<>(item);
                nova.setAnterior(anterior); nova.setProximo(seguinte);
                anterior.setProximo(nova);
                if (seguinte != null) seguinte.setAnterior(nova); else fim = nova;
                tamanho++;
            }

        public Object[] toArray() {
                Object[] a = new Object[tamanho]; int i = 0;
                for (CelulaDupla<E> p = inicio.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                return a;
            }
    }
}
