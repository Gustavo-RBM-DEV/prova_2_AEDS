/*
 * ============================================================================
 * A01 - App executavel com Function e Predicate
 *
 * BASE: Atividades em imagens/codigo do chat; adaptacao autoral.
 * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
 *
 * PEDIDO E RACIOCINIO
 * Crie uma fila compartilhada fora dos metodos. Finalizar enfileira. App define
 * a lambda; Fila apenas a executa para cada item. --interativo abre o menu de console.
 *
 * EXEMPLO / TESTE DE MESA
 * Demo80,250,120 ->media150;filtro>=100 ->250,120;origem3itens.
 *
 * CASOS DE BORDA
 * Quantidade invalida;pedido null;valores nao finitos.
 *
 * CUSTO E EFEITOS
 * Custos herdados das operacoes da Fila.
 *
 * COMO ADAPTAR
 * Nao crie nova fila vazia no metodo de consulta. Reutilize a existente ou receba-a por parametro.
 *
 * ATENCAO AO CONTRATO
 * PedidoDemo e independente. O projeto completo original depende de classes nao fornecidas integralmente. Os contratos adicionais de null/quantidade sao declarados aqui.
 *
 * ARQUIVO COMPLETO DE REFERENCIA: src/aed/app/AppPedidos.java
 * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
 * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
 * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
 * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
 * existem no codigo-base. As classes de apoio ficam em src/aed/base.
 *
 * ============================================================================
 */

import aed.base.Fila;
import aed.base.Pilha;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;
import aed.base.Celula;
import aed.base.CelulaDupla;
import aed.app.PedidoDemo;

public final class A01_AppCompleta {
    public static final class AppPedidos {
        private static final Fila<PedidoDemo> filaPedidos = new Fila<>();
        private static final Pilha<PedidoDemo> pilhaPedidos = new Pilha<>();
        private static int proximoId = 1;

        // ================= SOLUCAO_PEDIDA_AQUI =================
        public static void finalizarPedido(PedidoDemo pedido) {
                if (pedido == null) throw new IllegalArgumentException("Pedido nulo");
                filaPedidos.enfileirar(pedido); pilhaPedidos.empilhar(pedido);
            }

        public static void mostrarMediaPedidos(int quantidade) {
                Function<PedidoDemo, Double> extrator = pedido -> pedido.valorFinal();
                double media = filaPedidos.calcularValorMedio(extrator, quantidade);
                System.out.printf("Media: %.2f%n", media);
            }

        public static void mostrarPedidosFiltrados(int quantidade, double minimo) {
                Predicate<PedidoDemo> condicao = pedido -> pedido.valorFinal() >= minimo;
                Fila<PedidoDemo> filtrados = filaPedidos.filtrar(condicao, quantidade);
                while (!filtrados.vazia()) System.out.println(filtrados.desenfileirar());
            }

        public static void main(String[] args) {
                if (args.length == 0 || !args[0].equals("--interativo")) { demonstrar(); return; }
                Scanner sc = new Scanner(System.in, "UTF-8");
                while (true) {
                    System.out.println("1 cadastrar, 2 media, 3 filtrar, 4 listar, 0 sair");
                    if (!sc.hasNextLine()) break;
                    String opcao = sc.nextLine().trim();
                    if (opcao.equals("0")) break;
                    try {
                        if (opcao.equals("1")) {
                            System.out.println("Valor:");
                            finalizarPedido(new PedidoDemo(proximoId++, Double.parseDouble(sc.nextLine().trim().replace(',', '.'))));
                        } else if (opcao.equals("2")) {
                            System.out.println("Quantidade:"); mostrarMediaPedidos(Integer.parseInt(sc.nextLine().trim()));
                        } else if (opcao.equals("3")) {
                            System.out.println("Quantidade:"); int n = Integer.parseInt(sc.nextLine().trim());
                            System.out.println("Minimo:"); double minimo = Double.parseDouble(sc.nextLine().trim().replace(',', '.'));
                            if (Double.isNaN(minimo) || Double.isInfinite(minimo)) throw new IllegalArgumentException("Minimo invalido");
                            mostrarPedidosFiltrados(n, minimo);
                        } else if (opcao.equals("4")) {
                            Fila<PedidoDemo> copia = filaPedidos.copiar();
                            while (!copia.vazia()) System.out.println(copia.desenfileirar());
                        } else System.out.println("Opcao invalida");
                    } catch (IllegalArgumentException e) { System.out.println(e.getMessage()); }
                }
                sc.close();
            }

        // =========== BASE E AUXILIARES NECESSARIOS ==============
        private AppPedidos() { }

        public static void demonstrar() {
                finalizarPedido(new PedidoDemo(proximoId++, 80));
                finalizarPedido(new PedidoDemo(proximoId++, 250));
                finalizarPedido(new PedidoDemo(proximoId++, 120));
                mostrarMediaPedidos(3); mostrarPedidosFiltrados(3, 100);
                System.out.println("Fila original preservada: " + filaPedidos.tamanho());
            }
    }
}
