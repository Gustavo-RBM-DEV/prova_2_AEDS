/*
 * ============================================================================
 * C07 - Encontrar entrada do ciclo
 *
 * BASE: LeetCode142: https://leetcode.com/problems/linked-list-cycle-ii/
 * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
 *
 * PEDIDO E RACIOCINIO
 * Encontre colisao lento/rapido. Reposicione um na cabeca e ande ambos1 passo.
 * O encontro seguinte identifica a entrada, nao necessariamente a colisao anterior.
 *
 * EXEMPLO / TESTE DE MESA
 * A->B->C->D->B...: devolve referencia de B.
 *
 * CASOS DE BORDA
 * Sem ciclo retorna null;autoenlace;ciclo na cabeca.
 *
 * CUSTO E EFEITOS
 * O(n) tempo/O(1) auxiliar; nao altera links.
 *
 * COMO ADAPTAR
 * Nao retornar a primeira colisao como se sempre fosse entrada.
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

public final class C07_InicioDoCiclo {
    public static final class Classicos {


        // ================= SOLUCAO_PEDIDA_AQUI =================
        public static <E> Celula<E> inicioDoCiclo(Celula<E> inicio) {
                Celula<E> lento = inicio, rapido = inicio;
                while (rapido != null && rapido.getProximo() != null) {
                    lento = lento.getProximo(); rapido = rapido.getProximo().getProximo();
                    if (lento == rapido) {
                        lento = inicio;
                        while (lento != rapido) { lento = lento.getProximo(); rapido = rapido.getProximo(); }
                        return lento;
                    }
                }
                return null;
            }

        // =========== BASE E AUXILIARES NECESSARIOS ==============
        private Classicos() { }
    }
}
