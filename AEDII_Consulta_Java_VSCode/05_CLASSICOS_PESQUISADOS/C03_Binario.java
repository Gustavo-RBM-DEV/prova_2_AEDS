/*
 * ============================================================================
 * C03 - Converter inteiro para binario
 *
 * BASE: Princeton, exercicios de pilhas: https://www.cs.princeton.edu/courses/archive/spr01/cs126/exercises/adt.html
 * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
 *
 * PEDIDO E RACIOCINIO
 * Restos das divisoes por2 saem do bit menos significativo ao mais significativo.
 * Empilhar e retirar inverte essa ordem.
 *
 * EXEMPLO / TESTE DE MESA
 * 13:restos1,0,1,1; pops1,1,0,1 ->"1101".
 *
 * CASOS DE BORDA
 * 0 precisa devolver"0";1;potencias de2;negativo rejeitado.
 *
 * CUSTO E EFEITOS
 * O(log n) tempo e memoria para n>0.
 *
 * COMO ADAPTAR
 * Outra base b usa resto%b e divide/b; bases>10 exigem mapa de digitos.
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

public final class C03_Binario {
    public static final class Classicos {


        // ================= SOLUCAO_PEDIDA_AQUI =================
        public static String binario(int n) {
                if (n < 0) throw new IllegalArgumentException("Numero negativo");
                if (n == 0) return "0";
                Pilha<Integer> p = new Pilha<>();
                while (n > 0) { p.empilhar(n % 2); n /= 2; }
                StringBuilder s = new StringBuilder();
                while (!p.vazia()) s.append(p.desempilhar());
                return s.toString();
            }

        // =========== BASE E AUXILIARES NECESSARIOS ==============
        private Classicos() { }
    }
}
