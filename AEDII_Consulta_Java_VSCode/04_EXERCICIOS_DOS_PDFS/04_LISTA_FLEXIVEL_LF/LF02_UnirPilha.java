/*
 * ============================================================================
 * LF02 - Unir lista e pilha na ordem de insercao
 *
 * BASE: Lista de Exercicios de Lista Flexivel.docx.PDF, questao 2, pagina 1.
 * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
 *
 * PEDIDO E RACIOCINIO
 * Uma pilha entrega a ordem contraria da insercao. Transfira para auxiliar e
 * desempilhe auxiliar para a lista; reempilhe na origem para restaura-la.
 *
 * EXEMPLO / TESTE DE MESA
 * Empilhou10,20,30 (topo30); lista[A] vira[A,10,20,30].
 *
 * CASOS DE BORDA
 * Pilha/lista vazias; unidade; tres valores distintos.
 *
 * CUSTO E EFEITOS
 * O(m) tempo/O(m) auxiliar. Preserva a pilha ao final.
 *
 * COMO ADAPTAR
 * Inserir direto os pops geraria30,20,10 e descumpriria ordem de insercao.
 *
 * ATENCAO AO CONTRATO
 * Use os nomes, a assinatura e as restricoes do template efetivamente entregue na prova.
 *
 * ARQUIVO COMPLETO DE REFERENCIA: src/aed/base/Lista.java
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

public final class LF02_UnirPilha {
    public static class Lista<E> {
        private final Celula<E> primeiro;
        private Celula<E> ultimo;
        private int tamanho;

        // ================= SOLUCAO_PEDIDA_AQUI =================
        public void unir(Pilha<E> pilha) {
                if (pilha == null) throw new IllegalArgumentException("Pilha nula");
                Pilha<E> aux = new Pilha<>();
                while (!pilha.vazia()) aux.empilhar(pilha.desempilhar());
                while (!aux.vazia()) {
                    E e = aux.desempilhar(); inserirFinal(e); pilha.empilhar(e);
                }
            }

        // =========== BASE E AUXILIARES NECESSARIOS ==============
        public Lista() { primeiro = new Celula<>(); ultimo = primeiro; }

        public boolean vazia() { return primeiro == ultimo; }

        public void inserirFinal(E item) {
                if (item == null) throw new IllegalArgumentException("Item nulo");
                Celula<E> nova = new Celula<>(item);
                ultimo.setProximo(nova); ultimo = nova; tamanho++;
            }

        public Object[] toArray() {
                Object[] a = new Object[tamanho]; int i = 0;
                for (Celula<E> p = primeiro.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                return a;
            }
    }
}
