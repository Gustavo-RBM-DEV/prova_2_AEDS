package aed.base;
/** Entrada recebe; saida entrega. So transfere quando saida esvazia. */
public class PseudoFila<E> {
    private final Pilha<E> entrada = new Pilha<>();
    private final Pilha<E> saida = new Pilha<>();
    public boolean vazia() { return entrada.vazia() && saida.vazia(); }
    public void enfileirar(E item) { entrada.empilhar(item); }
    private void prepararSaida() {
        if (saida.vazia()) while (!entrada.vazia()) saida.empilhar(entrada.desempilhar());
    }
    public E desenfileirar() { prepararSaida(); return saida.desempilhar(); }
    public E consultarInicio() { prepararSaida(); return saida.consultarTopo(); }
}
