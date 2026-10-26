/*
 * ============================================================================
 * C12 - Eliminar duplicados consecutivos
 *
 * BASE: LeetCode83: https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
 *
 * PEDIDO E RACIOCINIO
 * Compare atual com proximo. Igual: pule proximo e mantenha atual para testar
 * a nova candidata. Diferente: avance.
 *
 * EXEMPLO / TESTE DE MESA
 * [1,1,1,2,3,3] ->[1,2,3].
 *
 * CASOS DE BORDA
 * Vazia;unidade;todos iguais;nenhuma duplicata.
 *
 * CUSTO E EFEITOS
 * O(n) tempo/O(1) auxiliar; altera ligacoes.
 *
 * COMO ADAPTAR
 * Lista deve estar ordenada para que todos os iguais fiquem juntos.
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

public final class C12_DuplicadosOrdenados {
    public static final class Classicos {


        // ================= SOLUCAO_PEDIDA_AQUI =================
        public static <E> Celula<E> removerDuplicadosOrdenados(Celula<E> inicio) {
                Celula<E> p = inicio;
                while (p != null && p.getProximo() != null) {
                    if (p.getItem().equals(p.getProximo().getItem())) p.setProximo(p.getProximo().getProximo());
                    else p = p.getProximo();
                }
                return inicio;
            }

        // =========== BASE E AUXILIARES NECESSARIOS ==============
        private Classicos() { }
    }
}
