/*
 * ============================================================================
 * P08 - Filtro recursivo preservando ordem
 *
 * BASE: Extensao autoral dos padroes da disciplina.
 * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
 *
 * PEDIDO E RACIOCINIO
 * Se aprova, novo no antes do resto; se nao, repassa resto filtrado.
 *
 * EXEMPLO / TESTE DE MESA
 * [1,2,3,4],par ->[2,4].
 *
 * CASOS DE BORDA
 * Nenhum;todos;vazio.
 *
 * CUSTO E EFEITOS
 * O(n) tempo/stack;O(k) dados copiados.
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

public final class P08_FiltrarNos {
    public static final class ModelosRecursivos {


        // ================= SOLUCAO_PEDIDA_AQUI =================
        public static <E> Celula<E> filtrarNos(Celula<E> atual, Predicate<E> condicao) {
                if (condicao == null) throw new IllegalArgumentException("Condicao nula");
                if (atual == null) return null;
                boolean incluir = condicao.test(atual.getItem());
                Celula<E> resto = filtrarNos(atual.getProximo(), condicao);
                return incluir ? new Celula<>(atual.getItem(), resto) : resto;
            }

        // =========== BASE E AUXILIARES NECESSARIOS ==============
        private ModelosRecursivos() { }
    }
}
