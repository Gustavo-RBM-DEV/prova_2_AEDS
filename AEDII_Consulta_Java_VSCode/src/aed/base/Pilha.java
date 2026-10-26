package aed.base;
import java.util.NoSuchElementException;

/** Pilha dos slides: fundo e a sentinela. Topo -> dados -> fundo -> null. */
public class Pilha<E> {
    private Celula<E> topo;
    private final Celula<E> fundo;

    public Pilha() { fundo = new Celula<>(); topo = fundo; }
    public boolean vazia() { return topo == fundo; }

    public void empilhar(E item) {
        if (item == null) throw new IllegalArgumentException("Item nulo");
        topo = new Celula<>(item, topo);
    }

    public E consultarTopo() {
        if (vazia()) throw new NoSuchElementException("Pilha vazia");
        return topo.getItem();
    }

    public E desempilhar() {
        E removido = consultarTopo();
        topo = topo.getProximo();
        return removido;
    }

    public int obterNumeroItens() {
        int n = 0;
        for (Celula<E> p = topo; p != fundo; p = p.getProximo()) n++;
        return n;
    }

    public int contarRecursivo() { return contarRecursivo(topo); }
    private int contarRecursivo(Celula<E> atual) {
        if (atual == fundo) return 0;
        return 1 + contarRecursivo(atual.getProximo());
    }

    /** Copia celulas; nao clona profundamente os objetos E. Preserva this. */
    public Pilha<E> subPilha(int numItens) {
        if (numItens < 0) throw new IllegalArgumentException("Quantidade negativa");
        Celula<E> aux = topo;
        Pilha<E> inversa = new Pilha<>();
        for (int i = 0; i < numItens; i++) {
            if (aux == fundo) throw new IllegalArgumentException("Itens insuficientes");
            inversa.empilhar(aux.getItem());
            aux = aux.getProximo();
        }
        Pilha<E> resultado = new Pilha<>();
        while (!inversa.vazia()) resultado.empilhar(inversa.desempilhar());
        return resultado;
    }

    public Pilha<E> copiar() { return subPilha(obterNumeroItens()); }

    public void inverter() {
        Celula<E> anterior = fundo;
        Celula<E> atual = topo;
        while (atual != fundo) {
            Celula<E> seguinte = atual.getProximo();
            atual.setProximo(anterior);
            anterior = atual;
            atual = seguinte;
        }
        topo = anterior;
    }

    /** Convencao: topo[A,B] + topo[C,D] = topo[A,B,C,D]. Preserva outra. */
    public void concatenar(Pilha<E> outra) {
        if (outra == null) throw new IllegalArgumentException("Pilha nula");
        Pilha<E> copia = outra.copiar();
        Celula<E> anterior = fundo;
        for (Celula<E> p = topo; p != fundo; p = p.getProximo()) anterior = p;
        while (!copia.vazia()) {
            Celula<E> nova = new Celula<>(copia.desempilhar(), fundo);
            if (anterior == fundo) topo = nova;
            else anterior.setProximo(nova);
            anterior = nova;
        }
    }

    /** Apenas API de pilha. O(n^2) tempo e O(n) chamadas. */
    public void inverterRecursivamente() {
        if (vazia()) return;
        E item = desempilhar();
        inverterRecursivamente();
        inserirFundo(item);
    }
    private void inserirFundo(E item) {
        if (vazia()) { empilhar(item); return; }
        E salvo = desempilhar();
        inserirFundo(item);
        empilhar(salvo);
    }

    /** Conveniencia do acervo para testes; nao assumir que existe no template. */
    public Object[] toArray() {
        Object[] a = new Object[obterNumeroItens()];
        int i = 0;
        for (Celula<E> p = topo; p != fundo; p = p.getProximo()) a[i++] = p.getItem();
        return a;
    }
    public boolean estruturaValida() {
        Celula<E> lento = topo, rapido = topo;
        while (rapido != null && rapido.getProximo() != null) {
            lento = lento.getProximo();
            rapido = rapido.getProximo().getProximo();
            if (lento == rapido) return false;
        }
        Celula<E> p = topo;
        while (p != null && p != fundo) p = p.getProximo();
        return p == fundo && fundo.getProximo() == null;
    }
}
