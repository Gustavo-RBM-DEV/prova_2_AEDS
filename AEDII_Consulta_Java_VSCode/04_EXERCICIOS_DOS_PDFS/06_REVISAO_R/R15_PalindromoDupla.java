/*
 * ============================================================================
 * R15 - Comparar extremos da dupla
 *
 * BASE: Lista_de_Exercicios_Revisao_unidade2_AEDS_II.docx.PDF, questao 15, pagina 4.
 * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
 *
 * PEDIDO E RACIOCINIO
 * a comeca primeiro dado, b no fim. Compare equals, avance a.proximo e
 * b.anterior. Fazer tamanho/2 comparacoes evita tratar cruzamento separado.
 *
 * EXEMPLO / TESTE DE MESA
 * [A,R,A,R,A]->true;[1,2,2,1]->true;[1,2,3]->false.
 *
 * CASOS DE BORDA
 * Vazia e unidade true; par/impar; divergencia inicial.
 *
 * CUSTO E EFEITOS
 * O(n) tempo/O(1) memoria, sem modificar.
 *
 * COMO ADAPTAR
 * Sem tamanho, pare ao encontrar/cruzar cursores. Nao compare objetos de dados com ==.
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

public final class R15_PalindromoDupla {
    public static class ListaDupla<E> {
        private final CelulaDupla<E> inicio;
        private CelulaDupla<E> fim;
        private int tamanho;

        // ================= SOLUCAO_PEDIDA_AQUI =================
        public boolean ehPalindromo() {
                CelulaDupla<E> a = inicio.getProximo(), b = fim;
                for (int i = 0; i < tamanho / 2; i++) {
                    if (!a.getItem().equals(b.getItem())) return false;
                    a = a.getProximo(); b = b.getAnterior();
                }
                return true;
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
