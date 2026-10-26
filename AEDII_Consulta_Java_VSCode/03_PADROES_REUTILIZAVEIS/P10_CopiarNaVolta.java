/*
 * ============================================================================
 * P10 - Montar resultado na volta
 *
 * BASE: Extensao autoral dos padroes da disciplina.
 * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
 *
 * PEDIDO E RACIOCINIO
 * Recursao primeiro, enfileirar depois. A fila destino e compartilhada.
 *
 * EXEMPLO / TESTE DE MESA
 * [10,20,30] ->[30,20,10].
 *
 * CASOS DE BORDA
 * Vazio;unitario;origem intacta.
 *
 * CUSTO E EFEITOS
 * O(n) tempo/stack/celulas.
 *
 * COMO ADAPTAR
 * Confirme a assinatura permitida. Estes metodos extras nao substituem assinaturas fixas dos PDFs.
 *
 * ATENCAO AO CONTRATO
 * Modelos de cadeia recebem primeiro DADO, nao sentinela. Retorno de cabeca exige atualizar controles da estrutura no wrapper.
 *
 * ARQUIVO COMPLETO DE REFERENCIA: src/aed/variacoes/ModelosRecursivos.java
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
import java.util.function.Function;
import java.util.function.Predicate;
import aed.base.CelulaDupla;
import aed.base.Pilha;
import aed.app.PedidoDemo;

public final class P10_CopiarNaVolta {
    public static final class ModelosRecursivos {


        // ================= SOLUCAO_PEDIDA_AQUI =================
        public static <E> Fila<E> copiarInvertido(Celula<E> atual) {
                Fila<E> nova = new Fila<>(); copiarNaVolta(atual, nova); return nova;
            }

        // =========== BASE E AUXILIARES NECESSARIOS ==============
        private ModelosRecursivos() { }

        private static <E> void copiarNaVolta(Celula<E> atual, Fila<E> nova) {
                if (atual == null) return;
                copiarNaVolta(atual.getProximo(), nova);
                nova.enfileirar(atual.getItem());
            }
    }
}
