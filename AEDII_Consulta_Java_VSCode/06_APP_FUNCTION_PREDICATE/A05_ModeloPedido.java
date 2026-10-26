/*
 * ============================================================================
 * A05 - PedidoDemo, equals e compareTo
 *
 * BASE: Atividades em imagens/codigo do chat; adaptacao autoral.
 * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
 *
 * PEDIDO E RACIOCINIO
 * Modelo pequeno independente do comercio original. ID define igualdade/ordem.
 * valorFinal fornece o dado que Function extrai. Nao troca criterio de compareTo.
 *
 * EXEMPLO / TESTE DE MESA
 * Pedido1valor250 e Pedido2valor80:ordenar natural porID,nao porpreco.
 *
 * CASOS DE BORDA
 * Valornaofinito/negativo rejeitado;mesmoID significa equals.
 *
 * CUSTO E EFEITOS
 * Acessos/comparacoes O(1).
 *
 * COMO ADAPTAR
 * Nao crie nova fila vazia no metodo de consulta. Reutilize a existente ou receba-a por parametro.
 *
 * ATENCAO AO CONTRATO
 * PedidoDemo e independente. O projeto completo original depende de classes nao fornecidas integralmente. Os contratos adicionais de null/quantidade sao declarados aqui.
 *
 * ARQUIVO COMPLETO DE REFERENCIA: src/aed/app/PedidoDemo.java
 * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
 * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
 * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
 * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
 * existem no codigo-base. As classes de apoio ficam em src/aed/base.
 *
 * ============================================================================
 */

import aed.base.Celula;
import aed.base.CelulaDupla;
import aed.base.Fila;
import aed.base.Pilha;
import aed.app.PedidoDemo;

public final class A05_ModeloPedido {
    public static final class PedidoDemo implements Comparable<PedidoDemo> {
        private final int id;
        private final double valor;

        // ================= SOLUCAO_PEDIDA_AQUI =================
        public PedidoDemo(int id, double valor) {
                if (valor < 0 || Double.isNaN(valor) || Double.isInfinite(valor)) throw new IllegalArgumentException("Valor invalido");
                this.id = id; this.valor = valor;
            }

        public int getId() { return id; }

        public double valorFinal() { return valor; }

        @Override public int compareTo(PedidoDemo outro) { return Integer.compare(id, outro.id); }

        @Override public boolean equals(Object o) {
                return o instanceof PedidoDemo && id == ((PedidoDemo) o).id;
            }

        @Override public int hashCode() { return Integer.hashCode(id); }

        // =========== BASE E AUXILIARES NECESSARIOS ==============

    }
}
