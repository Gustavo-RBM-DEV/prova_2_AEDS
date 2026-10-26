/*
 * ============================================================================
 * LF04 - Contem recursivo
 *
 * BASE: Lista de Exercicios de Lista Flexivel.docx.PDF, questao 4, pagina 2.
 * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
 *
 * PEDIDO E RACIOCINIO
 * null=false; achou=true; senao repasse resultado do resto. O boolean viaja
 * pelas chamadas pendentes sem virar uma contagem.
 *
 * EXEMPLO / TESTE DE MESA
 * [10,20,30],alvo20: chamada20 retorna true; chamada10 repassa true.
 *
 * CASOS DE BORDA
 * Vazia; primeiro; ultimo; ausente.
 *
 * CUSTO E EFEITOS
 * O(n) pior tempo/stack; para cedo ao achar.
 *
 * COMO ADAPTAR
 * Forma equivalente: equals || contem(proximo). Separar ifs facilita aprender.
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

public final class LF04_Contem {
    public static class Lista<E> {
        private final Celula<E> primeiro;
        private Celula<E> ultimo;
        private int tamanho;

        // ================= SOLUCAO_PEDIDA_AQUI =================
        public boolean contem(E item) { return contem(item, primeiro.getProximo()); }

        public boolean contem(E item, Celula<E> aux) {
                if (aux == null) return false;
                if (aux.getItem().equals(item)) return true;
                return contem(item, aux.getProximo());
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
