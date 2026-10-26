/*
 * ============================================================================
 * C04 - Frase palindromo com fila e pilha
 *
 * BASE: Princeton Palindrome checker: https://algs4.cs.princeton.edu/13stacks/
 * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
 *
 * PEDIDO E RACIOCINIO
 * Compare retirada FIFO com LIFO dos mesmos caracteres. A implementacao ignora
 * caixa/espacos/pontuacao e ainda remove acentos como adaptacao explicita.
 *
 * EXEMPLO / TESTE DE MESA
 * "A grama e amarga" ->true; "abc"->false.
 *
 * CASOS DE BORDA
 * Vazia;unidade;pares/impares;Unicode;normalizacao.
 *
 * CUSTO E EFEITOS
 * O(n) tempo/memoria; String nao muda.
 *
 * COMO ADAPTAR
 * Exigir caracteres exatos muda o resultado: remova normalizacao nesse contrato.
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

public final class C04_Palindromo {
    public static final class Classicos {


        // ================= SOLUCAO_PEDIDA_AQUI =================
        /** Politica explicita: ignora caixa, espacos, pontuacao e marcas de acento. */
            public static boolean palindromo(String texto) {
                if (texto == null) throw new IllegalArgumentException("Texto nulo");
                String s = Normalizer.normalize(texto, Normalizer.Form.NFD).replaceAll("\\p{M}+", "").toLowerCase(Locale.ROOT);
                Pilha<Integer> p = new Pilha<>(); Fila<Integer> f = new Fila<>();
                for (int i = 0; i < s.length();) {
                    int c = s.codePointAt(i); i += Character.charCount(c);
                    if (Character.isLetterOrDigit(c)) { p.empilhar(c); f.enfileirar(c); }
                }
                while (!f.vazia()) if (!f.desenfileirar().equals(p.desempilhar())) return false;
                return true;
            }

        // =========== BASE E AUXILIARES NECESSARIOS ==============
        private Classicos() { }
    }
}
