/*
 * ============================================================================
 * LF10 - Insercao em lista ordenada
 *
 * BASE: Lista de Exercicios de Lista Flexivel.docx.PDF, questao 10, pagina 2.
 * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
 *
 * PEDIDO E RACIOCINIO
 * Procure predecessor enquanto o proximo valor for <= ao novo. Insira depois
 * de anterior e antes de seu sucessor. Atualize ultimo se inseriu ao final.
 *
 * EXEMPLO / TESTE DE MESA
 * [2,4,4,8],inserir4 ->[2,4,4,4novo,8].
 *
 * CASOS DE BORDA
 * Vazia; menor/maior que todos; empate; unidade.
 *
 * CUSTO E EFEITOS
 * O(n) tempo, uma celula nova.
 *
 * COMO ADAPTAR
 * Decrescente inverte sinal; < em vez de <= insere antes dos iguais.
 *
 * ATENCAO AO CONTRATO
 * CompareTo exige limite E extends Comparable<E> ou outro criterio autorizado.
 *
 * ARQUIVO COMPLETO DE REFERENCIA: src/aed/flexiveis/ListaOrdenada.java
 * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
 * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
 * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
 * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
 * existem no codigo-base. As classes de apoio ficam em src/aed/base.
 *
 * ============================================================================
 */

import aed.base.Celula;
import aed.base.CelulaDupla;
import aed.base.Fila;
import aed.base.Pilha;
import aed.app.PedidoDemo;

public final class LF10_InserirEmOrdem {
    public static class ListaOrdenada<E extends Comparable<E>> {
        private final Celula<E> primeiro = new Celula<>();
        private Celula<E> ultimo = primeiro;
        private int tamanho;

        // ================= SOLUCAO_PEDIDA_AQUI =================
        public void inserirEmOrdem(E item) {
                if (item == null) throw new IllegalArgumentException("Item nulo");
                Celula<E> anterior = primeiro;
                while (anterior.getProximo() != null && anterior.getProximo().getItem().compareTo(item) <= 0) anterior = anterior.getProximo();
                Celula<E> nova = new Celula<>(item, anterior.getProximo());
                anterior.setProximo(nova); if (anterior == ultimo) ultimo = nova; tamanho++;
            }

        // =========== BASE E AUXILIARES NECESSARIOS ==============
        public Object[] toArray() {
                Object[] a = new Object[tamanho]; int i = 0;
                for (Celula<E> p = primeiro.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                return a;
            }
    }
}
