package aed.base;
import java.util.NoSuchElementException;
import java.util.function.Function;
import java.util.function.Predicate;

/** Sentinela FIXA: frente -> S -> primeiro dado -> ... -> tras -> null. */
public class Fila<E> {
    private final Celula<E> frente;
    private Celula<E> tras;

    public Fila() { frente = new Celula<>(); tras = frente; }

    /** FF01: ignora os elementos null do vetor. */
    public Fila(E[] itens) {
        this();
        if (itens == null) throw new IllegalArgumentException("Vetor nulo");
        for (E e : itens) if (e != null) enfileirar(e);
    }

    /** FF02: escolha explicita, ordem topo->fundo; restaura a pilha. */
    public Fila(Pilha<E> pilha) {
        this();
        if (pilha == null) throw new IllegalArgumentException("Pilha nula");
        Pilha<E> aux = new Pilha<>();
        while (!pilha.vazia()) {
            E e = pilha.desempilhar();
            enfileirar(e);
            aux.empilhar(e);
        }
        while (!aux.vazia()) pilha.empilhar(aux.desempilhar());
    }

    public boolean vazia() { return frente == tras; }

    public void enfileirar(E item) {
        if (item == null) throw new IllegalArgumentException("Item nulo");
        Celula<E> nova = new Celula<>(item);
        tras.setProximo(nova);
        tras = nova;
    }

    public E consultarInicio() {
        if (vazia()) throw new NoSuchElementException("Fila vazia");
        return frente.getProximo().getItem();
    }

    public E desenfileirar() {
        if (vazia()) throw new NoSuchElementException("Fila vazia");
        Celula<E> removida = frente.getProximo();
        frente.setProximo(removida.getProximo());
        if (removida == tras) tras = frente;
        removida.setProximo(null);
        return removida.getItem();
    }

    public int tamanho() {
        int n = 0;
        for (Celula<E> p = frente.getProximo(); p != null; p = p.getProximo()) n++;
        return n;
    }

    public int obterNumeroItens() { return obterNumeroItens(frente.getProximo()); }
    public int obterNumeroItens(Celula<E> aux) {
        if (aux == null) return 0;
        return 1 + obterNumeroItens(aux.getProximo());
    }

    public boolean verificarExistencia(E item) { return contem(item); }
    public boolean contem(E item) { return contem(item, frente.getProximo()); }
    public boolean contem(E item, Celula<E> aux) {
        if (aux == null) return false;
        if (aux.getItem().equals(item)) return true;
        return contem(item, aux.getProximo());
    }

    public int quantosAfrente(E item) { return quantosAfrente(frente.getProximo(), item); }
    /** FF10 exige esta ordem: celula primeiro, item segundo. */
    public int quantosAfrente(Celula<E> atual, E item) {
        if (atual == null) throw new NoSuchElementException("Item nao encontrado");
        if (atual.getItem().equals(item)) return 0;
        return 1 + quantosAfrente(atual.getProximo(), item);
    }
    /** Assinatura literal da folha BF04, incluindo throws Exception. */
    public int obterNumItensAFrente(E item) throws Exception { return quantosAfrente(item); }

    public E obterItem(int pos) { return obterItem(frente.getProximo(), pos); }
    public E obterItem(Celula<E> aux, int pos) {
        if (pos < 0 || aux == null) throw new IndexOutOfBoundsException("Posicao invalida");
        if (pos == 0) return aux.getItem();
        return obterItem(aux.getProximo(), pos - 1);
    }

    public Fila<E> copiar() {
        Fila<E> nova = new Fila<>();
        for (Celula<E> p = frente.getProximo(); p != null; p = p.getProximo()) nova.enfileirar(p.getItem());
        return nova;
    }

