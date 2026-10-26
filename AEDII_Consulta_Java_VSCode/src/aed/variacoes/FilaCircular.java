package aed.variacoes;
import java.util.NoSuchElementException;
/** Usa um espaco vazio no array para distinguir cheia de vazia. */
public class FilaCircular<E> {
    private final Object[] itens;
    private int frente, tras;
    public FilaCircular(int capacidade) {
        if (capacidade <= 0 || capacidade == Integer.MAX_VALUE) throw new IllegalArgumentException();
        itens = new Object[capacidade + 1];
    }
    public boolean vazia() { return frente == tras; }
    public boolean cheia() { return (tras + 1) % itens.length == frente; }
    public int tamanho() { return (tras - frente + itens.length) % itens.length; }
    public void enfileirar(E item) {
        if (cheia()) throw new IllegalStateException("Fila cheia");
        itens[tras] = item; tras = (tras + 1) % itens.length;
    }
    @SuppressWarnings("unchecked") public E desenfileirar() {
        if (vazia()) throw new NoSuchElementException();
        E item = (E) itens[frente]; itens[frente] = null;
        frente = (frente + 1) % itens.length; return item;
    }
}
