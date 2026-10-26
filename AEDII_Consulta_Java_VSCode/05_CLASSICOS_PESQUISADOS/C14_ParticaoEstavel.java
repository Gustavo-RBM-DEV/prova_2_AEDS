/*
 * ============================================================================
 * C14 - Particionar lista mantendo ordem interna
 *
 * BASE: LeetCode86: https://leetcode.com/problems/partition-list/
 * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
 *
 * PEDIDO E RACIOCINIO
 * Destaque cada no e anexe ao grupo menores ou maiores/iguais. Ao final junte
 * as duas cadeias. A ordem relativa dentro dos grupos e mantida.
 *
 * EXEMPLO / TESTE DE MESA
 * [8,3,10,1,7,12],limite7 ->[3,1,8,10,7,12].
 *
 * CASOS DE BORDA
 * Todos/nenhum aprovados;iguais ao limite;vazia;salvar seguinte antes de cortar.
 *
 * CUSTO E EFEITOS
 * O(n) tempo/O(1) auxiliar; reutiliza nos.
 *
 * COMO ADAPTAR
 * R02 retorna os menores em outra fila; aqui junta tudo numa cadeia com grupos.
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

public final class C14_ParticaoEstavel {
    public static final class Classicos {


        // ================= SOLUCAO_PEDIDA_AQUI =================
        public static <E extends Comparable<E>> Celula<E> particionarEstavel(Celula<E> inicio, E limite) {
                Celula<E> s1 = new Celula<>(), s2 = new Celula<>(), f1 = s1, f2 = s2;
                for (Celula<E> atual = inicio; atual != null;) {
                    Celula<E> seguinte = atual.getProximo(); atual.setProximo(null);
                    if (atual.getItem().compareTo(limite) < 0) { f1.setProximo(atual); f1 = atual; }
                    else { f2.setProximo(atual); f2 = atual; }
                    atual = seguinte;
                }
                f1.setProximo(s2.getProximo()); return s1.getProximo();
            }

        // =========== BASE E AUXILIARES NECESSARIOS ==============
        private Classicos() { }
    }
}
