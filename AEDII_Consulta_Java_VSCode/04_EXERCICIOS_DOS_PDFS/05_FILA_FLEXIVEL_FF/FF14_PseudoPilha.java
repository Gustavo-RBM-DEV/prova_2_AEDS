/*
 * ============================================================================
 * FF14 - Pilha usando filas
 *
 * BASE: Lista de Exercicios Fila Flexivel.docx.PDF, questao 14, pagina 3.
 * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
 *
 * PEDIDO E RACIOCINIO
 * Empilhar coloca novo na auxiliar antes de transferir os antigos. Troque
 * as referencias das filas. Consultar deve restaurar a ordem apos retirar.
 *
 * EXEMPLO / TESTE DE MESA
 * push10,20,30 -> principal[30,20,10]; pop retorna30.
 *
 * CASOS DE BORDA
 * Vazia; consultar duas vezes sem alterar ordem; push/pop intercalados.
 *
 * CUSTO E EFEITOS
 * Push O(n), pop O(1), consulta O(n) na API restrita; O(n) espaco.
 *
 * COMO ADAPTAR
 * Pode inverter a escolha de custos: push O(1), pop O(n).
 *
 * ATENCAO AO CONTRATO
 * A Fila fornecida nesta questao nao mostra consultarInicio; esta solucao nao usa esse metodo.
 *
 * ARQUIVO COMPLETO DE REFERENCIA: src/aed/base/PseudoPilha.java
 * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
 * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
 * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
 * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
 * existem no codigo-base. As classes de apoio ficam em src/aed/base.
 *
 * ============================================================================
 */

import java.util.NoSuchElementException;
import aed.base.Celula;
import aed.base.CelulaDupla;
import aed.base.Fila;
import aed.base.Pilha;
import aed.app.PedidoDemo;

public final class FF14_PseudoPilha {
    public static class PseudoPilha<E> {
        private Fila<E> principal = new Fila<>();
        private Fila<E> auxiliar = new Fila<>();
        private int tam;

        // ================= SOLUCAO_PEDIDA_AQUI =================
        public boolean vazia() { return principal.vazia(); }

        public void empilhar(E item) {
                auxiliar.enfileirar(item);
                while (!principal.vazia()) auxiliar.enfileirar(principal.desenfileirar());
                Fila<E> troca = principal; principal = auxiliar; auxiliar = troca;
                tam++;
            }

        public E desempilhar() {
                if (vazia()) throw new NoSuchElementException("Pilha vazia");
                E item = principal.desenfileirar(); tam--; return item;
            }

        public E consultarTopo() {
                if (vazia()) throw new NoSuchElementException("Pilha vazia");
                E item = principal.desenfileirar(); principal.enfileirar(item);
                for (int i = 1; i < tam; i++) principal.enfileirar(principal.desenfileirar());
                return item;
            }

        // =========== BASE E AUXILIARES NECESSARIOS ==============

    }
}
