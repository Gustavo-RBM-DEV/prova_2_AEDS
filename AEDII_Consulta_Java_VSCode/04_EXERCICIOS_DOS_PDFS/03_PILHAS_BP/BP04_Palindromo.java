/*
 * ============================================================================
 * BP04 - String palindromo usando pilha de celulas
 *
 * BASE: Pilhas - AEDs II.pdf, questao 4, pagina 1.
 * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
 *
 * PEDIDO E RACIOCINIO
 * A pilha retira em ordem inversa; a fila retira em ordem normal. Compare cada par.
 * Esta adaptacao ignora caixa, espacos, pontuacao e acentos.
 *
 * EXEMPLO / TESTE DE MESA
 * "Socorram-me em Marrocos"->true; "arara"->true; "java"->false.
 *
 * CASOS DE BORDA
 * Vazia=true por convencao; par/impar; acentos; caixa; uma letra.
 *
 * CUSTO E EFEITOS
 * O(n) tempo e memoria.
 *
 * COMO ADAPTAR
 * Para caracteres exatos, retire a normalizacao. Sem fila, percorra o texto enquanto desempilha.
 *
 * ATENCAO AO CONTRATO
 * A normalizacao completa foi uma escolha autoral; o PDF apresenta palavras e frases.
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

public final class BP04_Palindromo {
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
