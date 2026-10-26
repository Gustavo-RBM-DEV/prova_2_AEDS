package aed.classicos;
import aed.base.Pilha;
public class PilhaMinima<E extends Comparable<E>> {
    private final Pilha<E> dados = new Pilha<>();
    private final Pilha<E> minimos = new Pilha<>();
    public boolean vazia() { return dados.vazia(); }
    public void empilhar(E item) {
        dados.empilhar(item);
        if (minimos.vazia() || item.compareTo(minimos.consultarTopo()) <= 0) minimos.empilhar(item);
    }
    public E desempilhar() {
        E item = dados.desempilhar();
        if (item.compareTo(minimos.consultarTopo()) == 0) minimos.desempilhar();
        return item;
    }
    public E consultarTopo() { return dados.consultarTopo(); }
    public E minimo() { return minimos.consultarTopo(); }
}
