/*
 * ============================================================================
 * C10 - Remover n-esimo a partir do final
 *
 * BASE: LeetCode19: https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
 *
 * PEDIDO E RACIOCINIO
 * Sentinela temporaria permite retirar cabeca sem ramo especial. Mantenha a
 * distancia entre cursores e pare com lento no predecessor do alvo.
 *
 * EXEMPLO / TESTE DE MESA
 * [10,20,30,40],k2 ->[10,20,40];[10],k1 ->null.
 *
 * CASOS DE BORDA
 * Cabeca;ultimo;unico;k invalido deve falhar antes de alterar.
 *
 * CUSTO E EFEITOS
 * O(n) tempo/O(1) auxiliar; devolve nova cabeca.
 *
 * COMO ADAPTAR
 * Adapte fim/tamanho do objeto Lista no wrapper. Ignorar retorno pode manter a antiga cabeca removida.
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

public final class C10_RemoverKDoFim {
    public static final class Classicos {


        // ================= SOLUCAO_PEDIDA_AQUI =================
        public static <E> Celula<E> removerKEsimoDoFim(Celula<E> inicio, int k) {
                if (k <= 0) throw new IllegalArgumentException("k invalido");
                Celula<E> s = new Celula<>(null, inicio), rapido = s, lento = s;
                for (int i = 0; i < k; i++) {
                    rapido = rapido.getProximo();
                    if (rapido == null) throw new IllegalArgumentException("k maior que tamanho");
                }
                while (rapido.getProximo() != null) { rapido = rapido.getProximo(); lento = lento.getProximo(); }
                lento.setProximo(lento.getProximo().getProximo());
                return s.getProximo();
            }

        // =========== BASE E AUXILIARES NECESSARIOS ==============
        private Classicos() { }
    }
}
