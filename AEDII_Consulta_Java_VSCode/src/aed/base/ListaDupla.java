package aed.base;
import java.util.NoSuchElementException;

/** S <-> dados; S.anterior=null e fim.proximo=null. */
public class ListaDupla<E> {
    private final CelulaDupla<E> inicio;
    private CelulaDupla<E> fim;
    private int tamanho;
    public ListaDupla() { inicio = new CelulaDupla<>(); fim = inicio; }
    public ListaDupla(Fila<E> fila) {
        this();
        if (fila == null) throw new IllegalArgumentException("Fila nula");
        Fila<E> aux = new Fila<>();
        while (!fila.vazia()) { E e = fila.desenfileirar(); inserirFim(e); aux.enfileirar(e); }
        while (!aux.vazia()) fila.enfileirar(aux.desenfileirar());
    }
    public boolean vazia() { return inicio == fim; }
    public int tamanho() { return tamanho; }
    public void inserirFim(E item) { inserir(item, tamanho); }
    public void inserir(E item, int posicao) {
        if (posicao < 0 || posicao > tamanho) throw new IndexOutOfBoundsException();
        if (item == null) throw new IllegalArgumentException("Item nulo");
        CelulaDupla<E> anterior;
        if (posicao == tamanho) anterior = fim;
        else {
            anterior = inicio;
            for (int i = 0; i < posicao; i++) anterior = anterior.getProximo();
        }
        CelulaDupla<E> seguinte = anterior.getProximo();
        CelulaDupla<E> nova = new CelulaDupla<>(item);
        nova.setAnterior(anterior); nova.setProximo(seguinte);
        anterior.setProximo(nova);
        if (seguinte != null) seguinte.setAnterior(nova); else fim = nova;
        tamanho++;
    }
    public E removerFim() {
        if (vazia()) throw new NoSuchElementException("Lista vazia");
        CelulaDupla<E> r = fim;
        fim = r.getAnterior(); fim.setProximo(null);
        r.setAnterior(null); tamanho--;
        return r.getItem();
    }
    private E desligar(CelulaDupla<E> atual) {
        CelulaDupla<E> anterior = atual.getAnterior(), seguinte = atual.getProximo();
        anterior.setProximo(seguinte);
        if (seguinte != null) seguinte.setAnterior(anterior); else fim = anterior;
        atual.setAnterior(null); atual.setProximo(null); tamanho--;
        return atual.getItem();
    }
    public E remover(int pos) {
        if (pos < 0 || pos >= tamanho) throw new IndexOutOfBoundsException();
        CelulaDupla<E> p = inicio.getProximo();
        for (int i = 0; i < pos; i++) p = p.getProximo();
        return desligar(p);
    }
    public boolean removerTodos(E item) {
        if (vazia()) throw new IllegalStateException("Lista vazia");
        boolean removeu = false;
        CelulaDupla<E> atual = inicio.getProximo();
        while (atual != null) {
            CelulaDupla<E> seguinte = atual.getProximo();
            if (atual.getItem().equals(item)) { desligar(atual); removeu = true; }
            atual = seguinte;
        }
        return removeu;
    }
    public void inverter() {
        if (vazia()) return;
        CelulaDupla<E> antigoPrimeiro = inicio.getProximo(), antigoFim = fim;
        CelulaDupla<E> atual = antigoPrimeiro;
        while (atual != null) {
            CelulaDupla<E> seguinte = atual.getProximo(), anterior = atual.getAnterior();
            atual.setProximo(anterior == inicio ? null : anterior);
            atual.setAnterior(seguinte == null ? inicio : seguinte);
            atual = seguinte;
        }
        inicio.setProximo(antigoFim); fim = antigoPrimeiro;
    }
    public boolean ehPalindromo() {
        CelulaDupla<E> a = inicio.getProximo(), b = fim;
        for (int i = 0; i < tamanho / 2; i++) {
            if (!a.getItem().equals(b.getItem())) return false;
            a = a.getProximo(); b = b.getAnterior();
        }
        return true;
    }
    /** Transfere os nos, O(1); esvazia outra. */
    public void concatenar(ListaDupla<E> outra) {
        if (outra == null || outra == this) throw new IllegalArgumentException("Origem invalida");
        if (outra.vazia()) return;
        CelulaDupla<E> primeiroOutro = outra.inicio.getProximo();
        fim.setProximo(primeiroOutro); primeiroOutro.setAnterior(fim);
        fim = outra.fim; tamanho += outra.tamanho;
        outra.inicio.setProximo(null); outra.fim = outra.inicio; outra.tamanho = 0;
    }
    public Object[] toArray() {
        Object[] a = new Object[tamanho]; int i = 0;
        for (CelulaDupla<E> p = inicio.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
        return a;
    }
    public Object[] reversoArray() {
        Object[] a = new Object[tamanho]; int i = 0;
        for (CelulaDupla<E> p = fim; p != inicio; p = p.getAnterior()) a[i++] = p.getItem();
        return a;
    }
    public boolean estruturaValida() {
        if (inicio.getAnterior() != null || fim.getProximo() != null) return false;
        int n = 0; CelulaDupla<E> anterior = inicio, p = inicio.getProximo();
        while (p != null) {
            if (p.getAnterior() != anterior || ++n > tamanho) return false;
            anterior = p; p = p.getProximo();
        }
        return anterior == fim && n == tamanho;
    }
}
