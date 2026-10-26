/*
 * ============================================================================
 * LF09 - Clone estrutural
 *
 * BASE: Lista de Exercicios de Lista Flexivel.docx.PDF, questao 9, pagina 2.
 * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
 *
 * PEDIDO E RACIOCINIO
 * Novo objeto Lista, novas celulas, mesmos itens E. Percorra e insira ao final.
 *
 * EXEMPLO / TESTE DE MESA
 * a[Pedido1,Pedido2],b=a.clone(): retirar de b nao retira de a.
 * Alterar Pedido1 compartilhado pode aparecer nas duas.
 *
 * CASOS DE BORDA
 * Vazia; unidade; ordem; independencia estrutural.
 *
 * CUSTO E EFEITOS
 * O(n) tempo/O(n) nos novos.
 *
 * COMO ADAPTAR
 * Copia profunda precisa copiar cada E; nao existe clone profundo generico automatico.
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

public final class LF09_Clone {
    public static class Lista<E> {
        private final Celula<E> primeiro;
        private Celula<E> ultimo;
        private int tamanho;

        // ================= SOLUCAO_PEDIDA_AQUI =================
        @Override public Lista<E> clone() {
                Lista<E> nova = new Lista<>();
                for (Celula<E> p = primeiro.getProximo(); p != null; p = p.getProximo()) nova.inserirFinal(p.getItem());
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

        public Object[] toArray() {
                Object[] a = new Object[tamanho]; int i = 0;
                for (Celula<E> p = primeiro.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                return a;
            }
    }
}
