/*
 * ============================================================================
 * C05 - Reverse Linked List iterativo e recursivo
 *
 * BASE: LeetCode206: https://leetcode.com/problems/reverse-linked-list/
 * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
 *
 * PEDIDO E RACIOCINIO
 * Reaproveite nos. Iterativa salva seguinte e vira seta. Recursiva inverte
 * resto, faz proxima apontar ao atual, termina atual.proximo=null e repassa cabeca.
 *
 * EXEMPLO / TESTE DE MESA
 * 10->20->30->null ->30->20->10->null.
 *
 * CASOS DE BORDA
 * null;unidade;2;inverter duas vezes.
 *
 * CUSTO E EFEITOS
 * O(n) tempo; auxiliarO(1) iterativo/O(n) recursivo.
 *
 * COMO ADAPTAR
 * Parametro e primeiro DADO, sem sentinela. Wrapper precisa adotar retorno e atualizar fim.
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

public final class C05_InverterCadeia {
    public static final class Classicos {


        // ================= SOLUCAO_PEDIDA_AQUI =================
        /** Cadeias SEM sentinela: devolver a nova cabeca nao atualiza seu objeto Lista. */
            public static <E> Celula<E> inverterLigacoes(Celula<E> atual) {
                Celula<E> anterior = null;
                while (atual != null) {
                    Celula<E> seguinte = atual.getProximo();
                    atual.setProximo(anterior); anterior = atual; atual = seguinte;
                }
                return anterior;
            }

        public static <E> Celula<E> inverterLigacoesRec(Celula<E> atual) {
                if (atual == null || atual.getProximo() == null) return atual;
                Celula<E> novaCabeca = inverterLigacoesRec(atual.getProximo());
                atual.getProximo().setProximo(atual); atual.setProximo(null);
                return novaCabeca;
            }

        // =========== BASE E AUXILIARES NECESSARIOS ==============
        private Classicos() { }
    }
}
