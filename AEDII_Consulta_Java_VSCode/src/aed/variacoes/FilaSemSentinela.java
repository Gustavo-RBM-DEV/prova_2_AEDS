package aed.variacoes;
import aed.base.Celula;
import java.util.NoSuchElementException;
public class FilaSemSentinela<E> {
    private Celula<E> inicio, fim;
    public boolean vazia() { return inicio == null; }
    public void enfileirar(E e) {
        Celula<E> nova = new Celula<>(e);
        if (vazia()) inicio = nova; else fim.setProximo(nova);
        fim = nova;
    }
    public E desenfileirar() {
        if (vazia()) throw new NoSuchElementException();
        E e = inicio.getItem(); inicio = inicio.getProximo();
        if (inicio == null) fim = null;
        return e;
    }
}
