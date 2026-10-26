/*
 * ============================================================================
 * BL01 - Inserir no final
 *
 * BASE: Listas encadeadas - AEDs II.pdf, questao 1, pagina 1.
 * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
 *
 * PEDIDO E RACIOCINIO
 * Crie nova com proximo null, ligue ultimo.proximo nela e atualize ultimo.
 * Na vazia, ultimo e a sentinela: o mesmo codigo funciona.
 *
 * EXEMPLO / TESTE DE MESA
 * S->10; inserir20 -> S->10->20, ultimo=20.
 *
 * CASOS DE BORDA
 * Vazia/unidade; inserir apos esvaziar; null conforme contrato.
 *
 * CUSTO E EFEITOS
 * O(1), uma celula nova.
 *
 * COMO ADAPTAR
 * Sem ultimo, buscar o final torna a insercao O(n).
 *
 * ATENCAO AO CONTRATO
 * O acervo possui tamanho. Se seu template nao o tiver, nao copie tamanho++ sem adaptar.
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

public final class BL01_InserirFinal {
    public static class Lista<E> {
        private final Celula<E> primeiro;
        private Celula<E> ultimo;
        private int tamanho;

        // ================= SOLUCAO_PEDIDA_AQUI =================
        public void inserirFinal(E item) {
                if (item == null) throw new IllegalArgumentException("Item nulo");
                Celula<E> nova = new Celula<>(item);
                ultimo.setProximo(nova); ultimo = nova; tamanho++;
            }

        // =========== BASE E AUXILIARES NECESSARIOS ==============
        public Lista() { primeiro = new Celula<>(); ultimo = primeiro; }

        public boolean vazia() { return primeiro == ultimo; }

        public Object[] toArray() {
                Object[] a = new Object[tamanho]; int i = 0;
                for (Celula<E> p = primeiro.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                return a;
            }
    }
}
