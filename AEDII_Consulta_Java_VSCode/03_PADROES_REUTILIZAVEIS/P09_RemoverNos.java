/*
 * ============================================================================
 * P09 - Remocao recursiva devolvendo cabeca
 *
 * BASE: Extensao autoral dos padroes da disciplina.
 * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
 *
 * PEDIDO E RACIOCINIO
 * Se remover atual, devolva resto; senao religue e devolva atual.
 *
 * EXEMPLO / TESTE DE MESA
 * [2,1,2,3],alvo2 ->[1,3].
 *
 * CASOS DE BORDA
 * Cabeca removida;todos;fim.
 *
 * CUSTO E EFEITOS
 * O(n) tempo/stack;modifica links.
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

public final class P09_RemoverNos {
    public static final class ModelosRecursivos {


        // ================= SOLUCAO_PEDIDA_AQUI =================
        public static <E> Celula<E> removerTodosNos(Celula<E> atual, E alvo) {
                if (atual == null) return null;
                Celula<E> resto = removerTodosNos(atual.getProximo(), alvo);
                if (atual.getItem().equals(alvo)) { atual.setProximo(null); return resto; }
                atual.setProximo(resto); return atual;
            }

        // =========== BASE E AUXILIARES NECESSARIOS ==============
        private ModelosRecursivos() { }
    }
}
