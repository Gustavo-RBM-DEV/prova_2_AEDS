/*
 * ============================================================================
 * R14 - Remover ocorrencias na dupla
 *
 * BASE: Lista_de_Exercicios_Revisao_unidade2_AEDS_II.docx.PDF, questao 14, pagina 4.
 * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
 *
 * PEDIDO E RACIOCINIO
 * Guarde seguinte antes de remover atual. O proprio atual.anterior fornece
 * predecessor. Corrija os dois lados e os controles usando desligar.
 *
 * EXEMPLO / TESTE DE MESA
 * [2,2,3,2],alvo2 ->[3],true; ausente ->false.
 *
 * CASOS DE BORDA
 * Vazia lanca; todos; nenhum; consecutivos; extremos.
 *
 * CUSTO E EFEITOS
 * O(n) tempo/O(1) auxiliar. Uma passagem.
 *
 * COMO ADAPTAR
 * A variavel predecessor persistente da lista simples deixa de ser necessaria.
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

public final class R14_RemoverTodosDupla {
    public static class ListaDupla<E> {
        private final CelulaDupla<E> inicio;
        private CelulaDupla<E> fim;
        private int tamanho;

        // ================= SOLUCAO_PEDIDA_AQUI =================
        public boolean removerTodos(E item) {
                if (vazia()) throw new IllegalStateException("Lista vazia");
                boolean removeu = false;
                CelulaDupla<E> atual = inicio.getProximo();
                while (atual != null) {
                    CelulaDupla<E> seguinte = atual.getProximo();
                    if (atual.getItem().equals(item)) { desligar(atual); removeu = true; }
                    atual = seguinte;
                }
                return removeu;
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

        private E desligar(CelulaDupla<E> atual) {
                CelulaDupla<E> anterior = atual.getAnterior(), seguinte = atual.getProximo();
                anterior.setProximo(seguinte);
                if (seguinte != null) seguinte.setAnterior(anterior); else fim = anterior;
                atual.setAnterior(null); atual.setProximo(null); tamanho--;
                return atual.getItem();
            }

        public Object[] toArray() {
                Object[] a = new Object[tamanho]; int i = 0;
                for (CelulaDupla<E> p = inicio.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                return a;
            }
    }
}
