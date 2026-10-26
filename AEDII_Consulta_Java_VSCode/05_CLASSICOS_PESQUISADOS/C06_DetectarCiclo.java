/*
 * ============================================================================
 * C06 - Linked List Cycle
 *
 * BASE: LeetCode141: https://leetcode.com/problems/linked-list-cycle/
 * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
 *
 * PEDIDO E RACIOCINIO
 * Lento anda1, rapido2. Se rapido chega a null, nao ha ciclo. Se se encontram
 * na MESMA celula, ha ciclo. Valores repetidos nao provam ciclo.
 *
 * EXEMPLO / TESTE DE MESA
 * A->B->C->null:false. A->B->C->B...:true.
 *
 * CASOS DE BORDA
 * Vazia;autoenlace;no unico sem ciclo;cauda antes do ciclo.
 *
 * CUSTO E EFEITOS
 * O(n) tempo/O(1) memoria; nao altera.
 *
 * COMO ADAPTAR
 * Use == entre referencias das celulas, nao equals entre valores.
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

public final class C06_DetectarCiclo {
    public static final class Classicos {


        // ================= SOLUCAO_PEDIDA_AQUI =================
        public static <E> boolean temCiclo(Celula<E> inicio) {
                Celula<E> lento = inicio, rapido = inicio;
                while (rapido != null && rapido.getProximo() != null) {
                    lento = lento.getProximo(); rapido = rapido.getProximo().getProximo();
                    if (lento == rapido) return true;
                }
                return false;
            }

        // =========== BASE E AUXILIARES NECESSARIOS ==============
        private Classicos() { }
    }
}
