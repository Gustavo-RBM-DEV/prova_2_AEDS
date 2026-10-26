package aed.revisao;
import aed.base.Celula;
import java.util.NoSuchElementException;

/** Variante da revisao: inicio/fim/tamanho. Item de Celula e final. */
public class Lista<E extends Comparable<E>> {
    private Celula<E> inicio;
    private Celula<E> fim;
    private int tamanho;
    public Lista() { inicio = new Celula<>(); fim = inicio; }
    /** LF01: copia via API publica; entradas ficam na mesma ordem. */
    public Lista(aed.base.Fila<E> a, aed.base.Fila<E> b) {
        this();
        if (a == null || b == null) throw new IllegalArgumentException("Fila nula");
        aed.base.Fila<E> ca = copiarPorAPI(a), cb = copiarPorAPI(b);
        E x = ca.vazia() ? null : ca.desenfileirar();
        E y = cb.vazia() ? null : cb.desenfileirar();
        while (x != null && y != null) {
            if (x.compareTo(y) <= 0) {
                inserirFinal(x); x = ca.vazia() ? null : ca.desenfileirar();
            } else {
                inserirFinal(y); y = cb.vazia() ? null : cb.desenfileirar();
            }
        }
        if (x != null) inserirFinal(x);
        if (y != null) inserirFinal(y);
        while (!ca.vazia()) inserirFinal(ca.desenfileirar());
        while (!cb.vazia()) inserirFinal(cb.desenfileirar());
    }
    private aed.base.Fila<E> copiarPorAPI(aed.base.Fila<E> fila) {
        aed.base.Fila<E> copia = new aed.base.Fila<>(), auxiliar = new aed.base.Fila<>();
        while (!fila.vazia()) {
            E e = fila.desenfileirar(); copia.enfileirar(e); auxiliar.enfileirar(e);
        }
        while (!auxiliar.vazia()) fila.enfileirar(auxiliar.desenfileirar());
        return copia;
    }
    public boolean vazia() { return inicio == fim; }
    public int tamanho() { return tamanho; }
    public void inserirFinal(E novo) {
        if (novo == null) throw new IllegalArgumentException("Item nulo");
        Celula<E> c = new Celula<>(novo);
        fim.setProximo(c); fim = c; tamanho++;
    }
    public void inserir(E novo, int posicao) {
        if (posicao < 0 || posicao > tamanho) throw new IndexOutOfBoundsException();
        if (novo == null) throw new IllegalArgumentException("Item nulo");
        Celula<E> anterior = inicio;
        for (int i = 0; i < posicao; i++) anterior = anterior.getProximo();
        Celula<E> c = new Celula<>(novo, anterior.getProximo());
        anterior.setProximo(c); if (anterior == fim) fim = c; tamanho++;
    }
    public E remover(int posicao) {
        if (posicao < 0 || posicao >= tamanho) throw new IndexOutOfBoundsException();
        Celula<E> anterior = inicio;
        for (int i = 0; i < posicao; i++) anterior = anterior.getProximo();
        Celula<E> r = anterior.getProximo(); anterior.setProximo(r.getProximo());
        if (r == fim) fim = anterior;
        r.setProximo(null); tamanho--; return r.getItem();
    }
    public Lista<E> intercalarOrdenadas(Lista<E> outra) {
        if (outra == null) throw new IllegalArgumentException("Lista nula");
        Lista<E> nova = new Lista<>();
        Celula<E> a = inicio.getProximo(), b = outra.inicio.getProximo();
        while (a != null && b != null) {
            if (a.getItem().compareTo(b.getItem()) <= 0) {
                nova.inserirFinal(a.getItem()); a = a.getProximo();
            } else { nova.inserirFinal(b.getItem()); b = b.getProximo(); }
        }
        while (a != null) { nova.inserirFinal(a.getItem()); a = a.getProximo(); }
        while (b != null) { nova.inserirFinal(b.getItem()); b = b.getProximo(); }
        return nova;
    }
    public E obterMaior() {
        if (vazia()) throw new NoSuchElementException("Lista vazia");
        return obterMaior(inicio.getProximo());
    }
    public E obterMaior(Celula<E> aux) {
        if (aux == null) throw new NoSuchElementException("Trecho vazio");
        if (aux.getProximo() == null) return aux.getItem();
        E maiorResto = obterMaior(aux.getProximo());
        if (aux.getItem().compareTo(maiorResto) >= 0) return aux.getItem();
        return maiorResto;
    }
    public void rotacionar(int k) {
        if (k < 0 || k > tamanho) throw new IllegalArgumentException("k invalido");
        if (k == 0 || k == tamanho) return;
        Celula<E> antigoPrimeiro = inicio.getProximo(), corte = antigoPrimeiro;
        for (int i = 1; i < k; i++) corte = corte.getProximo();
        Celula<E> novoPrimeiro = corte.getProximo();
        fim.setProximo(antigoPrimeiro); corte.setProximo(null);
        inicio.setProximo(novoPrimeiro); fim = corte;
    }
    public Lista<E> dividirAoMeio() {
        Lista<E> outra = new Lista<>();
        int esquerda = (tamanho + 1) / 2;
        if (esquerda == tamanho) return outra;
        Celula<E> corte = inicio;
        for (int i = 0; i < esquerda; i++) corte = corte.getProximo();
        outra.inicio.setProximo(corte.getProximo());
        outra.fim = fim; outra.tamanho = tamanho - esquerda;
        corte.setProximo(null); fim = corte; tamanho = esquerda;
        return outra;
    }
    public void trocarDoisPrimeiros() {
        if (tamanho < 2) throw new IllegalStateException("Menos de dois itens");
        Celula<E> a = inicio.getProximo(), b = a.getProximo();
        a.setProximo(b.getProximo()); b.setProximo(a); inicio.setProximo(b);
        if (fim == b) fim = a;
    }
    public void ordenar() {
        if (tamanho <= 1) return;
        Lista<E> direita = dividirAoMeio();
        this.ordenar(); direita.ordenar();
        Lista<E> ordenada = intercalarOrdenadas(direita);
        inicio = ordenada.inicio; fim = ordenada.fim; tamanho = ordenada.tamanho;
    }
    public void inserirEmOrdem(E item) {
        if (item == null) throw new IllegalArgumentException("Item nulo");
        Celula<E> anterior = inicio;
        while (anterior.getProximo() != null && anterior.getProximo().getItem().compareTo(item) <= 0) anterior = anterior.getProximo();
        Celula<E> nova = new Celula<>(item, anterior.getProximo()); anterior.setProximo(nova);
        if (anterior == fim) fim = nova;
        tamanho++;
    }
    public Object[] toArray() {
        Object[] a = new Object[tamanho]; int i = 0;
        for (Celula<E> p = inicio.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
        return a;
    }
    public boolean estruturaValida() {
        Celula<E> lento = inicio, rapido = inicio;
        while (rapido != null && rapido.getProximo() != null) {
            lento = lento.getProximo(); rapido = rapido.getProximo().getProximo();
            if (lento == rapido) return false;
        }
        int n = 0; Celula<E> p = inicio;
        while (p.getProximo() != null) { p = p.getProximo(); n++; }
        return p == fim && n == tamanho;
    }
}
