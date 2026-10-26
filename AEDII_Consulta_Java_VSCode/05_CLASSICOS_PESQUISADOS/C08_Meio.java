/*
 * ============================================================================
 * C08 - Encontrar meio com dois cursores
 *
 * BASE: LeetCode876: https://leetcode.com/problems/middle-of-the-linked-list/
 * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
 *
 * PEDIDO E RACIOCINIO
 * Lento1/rapido2. No fim, lento esta no centro. Nesta convencao, quando par
 * retorna a SEGUNDA central; vazio retorna null como extensao.
 *
 * EXEMPLO / TESTE DE MESA
 * [1,2,3,4,5]->no3;[1,2,3,4]->no3.
 *
 * CASOS DE BORDA
 * Vazia;um;par;impar.
 *
 * CUSTO E EFEITOS
 * O(n) tempo/O(1) espaco.
 *
 * COMO ADAPTAR
 * Para cortar a lista com extra na esquerda, encontre o ultimo da esquerda, nao copie cegamente essa convencao.
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

public final class C08_Meio {
    public static final class Classicos {


        // ================= SOLUCAO_PEDIDA_AQUI =================
        /** Tamanho par: segunda celula central. */
            public static <E> Celula<E> meio(Celula<E> inicio) {
                Celula<E> lento = inicio, rapido = inicio;
                while (rapido != null && rapido.getProximo() != null) {
                    lento = lento.getProximo(); rapido = rapido.getProximo().getProximo();
                }
                return lento;
            }

        // =========== BASE E AUXILIARES NECESSARIOS ==============
        private Classicos() { }
    }
}
