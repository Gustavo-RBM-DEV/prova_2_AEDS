/*
 * ============================================================================
 * A06 - Programa para observar as chamadas
 *
 * BASE: Atividades em imagens/codigo do chat; adaptacao autoral.
 * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
 *
 * PEDIDO E RACIOCINIO
 * Imprime antes/depois da chamada. Cada nivel recebe outra referencia de celula
 * e margem de exibicao. O parametro extra e somente para este demonstrador.
 *
 * EXEMPLO / TESTE DE MESA
 * Entradas10,20,30,null;retornos0,1,2,3. Resultadofinal3.
 *
 * CASOS DE BORDA
 * Nao adicionar margem em questao cuja assinatura e fixa.
 *
 * CUSTO E EFEITOS
 * O(n) chamadas, com custo extra da exibicao.
 *
 * COMO ADAPTAR
 * Nao crie nova fila vazia no metodo de consulta. Reutilize a existente ou receba-a por parametro.
 *
 * ATENCAO AO CONTRATO
 * PedidoDemo e independente. O projeto completo original depende de classes nao fornecidas integralmente. Os contratos adicionais de null/quantidade sao declarados aqui.
 *
 * ARQUIVO COMPLETO DE REFERENCIA: src/aed/app/RecursaoPassoAPasso.java
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

public final class A06_RecursaoConsole {
    public static final class RecursaoPassoAPasso {


        // ================= SOLUCAO_PEDIDA_AQUI =================
        public static int contar(Celula<Integer> atual, String margem) {
                System.out.println(margem + "ENTROU: " + (atual == null ? "null" : atual.getItem()));
                if (atual == null) {
                    System.out.println(margem + "RETORNA 0");
                    return 0;
                }
                System.out.println(margem + "Esta chamada espera o resultado da proxima");
                int resposta = contar(atual.getProximo(), margem + "  ");
                System.out.println(margem + "VOLTOU para " + atual.getItem() + "; resposta=" + resposta);
                System.out.println(margem + "RETORNA " + (1 + resposta));
                return 1 + resposta;
            }

        public static void main(String[] args) {
                Celula<Integer> c30 = new Celula<>(30);
                Celula<Integer> c20 = new Celula<>(20, c30);
                Celula<Integer> c10 = new Celula<>(10, c20);
                System.out.println("Resultado final=" + contar(c10, ""));
            }

        // =========== BASE E AUXILIARES NECESSARIOS ==============
        private RecursaoPassoAPasso() { }
    }
}
