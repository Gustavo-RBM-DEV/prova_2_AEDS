/*
 * ============================================================================
 * R13 - Inverter dupla preservando sentinela
 *
 * BASE: Lista_de_Exercicios_Revisao_unidade2_AEDS_II.docx.PDF, questao 13, pagina 4.
 * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
 *
 * PEDIDO E RACIOCINIO
 * Vire as duas setas de cada dado. Trate fronteiras: antigo primeiro passa
 * a ter proximo null; antigo fim tem anterior S. Religue S e fim ao final.
 *
 * EXEMPLO / TESTE DE MESA
 * S<->10<->20<->30 ->S<->30<->20<->10. S nao muda.
 *
 * CASOS DE BORDA
 * Vazia/unidade; verificar ida e volta; inverter duas vezes.
 *
 * CUSTO E EFEITOS
 * O(n) tempo/O(1) auxiliar; sem novos nos ou troca de itens.
 *
 * COMO ADAPTAR
 * So trocar inicio/fim nao inverte links e ainda quebraria a sentinela.
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

public final class R13_InverterDupla {
    public static class ListaDupla<E> {
        private final CelulaDupla<E> inicio;
        private CelulaDupla<E> fim;
        private int tamanho;

        // ================= SOLUCAO_PEDIDA_AQUI =================
        public void inverter() {
                if (vazia()) return;
                CelulaDupla<E> antigoPrimeiro = inicio.getProximo(), antigoFim = fim;
                CelulaDupla<E> atual = antigoPrimeiro;
                while (atual != null) {
                    CelulaDupla<E> seguinte = atual.getProximo(), anterior = atual.getAnterior();
                    atual.setProximo(anterior == inicio ? null : anterior);
                    atual.setAnterior(seguinte == null ? inicio : seguinte);
                    atual = seguinte;
                }
                inicio.setProximo(antigoFim); fim = antigoPrimeiro;
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
