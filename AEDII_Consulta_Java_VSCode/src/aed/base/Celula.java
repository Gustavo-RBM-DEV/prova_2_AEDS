package aed.base;

/** Um objeto celula: item e a referencia de um E; proximo referencia outra celula. */
public class Celula<E> {
    private final E item;
    private Celula<E> proximo;
    public Celula() { this(null, null); }
    public Celula(E item) { this(item, null); }
    public Celula(E item, Celula<E> proximo) {
        this.item = item;
        this.proximo = proximo;
    }
    public E getItem() { return item; }
    public Celula<E> getProximo() { return proximo; }
    public void setProximo(Celula<E> proximo) { this.proximo = proximo; }
}
