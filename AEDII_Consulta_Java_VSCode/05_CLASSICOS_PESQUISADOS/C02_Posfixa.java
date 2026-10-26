/*
 * ============================================================================
 * C02 - Avaliar expressao posfixa
 *
 * BASE: Tema de expressoes com pilha: https://algs4.cs.princeton.edu/13stacks/
 * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
 *
 * PEDIDO E RACIOCINIO
 * Numero empilha. Operador retira b e depois a, calcula a OP b, empilha resultado.
 * Tokens separados por espacos, operadores+,-,*,/. Interface definida neste acervo.
 *
 * EXEMPLO / TESTE DE MESA
 * "3 4 + 2 *" ->14; "10 4 -" ->6.
 *
 * CASOS DE BORDA
 * Falta operando; sobram operandos; vazio; divisao por zero; numeros negativos.
 *
 * CUSTO E EFEITOS
 * O(n) tokens e memoria, desconsiderando custo de parse de token enorme.
 *
 * COMO ADAPTAR
 * Infixa precisa precedencia. Nao inverter operandos em subtracao/divisao.
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

public final class C02_Posfixa {
    public static final class Classicos {


        // ================= SOLUCAO_PEDIDA_AQUI =================
        /** Tokens separados por espacos. O primeiro pop e o operando DIREITO. */
            public static double avaliarPosfixa(String expressao) {
                if (expressao == null || expressao.trim().isEmpty()) throw new IllegalArgumentException("Expressao vazia");
                Pilha<Double> p = new Pilha<>();
                for (String token : expressao.trim().split("\\s+")) {
                    if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                        if (p.vazia()) throw new IllegalArgumentException("Falta operando");
                        double b = p.desempilhar();
                        if (p.vazia()) throw new IllegalArgumentException("Falta operando");
                        double a = p.desempilhar();
                        if (token.equals("+")) p.empilhar(a + b);
                        else if (token.equals("-")) p.empilhar(a - b);
                        else if (token.equals("*")) p.empilhar(a * b);
                        else { if (b == 0) throw new ArithmeticException("Divisao por zero"); p.empilhar(a / b); }
                    } else p.empilhar(Double.parseDouble(token));
                }
                if (p.vazia()) throw new IllegalArgumentException("Sem resultado");
                double r = p.desempilhar();
                if (!p.vazia()) throw new IllegalArgumentException("Operandos sobrando");
                return r;
            }

        // =========== BASE E AUXILIARES NECESSARIOS ==============
        private Classicos() { }
    }
}
