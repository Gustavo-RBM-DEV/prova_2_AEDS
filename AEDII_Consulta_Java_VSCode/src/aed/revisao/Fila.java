package aed.revisao;
import aed.base.Celula;
import java.util.NoSuchElementException;
/** Variante da revisao: inicio/fim, com Comparable para ordenar. */
public class Fila<E extends Comparable<E>> {
    private final Celula<E> inicio;
    private Celula<E> fim;
    public Fila() { inicio = new Celula<>(); fim = inicio; }
    public Fila(E[] a, E[] b) {
        this();
        if (a == null || b == null) throw new IllegalArgumentException("Array nulo");
        int i = 0, j = 0;
        while (i < a.length && j < b.length) {
            if (a[i].compareTo(b[j]) <= 0) enfileirar(a[i++]);
            else enfileirar(b[j++]);
        }
        while (i < a.length) enfileirar(a[i++]);
        while (j < b.length) enfileirar(b[j++]);
    }
    public boolean vazia() { return inicio == fim; }
    public void enfileirar(E item) {
        if (item == null) throw new IllegalArgumentException("Item nulo");
        Celula<E> nova = new Celula<>(item);
        fim.setProximo(nova); fim = nova;
    }
    public E consultarInicio() {
        if (vazia()) throw new NoSuchElementException("Fila vazia");
        return inicio.getProximo().getItem();
    }
    public E desenfileirar() {
        E item = consultarInicio();
        Celula<E> r = inicio.getProximo(); inicio.setProximo(r.getProximo());
        if (r == fim) fim = inicio;
        r.setProximo(null); return item;
    }
    public E obterItem(int pos) { return obterItem(inicio.getProximo(), pos); }
    public E obterItem(Celula<E> aux, int pos) {
        if (pos < 0 || aux == null) throw new IndexOutOfBoundsException("Posicao inexistente");
        if (pos == 0) return aux.getItem();
        return obterItem(aux.getProximo(), pos - 1);
    }
    public Fila<E> extrairMenores(E limite) {
        if (limite == null) throw new IllegalArgumentException("Limite nulo");
        Fila<E> nova = new Fila<>();
        Celula<E> anterior = inicio, atual = inicio.getProximo();
        while (atual != null) {
            Celula<E> seguinte = atual.getProximo();
            if (atual.getItem().compareTo(limite) < 0) {
                anterior.setProximo(seguinte);
                if (fim == atual) fim = anterior;
                atual.setProximo(null);
                nova.fim.setProximo(atual); nova.fim = atual;
            } else anterior = atual;
            atual = seguinte;
        }
        return nova;
    }
    public Object[] toArray() {
        int n = 0;
        for (Celula<E> p = inicio.getProximo(); p != null; p = p.getProximo()) n++;
        Object[] a = new Object[n]; int i = 0;
        for (Celula<E> p = inicio.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
        return a;
    }
    public boolean estruturaValida() {
        Celula<E> lento = inicio, rapido = inicio;
        while (rapido != null && rapido.getProximo() != null) {
            lento = lento.getProximo(); rapido = rapido.getProximo().getProximo();
            if (lento == rapido) return false;
        }
        Celula<E> p = inicio;
        while (p.getProximo() != null) p = p.getProximo();
        return p == fim;
    }
}
