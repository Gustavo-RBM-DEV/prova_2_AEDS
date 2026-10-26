/*
 * ============================================================================
 * FF10 - Quantos antes do alvo com retorno int
 *
 * BASE: Lista de Exercicios Fila Flexivel.docx.PDF, questao 10, pagina 2.
 * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
 *
 * PEDIDO E RACIOCINIO
 * Ao achar, retorne0. Ao nao achar na celula atual, espere o resultado da
 * proxima e some1. Quando chega a null sem alvo, lance excecao.
 *
 * EXEMPLO / TESTE DE MESA
 * [10,20,30],alvo30
 * 10 espera 1+f(20);20 espera1+f(30);30 retorna0
 * 20 retorna1;10 retorna2.
 *
 * CASOS DE BORDA
 * Primeiro0; ultimo n-1; ausencia/vazia excecao.
 *
 * CUSTO E EFEITOS
 * O(n) tempo e stack. Nao enfileira nem remove.
 *
 * COMO ADAPTAR
 * Copiar depois do alvo e outro metodo, retornando Fila<E>; veja integracao.
 *
 * ATENCAO AO CONTRATO
 * Assinatura do PDF: quantosAfrente(Celula<E> atual,E item). Celula vem primeiro.
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

public final class FF10_QuantosAfrente {
    public static class Fila<E> {
        private final Celula<E> frente;
        private Celula<E> tras;

        // ================= SOLUCAO_PEDIDA_AQUI =================
        public int quantosAfrente(E item) { return quantosAfrente(frente.getProximo(), item); }

        /** FF10 exige esta ordem: celula primeiro, item segundo. */
            public int quantosAfrente(Celula<E> atual, E item) {
                if (atual == null) throw new NoSuchElementException("Item nao encontrado");
                if (atual.getItem().equals(item)) return 0;
                return 1 + quantosAfrente(atual.getProximo(), item);
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
