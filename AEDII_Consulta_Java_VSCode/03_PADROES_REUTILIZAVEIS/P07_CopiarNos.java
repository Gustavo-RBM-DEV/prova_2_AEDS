/*
 * ============================================================================
 * P07 - Copiar cadeia devolvendo cabeca
 *
 * BASE: Extensao autoral dos padroes da disciplina.
 * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
 *
 * PEDIDO E RACIOCINIO
 * Null devolve null. Cada chamada cria um no antes da copia do resto.
 *
 * EXEMPLO / TESTE DE MESA
 * A->B->null vira Anovo->Bnovo->null.
 *
 * CASOS DE BORDA
 * Nos diferentes;itens compartilhados;vazio.
 *
 * CUSTO E EFEITOS
 * O(n) novas celulas e chamadas.
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

public final class P07_CopiarNos {
    public static final class ModelosRecursivos {


        // ================= SOLUCAO_PEDIDA_AQUI =================
        public static <E> Celula<E> copiarNos(Celula<E> atual) {
                if (atual == null) return null;
                return new Celula<>(atual.getItem(), copiarNos(atual.getProximo()));
            }

        // =========== BASE E AUXILIARES NECESSARIOS ==============
        private ModelosRecursivos() { }
    }
}
