package aed.base;
public class CelulaDupla<E> {
    private E item;
    private CelulaDupla<E> anterior, proximo;
    public CelulaDupla() { this(null); }
    public CelulaDupla(E item) { this.item = item; }
    public E getItem() { return item; }
    public void setItem(E item) { this.item = item; }
    public CelulaDupla<E> getAnterior() { return anterior; }
    public void setAnterior(CelulaDupla<E> anterior) { this.anterior = anterior; }
    public CelulaDupla<E> getProximo() { return proximo; }
    public void setProximo(CelulaDupla<E> proximo) { this.proximo = proximo; }
}
