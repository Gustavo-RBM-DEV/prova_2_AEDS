/*
 * ============================================================================
 * C09 - Consultar k-esimo do fim
 *
 * BASE: Adaptacao de consulta do padrao LeetCode19: https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
 *
 * PEDIDO E RACIOCINIO
 * Adiante rapido k nos, depois ande rapido/lento juntos. Quando rapido atinge
 * null, lento identifica o k-esimo do fim. k1 significa ultimo.
 *
 * EXEMPLO / TESTE DE MESA
 * [10,20,30,40]:k1=40;k2=30;k4=10.
 *
 * CASOS DE BORDA
 * k<=0 ou >n;vazia;primeiro/ultimo.
 *
 * CUSTO E EFEITOS
 * O(n) tempo/O(1) auxiliar; consulta nao altera.
 *
 * COMO ADAPTAR
 * A fonte remove; esta ficha apenas consulta. A remocao aparece em C10.
 *
 * ATENCAO AO CONTRATO
 * Adaptacao autoral para as classes do curso. Nao e evidencia de que caira na prova.
 *
 * ARQUIVO COMPLETO DE REFERENCIA: src/aed/classicos/Classicos.java
 * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
 * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
 * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
 * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
 * existem no codigo-base. As classes de apoio ficam em src/aed/base.
 *
 * ============================================================================
 */

import aed.base.Celula;
import aed.base.Fila;
import aed.base.Pilha;
import java.text.Normalizer;
import java.util.Locale;
import aed.base.CelulaDupla;
import aed.app.PedidoDemo;

public final class C09_KDoFim {
    public static final class Classicos {


        // ================= SOLUCAO_PEDIDA_AQUI =================
        /** k=1 consulta o ultimo item. */
            public static <E> E kEsimoDoFim(Celula<E> inicio, int k) {
                if (k <= 0) throw new IllegalArgumentException("k invalido");
                Celula<E> rapido = inicio, lento = inicio;
                for (int i = 0; i < k; i++) {
                    if (rapido == null) throw new IllegalArgumentException("k maior que tamanho");
                    rapido = rapido.getProximo();
                }
                while (rapido != null) { rapido = rapido.getProximo(); lento = lento.getProximo(); }
                return lento.getItem();
            }

        // =========== BASE E AUXILIARES NECESSARIOS ==============
        private Classicos() { }
    }
}
