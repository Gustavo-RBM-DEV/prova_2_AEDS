/*
 * ============================================================================
 * P11 - Copiador dos objetos E
 *
 * BASE: Extensao autoral dos padroes da disciplina.
 * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
 *
 * PEDIDO E RACIOCINIO
 * Novo no e item produzido pelo copiador. Profundidade depende da lambda.
 *
 * EXEMPLO / TESTE DE MESA
 * Copiar uma Caixa com new Caixa(valor) separa o objeto mutavel.
 *
 * CASOS DE BORDA
 * Copiadornull;retornonull;campos internos de E.
 *
 * CUSTO E EFEITOS
 * O(n) mais custo dos copiadores.
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

public final class P11_CopiarComFuncao {
    public static final class ModelosRecursivos {


        // ================= SOLUCAO_PEDIDA_AQUI =================
        public static <E> Celula<E> copiarComFuncao(Celula<E> atual, Function<E, E> copiador) {
                if (copiador == null) throw new IllegalArgumentException("Copiador nulo");
                if (atual == null) return null;
                E novo = copiador.apply(atual.getItem());
                if (novo == null) throw new IllegalArgumentException("Copia nula");
                return new Celula<>(novo, copiarComFuncao(atual.getProximo(), copiador));
            }

        // =========== BASE E AUXILIARES NECESSARIOS ==============
        private ModelosRecursivos() { }
    }
}
