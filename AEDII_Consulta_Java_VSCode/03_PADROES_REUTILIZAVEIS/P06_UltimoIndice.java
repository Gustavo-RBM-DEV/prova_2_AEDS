/*
 * ============================================================================
 * P06 - Ultima ocorrencia recursiva
 *
 * BASE: Extensao autoral dos padroes da disciplina.
 * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
 *
 * PEDIDO E RACIOCINIO
 * Priorize a resposta do resto; so use atual se nao houve outra.
 *
 * EXEMPLO / TESTE DE MESA
 * [1,2,1],alvo1 ->2.
 *
 * CASOS DE BORDA
 * Unidade;repetidos;ausente.
 *
 * CUSTO E EFEITOS
 * O(n) tempo/stack.
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

public final class P06_UltimoIndice {
    public static final class ModelosRecursivos {


        // ================= SOLUCAO_PEDIDA_AQUI =================
        public static <E> int ultimoIndice(Celula<E> atual, E alvo) {
                if (atual == null) return -1;
                int resto = ultimoIndice(atual.getProximo(), alvo);
                if (resto >= 0) return 1 + resto;
                return atual.getItem().equals(alvo) ? 0 : -1;
            }

        // =========== BASE E AUXILIARES NECESSARIOS ==============
        private ModelosRecursivos() { }
    }
}
