package aed.app;
/** Exemplo independente: nao substitui a classe Pedido original do comercio. */
public final class PedidoDemo implements Comparable<PedidoDemo> {
    private final int id;
    private final double valor;
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
    @Override public String toString() { return "Pedido " + id + " = " + valor; }
}
