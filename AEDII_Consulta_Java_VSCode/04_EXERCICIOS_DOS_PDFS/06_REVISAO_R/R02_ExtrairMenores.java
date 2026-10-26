/*
 * ============================================================================
 * R02 - Separar menores mantendo ordem
 *
 * BASE: Lista_de_Exercicios_Revisao_unidade2_AEDS_II.docx.PDF, questao 2, pagina 2.
 * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
 *
 * PEDIDO E RACIOCINIO
 * Ao aprovar por compareTo<0, desligue o no da origem e anexe ao destino.
 * Se mantiver o no, avance anterior. Sempre salve seguinte antes.
 *
 * EXEMPLO / TESTE DE MESA
 * [8,3,10,1,7,12],limite7 -> retorno[3,1],this[8,10,7,12].
 *
 * CASOS DE BORDA
 * Nenhum/todos; iguais ao limite ficam; consecutivos; ultimo; vazia.
 *
 * CUSTO E EFEITOS
 * O(n) tempo/O(1) auxiliar, reutiliza nos.
 *
 * COMO ADAPTAR
 * <=0 incluiria iguais. Predicate poderia substituir criterio se assinatura permitisse.
 *
 * ATENCAO AO CONTRATO
 * Use os nomes, a assinatura e as restricoes do template efetivamente entregue na prova.
 *
 * ARQUIVO COMPLETO DE REFERENCIA: src/aed/revisao/Fila.java
 * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
 * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
 * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
 * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
 * existem no codigo-base. As classes de apoio ficam em src/aed/base.
 *
 * ============================================================================
 */

import aed.base.Celula;
import java.util.NoSuchElementException;
import aed.base.CelulaDupla;
import aed.base.Fila;
import aed.base.Pilha;
import aed.app.PedidoDemo;

public final class R02_ExtrairMenores {
    public static class Fila<E extends Comparable<E>> {
        private final Celula<E> inicio;
        private Celula<E> fim;

        // ================= SOLUCAO_PEDIDA_AQUI =================
        public Fila<E> extrairMenores(E limite) {
                if (limite == null) throw new IllegalArgumentException("Limite nulo");
                Fila<E> nova = new Fila<>();
                Celula<E> anterior = inicio, atual = inicio.getProximo();
                while (atual != null) {
                    Celula<E> seguinte = atual.getProximo();
                    if (atual.getItem().compareTo(limite) < 0) {
                        anterior.setProximo(seguinte);
                        if (fim == atual) fim = anterior;
                        atual.setProximo(null);
                        nova.fim.setProximo(atual); nova.fim = atual;
                    } else anterior = atual;
                    atual = seguinte;
                }
                return nova;
            }

        // =========== BASE E AUXILIARES NECESSARIOS ==============
        public Fila() { inicio = new Celula<>(); fim = inicio; }

        public Fila(E[] a, E[] b) {
                this();
                if (a == null || b == null) throw new IllegalArgumentException("Array nulo");
                int i = 0, j = 0;
                while (i < a.length && j < b.length) {
                    if (a[i].compareTo(b[j]) <= 0) enfileirar(a[i++]);
                    else enfileirar(b[j++]);
                }
                while (i < a.length) enfileirar(a[i++]);
                while (j < b.length) enfileirar(b[j++]);
            }

        public boolean vazia() { return inicio == fim; }

        public void enfileirar(E item) {
                if (item == null) throw new IllegalArgumentException("Item nulo");
                Celula<E> nova = new Celula<>(item);
                fim.setProximo(nova); fim = nova;
            }

        public Object[] toArray() {
                int n = 0;
                for (Celula<E> p = inicio.getProximo(); p != null; p = p.getProximo()) n++;
                Object[] a = new Object[n]; int i = 0;
                for (Celula<E> p = inicio.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                return a;
            }
    }
}