    public void concatenar(Fila<E> outra) {
        if (outra == null) throw new IllegalArgumentException("Fila nula");
        Fila<E> fonte = outra == this ? outra.copiar() : outra;
        for (Celula<E> p = fonte.frente.getProximo(); p != null; p = p.getProximo()) enfileirar(p.getItem());
    }
    public Fila<E> unir(Fila<E> outra) {
        Fila<E> nova = copiar();
        nova.concatenar(outra);
        return nova;
    }

    /** Alterna; preserva outra. Altera this adotando uma cadeia nova. */
    public void mesclar(Fila<E> outra) {
        if (outra == null) throw new IllegalArgumentException("Fila nula");
        Fila<E> nova = new Fila<>();
        Celula<E> a = frente.getProximo(), b = outra.frente.getProximo();
        while (a != null || b != null) {
            if (a != null) { nova.enfileirar(a.getItem()); a = a.getProximo(); }
            if (b != null) { nova.enfileirar(b.getItem()); b = b.getProximo(); }
        }
        frente.setProximo(nova.frente.getProximo());
        tras = nova.vazia() ? frente : nova.tras;
    }

    public void inverter() {
        Celula<E> antigoPrimeiro = frente.getProximo();
        Celula<E> anterior = null, atual = antigoPrimeiro;
        while (atual != null) {
            Celula<E> seguinte = atual.getProximo();
            atual.setProximo(anterior);
            anterior = atual;
            atual = seguinte;
        }
        frente.setProximo(anterior);
        tras = antigoPrimeiro == null ? frente : antigoPrimeiro;
    }
    /** Variante para quem prefere nao usar uma variavel chamada anterior. */
    public void inverterSemAnterior() {
        Celula<E> antigoPrimeiro = frente.getProximo();
        Celula<E> atual = antigoPrimeiro;
        frente.setProximo(null);
        while (atual != null) {
            Celula<E> seguinte = atual.getProximo();
            atual.setProximo(frente.getProximo());
            frente.setProximo(atual);
            atual = seguinte;
        }
        tras = antigoPrimeiro == null ? frente : antigoPrimeiro;
    }
    public Fila<E> invertida() { Fila<E> nova = copiar(); nova.inverter(); return nova; }
    public Fila<E> inverterOutra(Fila<E> outra) {
        if (outra == null) throw new IllegalArgumentException("Fila nula");
        outra.inverter();
        return outra;
    }
    public void inverterPorPilha() {
        Pilha<E> p = new Pilha<>();
        while (!vazia()) p.empilhar(desenfileirar());
        while (!p.vazia()) enfileirar(p.desempilhar());
    }
    public void inverterRecursivamente() {
        if (vazia()) return;
        E item = desenfileirar();
        inverterRecursivamente();
        enfileirar(item);
    }

    /** Pares das POSICOES originais vao para retorno; impares ficam em this. */
    public Fila<E> dividir() {
        Fila<E> pares = new Fila<>();
        Celula<E> anterior = frente, atual = frente.getProximo();
        int pos = 0;
        while (atual != null) {
            Celula<E> seguinte = atual.getProximo();
            if (pos % 2 == 0) {
                anterior.setProximo(seguinte);
                if (atual == tras) tras = anterior;
                atual.setProximo(null);
                pares.tras.setProximo(atual);
                pares.tras = atual;
            } else anterior = atual;
            atual = seguinte;
            pos++;
        }
        return pares;
    }

    private void validarQuantidade(int quantidade) {
        if (quantidade < 0) throw new IllegalArgumentException("Quantidade negativa");
        Celula<E> p = frente.getProximo();
        for (int i = 0; i < quantidade; i++) {
            if (p == null) throw new IllegalArgumentException("Itens insuficientes");
            p = p.getProximo();
        }
    }

