/*
 * ============================================================================
 * C01 - Balanceamento de parenteses/chaves/colchetes
 *
 * BASE: HackerRank Balanced Brackets: https://www.hackerrank.com/challenges/balanced-brackets/problem
 * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
 *
 * PEDIDO E RACIOCINIO
 * Empilhe aberturas; cada fechamento deve combinar com a ultima abertura.
 * Nesta adaptacao retorna boolean e ignora outros caracteres; fonte usa YES/NO.
 *
 * EXEMPLO / TESTE DE MESA
 * {[()]}->true;([)]->false;(() ->false.
 *
 * CASOS DE BORDA
 * Vazia; fechamento inicial; aberturas restantes; tipos cruzados.
 *
 * CUSTO E EFEITOS
 * O(n) tempo/memoria. Cada simbolo empilha/desempilha no maximo uma vez.
 *
 * COMO ADAPTAR
 * Contar quantidades nao basta: ([)] tem as quantidades certas e a ordem errada.
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

public final class C01_Delimitadores {
    public static final class Classicos {


        // ================= SOLUCAO_PEDIDA_AQUI =================
        public static boolean delimitadoresBalanceados(String texto) {
                if (texto == null) throw new IllegalArgumentException("Texto nulo");
                Pilha<Character> p = new Pilha<>();
                for (int i = 0; i < texto.length(); i++) {
                    char c = texto.charAt(i);
                    if (c == '(' || c == '[' || c == '{') p.empilhar(c);
                    else if (c == ')' || c == ']' || c == '}') {
                        if (p.vazia()) return false;
                        char a = p.desempilhar();
                        if ((c == ')' && a != '(') || (c == ']' && a != '[') || (c == '}' && a != '{')) return false;
                    }
                }
                return p.vazia();
            }

        // =========== BASE E AUXILIARES NECESSARIOS ==============
        private Classicos() { }
    }
}
