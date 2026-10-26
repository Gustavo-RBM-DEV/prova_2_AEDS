package aed.variacoes;
import aed.base.Celula;
import aed.base.Fila;
import java.util.function.Function;
import java.util.function.Predicate;
/** Modelos extras. Primeiro parametro e primeiro DADO, nao sentinela. */
public final class ModelosRecursivos {
    private ModelosRecursivos() { }
    public static <E> int contarSe(Celula<E> atual, Predicate<E> condicao) {
        if (condicao == null) throw new IllegalArgumentException("Condicao nula");
        if (atual == null) return 0;
        return (condicao.test(atual.getItem()) ? 1 : 0) + contarSe(atual.getProximo(), condicao);
    }
    public static <E> double somar(Celula<E> atual, Function<E, Double> extrator) {
        if (extrator == null) throw new IllegalArgumentException("Extrator nulo");
        if (atual == null) return 0;
        Double valor = extrator.apply(atual.getItem());
        if (valor == null) throw new IllegalArgumentException("Resultado nulo");
        return valor + somar(atual.getProximo(), extrator);
    }
    public static <E> boolean algum(Celula<E> atual, Predicate<E> condicao) {
        if (condicao == null) throw new IllegalArgumentException("Condicao nula");
        if (atual == null) return false;
        return condicao.test(atual.getItem()) || algum(atual.getProximo(), condicao);
    }
    public static <E> boolean todos(Celula<E> atual, Predicate<E> condicao) {
        if (condicao == null) throw new IllegalArgumentException("Condicao nula");
        if (atual == null) return true;
        return condicao.test(atual.getItem()) && todos(atual.getProximo(), condicao);
    }
    public static <E> int indiceOuMenosUm(Celula<E> atual, E alvo) {
        if (atual == null) return -1;
        if (atual.getItem().equals(alvo)) return 0;
        int resto = indiceOuMenosUm(atual.getProximo(), alvo);
        return resto < 0 ? -1 : 1 + resto;
    }
    public static <E> int ultimoIndice(Celula<E> atual, E alvo) {
        if (atual == null) return -1;
        int resto = ultimoIndice(atual.getProximo(), alvo);
        if (resto >= 0) return 1 + resto;
        return atual.getItem().equals(alvo) ? 0 : -1;
    }
    public static <E> Celula<E> copiarNos(Celula<E> atual) {
        if (atual == null) return null;
        return new Celula<>(atual.getItem(), copiarNos(atual.getProximo()));
    }
    public static <E> Celula<E> filtrarNos(Celula<E> atual, Predicate<E> condicao) {
        if (condicao == null) throw new IllegalArgumentException("Condicao nula");
        if (atual == null) return null;
        boolean incluir = condicao.test(atual.getItem());
        Celula<E> resto = filtrarNos(atual.getProximo(), condicao);
        return incluir ? new Celula<>(atual.getItem(), resto) : resto;
    }
    public static <E> Celula<E> removerTodosNos(Celula<E> atual, E alvo) {
        if (atual == null) return null;
        Celula<E> resto = removerTodosNos(atual.getProximo(), alvo);
        if (atual.getItem().equals(alvo)) { atual.setProximo(null); return resto; }
        atual.setProximo(resto); return atual;
    }
    public static <E> Fila<E> copiarInvertido(Celula<E> atual) {
        Fila<E> nova = new Fila<>(); copiarNaVolta(atual, nova); return nova;
    }
    private static <E> void copiarNaVolta(Celula<E> atual, Fila<E> nova) {
        if (atual == null) return;
        copiarNaVolta(atual.getProximo(), nova);
        nova.enfileirar(atual.getItem());
    }
    public static <E> Celula<E> copiarComFuncao(Celula<E> atual, Function<E, E> copiador) {
        if (copiador == null) throw new IllegalArgumentException("Copiador nulo");
        if (atual == null) return null;
        E novo = copiador.apply(atual.getItem());
        if (novo == null) throw new IllegalArgumentException("Copia nula");
        return new Celula<>(novo, copiarComFuncao(atual.getProximo(), copiador));
    }
}
