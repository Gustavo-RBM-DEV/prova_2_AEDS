/*
 * ============================================================================
 * C15 - Inverter somente os primeiros k da fila
 *
 * BASE: Variacao autoral de fila+pilha dos PDFs.
 * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
 *
 * PEDIDO E RACIOCINIO
 * Tire k para pilha; coloque pops no final; rode os n-k elementos do sufixo
 * para recolocar esse sufixo depois do prefixo invertido.
 *
 * EXEMPLO / TESTE DE MESA
 * [1,2,3,4,5],k3: [4,5,3,2,1] ->rodar2 ->[3,2,1,4,5].
 *
 * CASOS DE BORDA
 * k0;k1;kn;fora do intervalo;vazia.
 *
 * CUSTO E EFEITOS
 * O(n) tempo/O(k) auxiliar, usando API.
 *
 * COMO ADAPTAR
 * Se proibido recriar celulas, inverta os links do prefixo e reconecte ao sufixo.
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

public final class C15_InverterPrefixo {
    public static final class Classicos {


        // ================= SOLUCAO_PEDIDA_AQUI =================
        public static <E> void inverterPrimeiros(Fila<E> fila, int k) {
                int n = fila.tamanho();
                if (k < 0 || k > n) throw new IllegalArgumentException("k invalido");
                Pilha<E> p = new Pilha<>();
                for (int i = 0; i < k; i++) p.empilhar(fila.desenfileirar());
                while (!p.vazia()) fila.enfileirar(p.desempilhar());
                for (int i = 0; i < n - k; i++) fila.enfileirar(fila.desenfileirar());
            }

        // =========== BASE E AUXILIARES NECESSARIOS ==============
        private Classicos() { }
    }
}
