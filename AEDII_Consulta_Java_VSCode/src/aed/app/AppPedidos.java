package aed.app;
import aed.base.Fila;
import aed.base.Pilha;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;
/** Demo completa, sem arquivo produtos.txt e sem dependencias do projeto original. */
public final class AppPedidos {
    private static final Fila<PedidoDemo> filaPedidos = new Fila<>();
    private static final Pilha<PedidoDemo> pilhaPedidos = new Pilha<>();
    private static int proximoId = 1;
    private AppPedidos() { }
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
    public static void demonstrar() {
        finalizarPedido(new PedidoDemo(proximoId++, 80));
        finalizarPedido(new PedidoDemo(proximoId++, 250));
        finalizarPedido(new PedidoDemo(proximoId++, 120));
        mostrarMediaPedidos(3); mostrarPedidosFiltrados(3, 100);
        System.out.println("Fila original preservada: " + filaPedidos.tamanho());
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
}
