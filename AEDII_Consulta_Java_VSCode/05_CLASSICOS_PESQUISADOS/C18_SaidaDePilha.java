/*
 * ============================================================================
 * C18 - Validar sequencia de desempilhamento
 *
 * BASE: Princeton exercicios de push/pop: https://www.cs.princeton.edu/courses/archive/spr01/cs126/exercises/adt.html
 * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
 *
 * PEDIDO E RACIOCINIO
 * Empilhe os valores da entrada. Enquanto o topo coincide com a proxima
 * saida desejada, retire e avance a saida. No fim todas devem ter sido produzidas.
 *
 * EXEMPLO / TESTE DE MESA
 * entrada[1,2,3],saida[2,3,1]:true;saida[3,1,2]:false.
 *
 * CASOS DE BORDA
 * Vazios;comprimentos diferentes;valores repetidos conforme contrato.
 *
 * CUSTO E EFEITOS
 * O(n) tempo/O(n) auxiliar.
 *
 * COMO ADAPTAR
 * Ter os mesmos valores nao prova que a ordem de saida pode ser obtida por uma pilha.
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

public final class C18_SaidaDePilha {
    public static final class Classicos {


        // ================= SOLUCAO_PEDIDA_AQUI =================
        public static boolean sequenciaDesempilhavel(int[] entrada, int[] saida) {
                if (entrada.length != saida.length) return false;
                Pilha<Integer> p = new Pilha<>(); int j = 0;
                for (int x : entrada) {
                    p.empilhar(x);
                    while (!p.vazia() && j < saida.length && p.consultarTopo() == saida[j]) { p.desempilhar(); j++; }
                }
                return j == saida.length;
            }

        // =========== BASE E AUXILIARES NECESSARIOS ==============
        private Classicos() { }
    }
}
