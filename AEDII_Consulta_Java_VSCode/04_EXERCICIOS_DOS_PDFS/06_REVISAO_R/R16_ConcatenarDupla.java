/*
 * ============================================================================
 * R16 - Transferir outra dupla em O(1)
 *
 * BASE: Lista_de_Exercicios_Revisao_unidade2_AEDS_II.docx.PDF, questao 16, pagina 5.
 * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
 *
 * PEDIDO E RACIOCINIO
 * Ligue fimA a primeiroB, corrija anterior do primeiroB e adote fimB.
 * Esvazie a sentinela e controles de B. Os nos de B agora pertencem a A.
 *
 * EXEMPLO / TESTE DE MESA
 * A:S<->1<->2;B:T<->3<->4
 * A:S<->1<->2<->3<->4;B:T->null,fimB=T,tamanhoB0.
 *
 * CASOS DE BORDA
 * B vazia; A vazia; ambas; reutilizar B; selfconcat rejeitada.
 *
 * CUSTO E EFEITOS
 * O(1) tempo/espaco. Consome B. Sem fim, achar cauda custariaO(n).
 *
 * COMO ADAPTAR
 * Preservar B exigiria copiar nos, nao essa transferencia constante.
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

public final class R16_ConcatenarDupla {
    public static class ListaDupla<E> {
        private final CelulaDupla<E> inicio;
        private CelulaDupla<E> fim;
        private int tamanho;

        // ================= SOLUCAO_PEDIDA_AQUI =================
        /** Transfere os nos, O(1); esvazia outra. */
            public void concatenar(ListaDupla<E> outra) {
                if (outra == null || outra == this) throw new IllegalArgumentException("Origem invalida");
                if (outra.vazia()) return;
                CelulaDupla<E> primeiroOutro = outra.inicio.getProximo();
                fim.setProximo(primeiroOutro); primeiroOutro.setAnterior(fim);
                fim = outra.fim; tamanho += outra.tamanho;
                outra.inicio.setProximo(null); outra.fim = outra.inicio; outra.tamanho = 0;
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
