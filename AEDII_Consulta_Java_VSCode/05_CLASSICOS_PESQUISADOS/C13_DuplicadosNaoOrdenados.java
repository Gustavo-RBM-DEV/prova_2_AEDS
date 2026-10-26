/*
 * ============================================================================
 * C13 - Eliminar repetidos sem ordenar
 *
 * BASE: Variacao autoral de equals/removerTodos dos PDFs, sem colecoes prontas.
 * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
 *
 * PEDIDO E RACIOCINIO
 * Fixe cada no e retire repeticoes no trecho seguinte. Mantem a primeira
 * ocorrencia de cada item e a ordem relativa dessas ocorrencias.
 *
 * EXEMPLO / TESTE DE MESA
 * [3,1,3,2,1,2] ->[3,1,2].
 *
 * CASOS DE BORDA
 * Todos iguais;nenhum;ultimo repetido;vazia.
 *
 * CUSTO E EFEITOS
 * O(n^2) tempo/O(1) auxiliar.
 *
 * COMO ADAPTAR
 * HashSet mudaria o custo, mas e uma colecao pronta proibida na revisao. Ordenar mudaria a ordem.
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

public final class C13_DuplicadosNaoOrdenados {
    public static final class Classicos {


        // ================= SOLUCAO_PEDIDA_AQUI =================
        public static <E> Celula<E> removerDuplicados(Celula<E> inicio) {
                for (Celula<E> p = inicio; p != null; p = p.getProximo()) {
                    Celula<E> anterior = p;
                    while (anterior.getProximo() != null) {
                        if (p.getItem().equals(anterior.getProximo().getItem())) anterior.setProximo(anterior.getProximo().getProximo());
                        else anterior = anterior.getProximo();
                    }
                }
                return inicio;
            }

        // =========== BASE E AUXILIARES NECESSARIOS ==============
        private Classicos() { }
    }
}
