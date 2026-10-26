/*
 * ============================================================================
 * P02 - Soma recursiva por Function
 *
 * BASE: Extensao autoral dos padroes da disciplina.
 * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
 *
 * PEDIDO E RACIOCINIO
 * Use apply(item) como contribuicao, nao1. Base0.0.
 *
 * EXEMPLO / TESTE DE MESA
 * 80+250+120 ->450.
 *
 * CASOS DE BORDA
 * Extratornull;retornonull;vazio.
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

public final class P02_SomarFunction {
    public static final class ModelosRecursivos {


        // ================= SOLUCAO_PEDIDA_AQUI =================
        public static <E> double somar(Celula<E> atual, Function<E, Double> extrator) {
                if (extrator == null) throw new IllegalArgumentException("Extrator nulo");
                if (atual == null) return 0;
                Double valor = extrator.apply(atual.getItem());
                if (valor == null) throw new IllegalArgumentException("Resultado nulo");
                return valor + somar(atual.getProximo(), extrator);
            }

        // =========== BASE E AUXILIARES NECESSARIOS ==============
        private ModelosRecursivos() { }
    }
}
