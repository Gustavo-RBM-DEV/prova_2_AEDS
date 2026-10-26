package aed.variacoes;
import java.util.NoSuchElementException;
/** topo e a PRIMEIRA posicao livre, nao o indice do ultimo item. */
public class PilhaVetor<E> {
    private final Object[] itens;
    private int topo;
    public PilhaVetor(int capacidade) {
        if (capacidade < 0) throw new IllegalArgumentException();
        itens = new Object[capacidade];
    }
    public boolean vazia() { return topo == 0; }
    public void empilhar(E e) {
        if (topo == itens.length) throw new IllegalStateException("Pilha cheia");
        itens[topo++] = e;
    }
    @SuppressWarnings("unchecked") public E desempilhar() {
        if (vazia()) throw new NoSuchElementException();
        E e = (E) itens[--topo]; itens[topo] = null; return e;
    }
}
