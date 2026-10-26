/*
 * ============================================================================
 * C16 - Josephus com fila
 *
 * BASE: Princeton Josephus: https://algs4.cs.princeton.edu/13stacks/
 * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
 *
 * PEDIDO E RACIOCINIO
 * Pessoas0..n-1. Rode m-1 posicoes e retire a proxima; repita ate sobrar uma.
 * Esta adaptacao retorna sobrevivente em vez de imprimir eliminacoes.
 *
 * EXEMPLO / TESTE DE MESA
 * n7,m3 ->sobrevivente3 (base0); base1 seria4.
 *
 * CASOS DE BORDA
 * n1;m1;m>n;valoresinvalidos.
 *
 * CUSTO E EFEITOS
 * O(n^2) pior com modulo de voltas; O(n) memoria.
 *
 * COMO ADAPTAR
 * Formula recursiva matematica nao simula fila, caso a questao exija essa estrutura.
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

public final class C16_Josephus {
    public static final class Classicos {


        // ================= SOLUCAO_PEDIDA_AQUI =================
        /** Pessoas 0..n-1; retorna sobrevivente. */
            public static int josephus(int n, int m) {
                if (n <= 0 || m <= 0) throw new IllegalArgumentException();
                Fila<Integer> f = new Fila<>();
                for (int i = 0; i < n; i++) f.enfileirar(i);
                for (int restam = n; restam > 1; restam--) {
                    int passos = (m - 1) % restam;
                    for (int i = 0; i < passos; i++) f.enfileirar(f.desenfileirar());
                    f.desenfileirar();
                }
                return f.desenfileirar();
            }

        // =========== BASE E AUXILIARES NECESSARIOS ==============
        private Classicos() { }
    }
}
