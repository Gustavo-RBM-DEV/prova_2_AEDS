/*
 * ============================================================================
 * A02 - Function extrai o valor, Fila percorre
 *
 * BASE: Atividades em imagens/codigo do chat; adaptacao autoral.
 * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
 *
 * PEDIDO E RACIOCINIO
 * App: Function<Pedido,Double> extrator=p->p.valorFinal().
 * Fila: soma+=extrator.apply(aux.getItem()); media=soma/quantidade.
 *
 * EXEMPLO / TESTE DE MESA
 * Primeiros2 de80,250,120:media165, nao150.
 *
 * CASOS DE BORDA
 * Media0itens gera erro. Quantidade>n gera erro antes do callback.
 *
 * CUSTO E EFEITOS
 * O(k) tempo/O(1) auxiliar;origem preservada.
 *
 * COMO ADAPTAR
 * Nao crie nova fila vazia no metodo de consulta. Reutilize a existente ou receba-a por parametro.
 *
 * ATENCAO AO CONTRATO
 * PedidoDemo e independente. O projeto completo original depende de classes nao fornecidas integralmente. Os contratos adicionais de null/quantidade sao declarados aqui.
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

public final class A02_MediaFunction {
    public static class Fila<E> {
        private final Celula<E> frente;
        private Celula<E> tras;

        // ================= SOLUCAO_PEDIDA_AQUI =================
        public double somarValores(Function<E, Double> extrator, int quantidade) {
                if (extrator == null) throw new IllegalArgumentException("Extrator nulo");
                validarQuantidade(quantidade);
                double soma = 0;
                Celula<E> p = frente.getProximo();
                for (int i = 0; i < quantidade; i++) {
                    Double valor = extrator.apply(p.getItem());
                    if (valor == null) throw new IllegalArgumentException("Extrator retornou null");
                    soma += valor;
                    p = p.getProximo();
                }
                return soma;
            }

        public double calcularValorMedio(Function<E, Double> extrator, int quantidade) {
                if (quantidade <= 0) throw new IllegalArgumentException("Quantidade deve ser positiva");
                return somarValores(extrator, quantidade) / quantidade;
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

        private void validarQuantidade(int quantidade) {
                if (quantidade < 0) throw new IllegalArgumentException("Quantidade negativa");
                Celula<E> p = frente.getProximo();
                for (int i = 0; i < quantidade; i++) {
                    if (p == null) throw new IllegalArgumentException("Itens insuficientes");
                    p = p.getProximo();
                }
            }

        public Object[] toArray() {
                Object[] a = new Object[tamanho()]; int i = 0;
                for (Celula<E> p = frente.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                return a;
            }
    }
}
