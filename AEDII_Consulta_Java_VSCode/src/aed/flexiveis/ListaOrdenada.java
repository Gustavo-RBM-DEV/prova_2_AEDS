package aed.flexiveis;
import aed.base.Celula;
public class ListaOrdenada<E extends Comparable<E>> {
    private final Celula<E> primeiro = new Celula<>();
    private Celula<E> ultimo = primeiro;
    private int tamanho;
    public void inserirEmOrdem(E item) {
        if (item == null) throw new IllegalArgumentException("Item nulo");
        Celula<E> anterior = primeiro;
        while (anterior.getProximo() != null && anterior.getProximo().getItem().compareTo(item) <= 0) anterior = anterior.getProximo();
        Celula<E> nova = new Celula<>(item, anterior.getProximo());
        anterior.setProximo(nova); if (anterior == ultimo) ultimo = nova; tamanho++;
    }
    public Object[] toArray() {
        Object[] a = new Object[tamanho]; int i = 0;
        for (Celula<E> p = primeiro.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
        return a;
    }
}
