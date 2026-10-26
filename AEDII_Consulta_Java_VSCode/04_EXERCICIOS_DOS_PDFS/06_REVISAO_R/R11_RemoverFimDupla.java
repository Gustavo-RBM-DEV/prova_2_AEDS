/*
 * ============================================================================
 * R11 - Remover ultimo da dupla
 *
 * BASE: Lista_de_Exercicios_Revisao_unidade2_AEDS_II.docx.PDF, questao 11, pagina 4.
 * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
 *
 * PEDIDO E RACIOCINIO
 * Guarde fim. Novo fim=removido.anterior. Faca novoFim.proximo=null e
 * decremente tamanho. Quando unico, anterior e a sentinela.
 *
 * EXEMPLO / TESTE DE MESA
 * S<->10<->20<->30 ->retorna30;fim20. Unidade10 ->fimS.
 *
 * CASOS DE BORDA
 * Vaziaerro; unidade;2; remover todos e inserir de novo.
 *
 * CUSTO E EFEITOS
 * Dupla O(1). Simples precisa buscar anterior:O(n).
 *
 * COMO ADAPTAR
 * Guarde referencias antes de zerar links do removido.
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

public final class R11_RemoverFimDupla {
    public static class ListaDupla<E> {
        private final CelulaDupla<E> inicio;
        private CelulaDupla<E> fim;
        private int tamanho;

        // ================= SOLUCAO_PEDIDA_AQUI =================
        public E removerFim() {
                if (vazia()) throw new NoSuchElementException("Lista vazia");
                CelulaDupla<E> r = fim;
                fim = r.getAnterior(); fim.setProximo(null);
                r.setAnterior(null); tamanho--;
                return r.getItem();
            }

        // =========== BASE E AUXILIARES NECESSARIOS ==============
        public ListaDupla() { inicio = new CelulaDupla<>(); fim = inicio; }

        public ListaDupla(Fila<E> fila) {
                this();
                if (fila == null) throw new IllegalArgumentException("Fila nula");
                Fila<E> aux = new Fila<>();
                while (!fila.vazia()) { E e = fila.desenfileirar(); inserirFim(e); aux.enfileirar(e); }
                while (!aux.vazia()) fila.enfileirar(aux.desenfileirar());
            }

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