    /** Quantidade e o numero de EXAMINADOS, nao o numero de aprovados. */
    public Fila<E> filtrar(Predicate<E> condicao, int quantidade) {
        if (condicao == null) throw new IllegalArgumentException("Condicao nula");
        validarQuantidade(quantidade);
        Fila<E> nova = new Fila<>();
        Celula<E> p = frente.getProximo();
        for (int i = 0; i < quantidade; i++) {
            if (condicao.test(p.getItem())) nova.enfileirar(p.getItem());
            p = p.getProximo();
        }
        return nova;
    }
    public double somarValores(Function<E, Double> extrator, int quantidade) {
        if (extrator == null) throw new IllegalArgumentException("Extrator nulo");
        validarQuantidade(quantidade);
        double soma = 0;
        Celula<E> p = frente.getProximo();
        for (int i = 0; i < quantidade; i++) {
            Double valor = extrator.apply(p.getItem());
            if (valor == null) throw new IllegalArgumentException("Extrator retornou null");
            soma += valor;
            p = p.getProximo();
        }
        return soma;
    }
    public double calcularValorMedio(Function<E, Double> extrator, int quantidade) {
        if (quantidade <= 0) throw new IllegalArgumentException("Quantidade deve ser positiva");
        return somarValores(extrator, quantidade) / quantidade;
    }
    public int contarSe(Predicate<E> condicao, int quantidade) {
        if (condicao == null) throw new IllegalArgumentException("Condicao nula");
        validarQuantidade(quantidade);
        int n = 0;
        Celula<E> p = frente.getProximo();
        for (int i = 0; i < quantidade; i++) {
            if (condicao.test(p.getItem())) n++;
            p = p.getProximo();
        }
        return n;
    }
    public E encontrarMaior(Function<E, Double> extrator) {
        if (extrator == null) throw new IllegalArgumentException("Extrator nulo");
        if (vazia()) throw new NoSuchElementException("Fila vazia");
        Celula<E> p = frente.getProximo();
        E melhor = p.getItem();
        Double maior = extrator.apply(melhor);
        if (maior == null) throw new IllegalArgumentException("Resultado nulo");
        for (p = p.getProximo(); p != null; p = p.getProximo()) {
            Double valor = extrator.apply(p.getItem());
            if (valor == null) throw new IllegalArgumentException("Resultado nulo");
            if (Double.compare(valor, maior) > 0) { melhor = p.getItem(); maior = valor; }
        }
        return melhor;
    }

    public Fila<E> itensDepoisDoAlvo(E alvo) {
        Fila<E> nova = new Fila<>();
        buscarECopiar(alvo, frente.getProximo(), nova);
        return nova;
    }
    private void buscarECopiar(E alvo, Celula<E> atual, Fila<E> nova) {
        if (atual == null) throw new NoSuchElementException("Alvo ausente");
        if (atual.getItem().equals(alvo)) { copiarRestante(atual.getProximo(), nova); return; }
        buscarECopiar(alvo, atual.getProximo(), nova);
    }
    private void copiarRestante(Celula<E> atual, Fila<E> nova) {
        if (atual == null) return;
        nova.enfileirar(atual.getItem());
        copiarRestante(atual.getProximo(), nova);
    }
    public Fila<E> itensAntesDoAlvo(E alvo) {
        Fila<E> nova = new Fila<>();
        copiarAntes(alvo, frente.getProximo(), nova);
        return nova;
    }
    private void copiarAntes(E alvo, Celula<E> atual, Fila<E> nova) {
        if (atual == null) throw new NoSuchElementException("Alvo ausente");
        if (atual.getItem().equals(alvo)) return;
        nova.enfileirar(atual.getItem());
        copiarAntes(alvo, atual.getProximo(), nova);
    }

    public Object[] toArray() {
        Object[] a = new Object[tamanho()]; int i = 0;
        for (Celula<E> p = frente.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
        return a;
    }
    public boolean estruturaValida() {
        Celula<E> lento = frente, rapido = frente;
        while (rapido != null && rapido.getProximo() != null) {
            lento = lento.getProximo(); rapido = rapido.getProximo().getProximo();
            if (lento == rapido) return false;
        }
        Celula<E> p = frente;
        while (p.getProximo() != null) p = p.getProximo();
        return p == tras;
    }
}
