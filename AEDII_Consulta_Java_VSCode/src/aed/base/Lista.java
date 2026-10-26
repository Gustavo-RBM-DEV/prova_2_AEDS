package aed.base;
import java.util.NoSuchElementException;

/** Primeiro e sentinela. Tamanho foi acrescentado explicitamente pelo acervo. */
public class Lista<E> {
    private final Celula<E> primeiro;
    private Celula<E> ultimo;
    private int tamanho;
    public Lista() { primeiro = new Celula<>(); ultimo = primeiro; }
    public boolean vazia() { return primeiro == ultimo; }
    public int tamanho() { return tamanho; }

    public void inserirFinal(E item) {
        if (item == null) throw new IllegalArgumentException("Item nulo");
        Celula<E> nova = new Celula<>(item);
        ultimo.setProximo(nova); ultimo = nova; tamanho++;
    }
    public void inserir(E item, int pos) {
        if (pos < 0 || pos > tamanho) throw new IndexOutOfBoundsException("Posicao invalida");
        if (item == null) throw new IllegalArgumentException("Item nulo");
        Celula<E> anterior = primeiro;
        for (int i = 0; i < pos; i++) anterior = anterior.getProximo();
        Celula<E> nova = new Celula<>(item, anterior.getProximo());
        anterior.setProximo(nova);
        if (anterior == ultimo) ultimo = nova;
        tamanho++;
    }
    public E remover(int pos) {
        if (pos < 0 || pos >= tamanho) throw new IndexOutOfBoundsException("Posicao invalida");
        Celula<E> anterior = primeiro;
        for (int i = 0; i < pos; i++) anterior = anterior.getProximo();
        Celula<E> r = anterior.getProximo();
        anterior.setProximo(r.getProximo());
        if (r == ultimo) ultimo = anterior;
        r.setProximo(null); tamanho--;
        return r.getItem();
    }
    public E removerInicio() {
        if (vazia()) throw new NoSuchElementException("Lista vazia");
        return remover(0);
    }
    /** Com E=Integer: remover(2) escolhe posicao; remover(Integer.valueOf(2)) escolhe valor. */
    public E remover(E itemProcurado) {
        Celula<E> anterior = primeiro;
        while (anterior.getProximo() != null && !anterior.getProximo().getItem().equals(itemProcurado)) anterior = anterior.getProximo();
        if (anterior.getProximo() == null) throw new NoSuchElementException("Item ausente");
        Celula<E> r = anterior.getProximo();
        anterior.setProximo(r.getProximo());
        if (r == ultimo) ultimo = anterior;
        r.setProximo(null); tamanho--;
        return r.getItem();
    }
    public E localizar(int pos) {
        if (pos < 0 || pos >= tamanho) throw new IndexOutOfBoundsException("Posicao invalida");
        Celula<E> p = primeiro.getProximo();
        for (int i = 0; i < pos; i++) p = p.getProximo();
        return p.getItem();
    }
    public int obterNumeroItens() {
        int n = 0;
        for (Celula<E> p = primeiro.getProximo(); p != null; p = p.getProximo()) n++;
        return n;
    }
    public int contarQtos(E item) { return contarQtos(item, primeiro.getProximo()); }
    public int contarQtos(E item, Celula<E> aux) {
        if (aux == null) return 0;
        if (aux.getItem().equals(item)) return 1 + contarQtos(item, aux.getProximo());
        return contarQtos(item, aux.getProximo());
    }
    public boolean contem(E item) { return contem(item, primeiro.getProximo()); }
    public boolean contem(E item, Celula<E> aux) {
        if (aux == null) return false;
        if (aux.getItem().equals(item)) return true;
        return contem(item, aux.getProximo());
    }
    public boolean removerTodos(E item) {
        if (vazia()) throw new IllegalStateException("Lista vazia");
        boolean removeu = false;
        Celula<E> anterior = primeiro;
        while (anterior.getProximo() != null) {
            Celula<E> atual = anterior.getProximo();
            if (atual.getItem().equals(item)) {
                anterior.setProximo(atual.getProximo());
                if (atual == ultimo) ultimo = anterior;
                atual.setProximo(null); tamanho--; removeu = true;
            } else anterior = atual;
        }
        return removeu;
    }
    public void inverter() {
        Celula<E> antigoPrimeiro = primeiro.getProximo();
        Celula<E> anterior = null, atual = antigoPrimeiro;
        while (atual != null) {
            Celula<E> seguinte = atual.getProximo();
            atual.setProximo(anterior); anterior = atual; atual = seguinte;
        }
        primeiro.setProximo(anterior);
        ultimo = antigoPrimeiro == null ? primeiro : antigoPrimeiro;
    }
    public Lista<E> invertida() {
        Lista<E> nova = new Lista<>();
        for (Celula<E> p = primeiro.getProximo(); p != null; p = p.getProximo()) nova.inserir(p.getItem(), 0);
        return nova;
    }
    @Override public Lista<E> clone() {
        Lista<E> nova = new Lista<>();
        for (Celula<E> p = primeiro.getProximo(); p != null; p = p.getProximo()) nova.inserirFinal(p.getItem());
        return nova;
    }
    public void mesclar(Lista<E> outra) {
        if (outra == null) throw new IllegalArgumentException("Lista nula");
        Lista<E> nova = new Lista<>();
        Celula<E> a = primeiro.getProximo(), b = outra.primeiro.getProximo();
        while (a != null || b != null) {
            if (a != null) { nova.inserirFinal(a.getItem()); a = a.getProximo(); }
            if (b != null) { nova.inserirFinal(b.getItem()); b = b.getProximo(); }
        }
        primeiro.setProximo(nova.primeiro.getProximo());
        ultimo = nova.vazia() ? primeiro : nova.ultimo;
        tamanho = nova.tamanho;
    }
    /** LF08: segue o exemplo do PDF, this invertida primeiro. */
    public Lista<E> mesclarInvertidas(Lista<E> outra) {
        Lista<E> a = invertida(); a.mesclar(outra.invertida()); return a;
    }
    public void unir(Pilha<E> pilha) {
        if (pilha == null) throw new IllegalArgumentException("Pilha nula");
        Pilha<E> aux = new Pilha<>();
        while (!pilha.vazia()) aux.empilhar(pilha.desempilhar());
        while (!aux.vazia()) {
            E e = aux.desempilhar(); inserirFinal(e); pilha.empilhar(e);
        }
    }
    /** Primeiras ocorrencias; troca CELULAS, sem alterar item final. */
    public void trocar(E xItem, E yItem) {
        Celula<E> ax = primeiro, ay = primeiro;
        while (ax.getProximo() != null && !ax.getProximo().getItem().equals(xItem)) ax = ax.getProximo();
        while (ay.getProximo() != null && !ay.getProximo().getItem().equals(yItem)) ay = ay.getProximo();
        Celula<E> x = ax.getProximo(), y = ay.getProximo();
        if (x == null || y == null) throw new NoSuchElementException("Item ausente");
        if (x == y) return;
        if (x.getProximo() == y) {
            ax.setProximo(y); x.setProximo(y.getProximo()); y.setProximo(x);
        } else if (y.getProximo() == x) {
            ay.setProximo(x); y.setProximo(x.getProximo()); x.setProximo(y);
        } else {
            Celula<E> nx = x.getProximo(), ny = y.getProximo();
            ax.setProximo(y); ay.setProximo(x); x.setProximo(ny); y.setProximo(nx);
        }
        if (ultimo == x) ultimo = y; else if (ultimo == y) ultimo = x;
    }
    public Object[] toArray() {
        Object[] a = new Object[tamanho]; int i = 0;
        for (Celula<E> p = primeiro.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
        return a;
    }
    public boolean estruturaValida() {
        Celula<E> lento = primeiro, rapido = primeiro;
        while (rapido != null && rapido.getProximo() != null) {
            lento = lento.getProximo(); rapido = rapido.getProximo().getProximo();
            if (lento == rapido) return false;
        }
        int n = 0; Celula<E> p = primeiro;
        while (p.getProximo() != null) { p = p.getProximo(); n++; }
        return p == ultimo && n == tamanho;
    }
}
