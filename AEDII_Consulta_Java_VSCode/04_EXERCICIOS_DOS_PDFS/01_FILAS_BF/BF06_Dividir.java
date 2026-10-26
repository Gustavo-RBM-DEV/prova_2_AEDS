/*
 * ============================================================================
 * BF06 - Separar posicoes pares e impares
 *
 * BASE: Filas - AEDs II.pdf, questao 6, pagina 1.
 * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
 *
 * PEDIDO E RACIOCINIO
 * Percorra contando posicoes ORIGINAIS. Destaque pares e anexe no resultado;
 * impares ficam em this. Guarde seguinte antes de religar.
 *
 * EXEMPLO / TESTE DE MESA
 * [A,B,C,D,E] -> this[B,D], retorno[A,C,E]. Posicao inicial=0.
 *
 * CASOS DE BORDA
 * n=0,1,2; par/impar; retirar todos; conferir tras das duas filas.
 *
 * CUSTO E EFEITOS
 * O(n) tempo/O(1) auxiliar alem de nova sentinela; reutiliza dados.
 *
 * COMO ADAPTAR
 * Trocar o destino inverte quem recebe pares. Testar valor%2 nao resolve posicao par.
 *
 * ATENCAO AO CONTRATO
 * Use os nomes, a assinatura e as restricoes do template efetivamente entregue na prova.
 *
 * ARQUIVO COMPLETO DE REFERENCIA: src/aed/base/Fila.java
 * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
 * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
 * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
 * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
 * existem no codigo-base. As classes de apoio ficam em src/aed/base.
 *
 * ============================================================================
 */

import java.util.NoSuchElementException;
import java.util.function.Function;
import java.util.function.Predicate;
import aed.base.Celula;
import aed.base.CelulaDupla;
import aed.base.Fila;
import aed.base.Pilha;
import aed.app.PedidoDemo;

public final class BF06_Dividir {
    public static class Fila<E> {
        private final Celula<E> frente;
        private Celula<E> tras;

        // ================= SOLUCAO_PEDIDA_AQUI =================
        /** Pares das POSICOES originais vao para retorno; impares ficam em this. */
            public Fila<E> dividir() {
                Fila<E> pares = new Fila<>();
                Celula<E> anterior = frente, atual = frente.getProximo();
                int pos = 0;
                while (atual != null) {
                    Celula<E> seguinte = atual.getProximo();
                    if (pos % 2 == 0) {
                        anterior.setProximo(seguinte);
                        if (atual == tras) tras = anterior;
                        atual.setProximo(null);
                        pares.tras.setProximo(atual);
                        pares.tras = atual;
                    } else anterior = atual;
                    atual = seguinte;
                    pos++;
                }
                return pares;
            }

        // =========== BASE E AUXILIARES NECESSARIOS ==============
        public Fila() { frente = new Celula<>(); tras = frente; }

        /** FF01: ignora os elementos null do vetor. */
            public Fila(E[] itens) {
                this();
                if (itens == null) throw new IllegalArgumentException("Vetor nulo");
                for (E e : itens) if (e != null) enfileirar(e);
            }

        /** FF02: escolha explicita, ordem topo->fundo; restaura a pilha. */
            public Fila(Pilha<E> pilha) {
                this();
                if (pilha == null) throw new IllegalArgumentException("Pilha nula");
                Pilha<E> aux = new Pilha<>();
                while (!pilha.vazia()) {
                    E e = pilha.desempilhar();
                    enfileirar(e);
                    aux.empilhar(e);
                }
                while (!aux.vazia()) pilha.empilhar(aux.desempilhar());
            }

        public boolean vazia() { return frente == tras; }

        public void enfileirar(E item) {
                if (item == null) throw new IllegalArgumentException("Item nulo");
                Celula<E> nova = new Celula<>(item);
                tras.setProximo(nova);
                tras = nova;
            }

        public int tamanho() {
                int n = 0;
                for (Celula<E> p = frente.getProximo(); p != null; p = p.getProximo()) n++;
                return n;
            }

        public Object[] toArray() {
                Object[] a = new Object[tamanho()]; int i = 0;
                for (Celula<E> p = frente.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                return a;
            }
    }
}
