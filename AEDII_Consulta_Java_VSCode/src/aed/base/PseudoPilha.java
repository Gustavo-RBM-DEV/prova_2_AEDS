package aed.base;
import java.util.NoSuchElementException;
/** Usa somente vazia, enfileirar e desenfileirar da Fila. */
public class PseudoPilha<E> {
    private Fila<E> principal = new Fila<>();
    private Fila<E> auxiliar = new Fila<>();
    private int tam;
    public boolean vazia() { return principal.vazia(); }
    public void empilhar(E item) {
        auxiliar.enfileirar(item);
        while (!principal.vazia()) auxiliar.enfileirar(principal.desenfileirar());
        Fila<E> troca = principal; principal = auxiliar; auxiliar = troca;
        tam++;
    }
    public E desempilhar() {
        if (vazia()) throw new NoSuchElementException("Pilha vazia");
        E item = principal.desenfileirar(); tam--; return item;
    }
    public E consultarTopo() {
        if (vazia()) throw new NoSuchElementException("Pilha vazia");
        E item = principal.desenfileirar(); principal.enfileirar(item);
        for (int i = 1; i < tam; i++) principal.enfileirar(principal.desenfileirar());
        return item;
    }
}
