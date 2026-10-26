/*
 * ============================================================================
 * P05 - Ausencia com marcador -1
 *
 * BASE: Extensao autoral dos padroes da disciplina.
 * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
 *
 * PEDIDO E RACIOCINIO
 * Nao somar1 ao marcador-1: propague ausencia intacta.
 *
 * EXEMPLO / TESTE DE MESA
 * [1,2,3],alvo9 ->-1.
 *
 * CASOS DE BORDA
 * Vazio;primeiro;ultimo;ausente.
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

public final class P05_IndiceOuMenosUm {
    public static final class ModelosRecursivos {


        // ================= SOLUCAO_PEDIDA_AQUI =================
        public static <E> int indiceOuMenosUm(Celula<E> atual, E alvo) {
                if (atual == null) return -1;
                if (atual.getItem().equals(alvo)) return 0;
                int resto = indiceOuMenosUm(atual.getProximo(), alvo);
                return resto < 0 ? -1 : 1 + resto;
            }

        // =========== BASE E AUXILIARES NECESSARIOS ==============
        private ModelosRecursivos() { }
    }
}
