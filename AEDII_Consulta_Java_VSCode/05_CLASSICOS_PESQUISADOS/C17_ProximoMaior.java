/*
 * ============================================================================
 * C17 - Proximo maior com pilha monotona
 *
 * BASE: Adaptacao de LeetCode496: https://leetcode.com/problems/next-greater-element-i/
 * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
 *
 * PEDIDO E RACIOCINIO
 * Pilha guarda indices sem resposta. Valor novo maior que topo resolve aquele
 * indice; repita enquanto resolver e depois empilhe indice atual.
 *
 * EXEMPLO / TESTE DE MESA
 * [2,1,2,4,3] ->[4,2,4,-1,-1].
 *
 * CASOS DE BORDA
 * Vazio;crescente;decrescente;iguais;negativos.
 *
 * CUSTO E EFEITOS
 * O(n) tempo amortizado/O(n) memoria; cada indice entra/sai uma vez.
 *
 * COMO ADAPTAR
 * A fonte tem dois arrays. Aqui e um unico vetor, com -1 para ausencia, interface explicitamente adaptada.
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

public final class C17_ProximoMaior {
    public static final class Classicos {


        // ================= SOLUCAO_PEDIDA_AQUI =================
        public static int[] proximosMaiores(int[] a) {
                int[] resultado = new int[a.length]; Pilha<Integer> indices = new Pilha<>();
                for (int i = 0; i < a.length; i++) {
                    resultado[i] = -1;
                    while (!indices.vazia() && a[i] > a[indices.consultarTopo()]) resultado[indices.desempilhar()] = a[i];
                    indices.empilhar(i);
                }
                return resultado;
            }

        // =========== BASE E AUXILIARES NECESSARIOS ==============
        private Classicos() { }
    }
}
