/*
 * ============================================================================
 * LF06 - Nova lista invertida preservando origem
 *
 * BASE: Lista de Exercicios de Lista Flexivel.docx.PDF, questao 6, pagina 2.
 * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
 *
 * PEDIDO E RACIOCINIO
 * Percorra origem normalmente e insira cada item na posicao0 do resultado.
 * Inserir no inicio e O(1), mesmo que o metodo geral insira por indice.
 *
 * EXEMPLO / TESTE DE MESA
 * [10,20,30] -> resultado cresce[10],[20,10],[30,20,10].
 *
 * CASOS DE BORDA
 * Vazia retorna nova vazia; unidade; origem continua intacta.
 *
 * CUSTO E EFEITOS
 * O(n) tempo/O(n) celulas.
 *
 * COMO ADAPTAR
 * Outra opcao e percorrer recursivamente e inserir no final na VOLTA.
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

public final class LF06_CopiaInvertida {
    public static class Lista<E> {
        private final Celula<E> primeiro;
        private Celula<E> ultimo;
        private int tamanho;

        // ================= SOLUCAO_PEDIDA_AQUI =================
        public Lista<E> invertida() {
                Lista<E> nova = new Lista<>();
                for (Celula<E> p = primeiro.getProximo(); p != null; p = p.getProximo()) nova.inserir(p.getItem(), 0);
                return nova;
            }

        // =========== BASE E AUXILIARES NECESSARIOS ==============
        public Lista() { primeiro = new Celula<>(); ultimo = primeiro; }

        public boolean vazia() { return primeiro == ultimo; }

        public void inserirFinal(E item) {
                if (item == null) throw new IllegalArgumentException("Item nulo");
                Celula<E> nova = new Celula<>(item);
                ultimo.setProximo(nova); ultimo = nova; tamanho++;
            }

        public void inserir(E item, int pos) {
                if (pos < 0 || pos > tamanho) throw new IndexOutOfBoundsException("Posicao invalida");
                if (item == null) throw new IllegalArgumentException("Item nulo");
                Celula<E> anterior = primeiro;
                for (int i = 0; i < pos; i++) anterior = anterior.getProximo();
                Celula<E> nova = new Celula<>(item, anterior.getProximo());
                anterior.setProximo(nova);
                if (anterior == ultimo) ultimo = nova;
                tamanho++;
            }

        public Object[] toArray() {
                Object[] a = new Object[tamanho]; int i = 0;
                for (Celula<E> p = primeiro.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                return a;
            }
    }
}
