/*
 * ============================================================================
 * LF03 - Contar ocorrencias recursivas
 *
 * BASE: Lista de Exercicios de Lista Flexivel.docx.PDF, questao 3, pagina 1.
 * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
 *
 * PEDIDO E RACIOCINIO
 * Caso aux==null devolve0. Atual igual ao alvo contribui1; diferente contribui0.
 * A chamada passa item igual e aux.proximo. Nao adicione parametro contador.
 *
 * EXEMPLO / TESTE DE MESA
 * [10,20,10],alvo10: volta0 ->1 ->1 ->2.
 *
 * CASOS DE BORDA
 * Vazia0; nenhuma0; todasn; repetidas. Wrapper pula S.
 *
 * CUSTO E EFEITOS
 * O(n) tempo/O(n) chamadas; sem mudar links.
 *
 * COMO ADAPTAR
 * Para contar todos, some1 sempre; para criterio externo use Predicate em outra assinatura.
 *
 * ATENCAO AO CONTRATO
 * Assinatura e equals obrigatorios; nao lancar excecao explicitamente neste metodo.
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

public final class LF03_ContarOcorrencias {
    public static class Lista<E> {
        private final Celula<E> primeiro;
        private Celula<E> ultimo;
        private int tamanho;

        // ================= SOLUCAO_PEDIDA_AQUI =================
        public int contarQtos(E item) { return contarQtos(item, primeiro.getProximo()); }

        public int contarQtos(E item, Celula<E> aux) {
                if (aux == null) return 0;
                if (aux.getItem().equals(item)) return 1 + contarQtos(item, aux.getProximo());
                return contarQtos(item, aux.getProximo());
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
