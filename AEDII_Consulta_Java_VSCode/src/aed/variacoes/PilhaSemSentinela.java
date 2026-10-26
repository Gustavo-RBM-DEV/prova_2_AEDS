package aed.variacoes;
import aed.base.Celula;
import java.util.NoSuchElementException;
public class PilhaSemSentinela<E> {
    private Celula<E> topo;
    public boolean vazia() { return topo == null; }
    public void empilhar(E item) { topo = new Celula<>(item, topo); }
    public E consultarTopo() {
        if (vazia()) throw new NoSuchElementException();
        return topo.getItem();
    }
    public E desempilhar() { E e = consultarTopo(); topo = topo.getProximo(); return e; }
}
