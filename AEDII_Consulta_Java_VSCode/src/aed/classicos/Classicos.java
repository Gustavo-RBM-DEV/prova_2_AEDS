package aed.classicos;
import aed.base.Celula;
import aed.base.Fila;
import aed.base.Pilha;
import java.text.Normalizer;
import java.util.Locale;

/** Fontes e adaptacoes: pasta 09_FONTES_E_VALIDACAO. Solucoes autorais. */
public final class Classicos {
    private Classicos() { }
    public static boolean delimitadoresBalanceados(String texto) {
        if (texto == null) throw new IllegalArgumentException("Texto nulo");
        Pilha<Character> p = new Pilha<>();
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c == '(' || c == '[' || c == '{') p.empilhar(c);
            else if (c == ')' || c == ']' || c == '}') {
                if (p.vazia()) return false;
                char a = p.desempilhar();
                if ((c == ')' && a != '(') || (c == ']' && a != '[') || (c == '}' && a != '{')) return false;
            }
        }
        return p.vazia();
    }
    /** Tokens separados por espacos. O primeiro pop e o operando DIREITO. */
    public static double avaliarPosfixa(String expressao) {
        if (expressao == null || expressao.trim().isEmpty()) throw new IllegalArgumentException("Expressao vazia");
        Pilha<Double> p = new Pilha<>();
        for (String token : expressao.trim().split("\\s+")) {
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                if (p.vazia()) throw new IllegalArgumentException("Falta operando");
                double b = p.desempilhar();
                if (p.vazia()) throw new IllegalArgumentException("Falta operando");
                double a = p.desempilhar();
                if (token.equals("+")) p.empilhar(a + b);
                else if (token.equals("-")) p.empilhar(a - b);
                else if (token.equals("*")) p.empilhar(a * b);
                else { if (b == 0) throw new ArithmeticException("Divisao por zero"); p.empilhar(a / b); }
            } else p.empilhar(Double.parseDouble(token));
        }
        if (p.vazia()) throw new IllegalArgumentException("Sem resultado");
        double r = p.desempilhar();
        if (!p.vazia()) throw new IllegalArgumentException("Operandos sobrando");
        return r;
    }
    public static String binario(int n) {
        if (n < 0) throw new IllegalArgumentException("Numero negativo");
        if (n == 0) return "0";
        Pilha<Integer> p = new Pilha<>();
        while (n > 0) { p.empilhar(n % 2); n /= 2; }
        StringBuilder s = new StringBuilder();
        while (!p.vazia()) s.append(p.desempilhar());
        return s.toString();
    }
    /** Politica explicita: ignora caixa, espacos, pontuacao e marcas de acento. */
    public static boolean palindromo(String texto) {
        if (texto == null) throw new IllegalArgumentException("Texto nulo");
        String s = Normalizer.normalize(texto, Normalizer.Form.NFD).replaceAll("\\p{M}+", "").toLowerCase(Locale.ROOT);
        Pilha<Integer> p = new Pilha<>(); Fila<Integer> f = new Fila<>();
        for (int i = 0; i < s.length();) {
            int c = s.codePointAt(i); i += Character.charCount(c);
            if (Character.isLetterOrDigit(c)) { p.empilhar(c); f.enfileirar(c); }
        }
        while (!f.vazia()) if (!f.desenfileirar().equals(p.desempilhar())) return false;
        return true;
    }
    /** Cadeias SEM sentinela: devolver a nova cabeca nao atualiza seu objeto Lista. */
    public static <E> Celula<E> inverterLigacoes(Celula<E> atual) {
        Celula<E> anterior = null;
        while (atual != null) {
            Celula<E> seguinte = atual.getProximo();
            atual.setProximo(anterior); anterior = atual; atual = seguinte;
        }
        return anterior;
    }
    public static <E> Celula<E> inverterLigacoesRec(Celula<E> atual) {
        if (atual == null || atual.getProximo() == null) return atual;
        Celula<E> novaCabeca = inverterLigacoesRec(atual.getProximo());
        atual.getProximo().setProximo(atual); atual.setProximo(null);
        return novaCabeca;
    }
    public static <E> boolean temCiclo(Celula<E> inicio) {
        Celula<E> lento = inicio, rapido = inicio;
        while (rapido != null && rapido.getProximo() != null) {
            lento = lento.getProximo(); rapido = rapido.getProximo().getProximo();
            if (lento == rapido) return true;
        }
        return false;
    }
    public static <E> Celula<E> inicioDoCiclo(Celula<E> inicio) {
        Celula<E> lento = inicio, rapido = inicio;
        while (rapido != null && rapido.getProximo() != null) {
            lento = lento.getProximo(); rapido = rapido.getProximo().getProximo();
            if (lento == rapido) {
                lento = inicio;
                while (lento != rapido) { lento = lento.getProximo(); rapido = rapido.getProximo(); }
                return lento;
            }
        }
        return null;
    }
    /** Tamanho par: segunda celula central. */
    public static <E> Celula<E> meio(Celula<E> inicio) {
        Celula<E> lento = inicio, rapido = inicio;
        while (rapido != null && rapido.getProximo() != null) {
            lento = lento.getProximo(); rapido = rapido.getProximo().getProximo();
        }
        return lento;
    }
    /** k=1 consulta o ultimo item. */
    public static <E> E kEsimoDoFim(Celula<E> inicio, int k) {
        if (k <= 0) throw new IllegalArgumentException("k invalido");
        Celula<E> rapido = inicio, lento = inicio;
        for (int i = 0; i < k; i++) {
            if (rapido == null) throw new IllegalArgumentException("k maior que tamanho");
            rapido = rapido.getProximo();
        }
        while (rapido != null) { rapido = rapido.getProximo(); lento = lento.getProximo(); }
        return lento.getItem();
    }
    public static <E> Celula<E> removerKEsimoDoFim(Celula<E> inicio, int k) {
        if (k <= 0) throw new IllegalArgumentException("k invalido");
        Celula<E> s = new Celula<>(null, inicio), rapido = s, lento = s;
        for (int i = 0; i < k; i++) {
            rapido = rapido.getProximo();
            if (rapido == null) throw new IllegalArgumentException("k maior que tamanho");
        }
        while (rapido.getProximo() != null) { rapido = rapido.getProximo(); lento = lento.getProximo(); }
        lento.setProximo(lento.getProximo().getProximo());
        return s.getProximo();
    }
    /** Consome ligacoes. Entradas devem ser disjuntas e ordenadas. */
    public static <E extends Comparable<E>> Celula<E> intercalarNos(Celula<E> a, Celula<E> b) {
        Celula<E> s = new Celula<>(), fim = s;
        while (a != null && b != null) {
            if (a.getItem().compareTo(b.getItem()) <= 0) { fim.setProximo(a); a = a.getProximo(); }
            else { fim.setProximo(b); b = b.getProximo(); }
            fim = fim.getProximo();
        }
        fim.setProximo(a != null ? a : b);
        return s.getProximo();
    }
    public static <E> Celula<E> removerDuplicadosOrdenados(Celula<E> inicio) {
        Celula<E> p = inicio;
        while (p != null && p.getProximo() != null) {
            if (p.getItem().equals(p.getProximo().getItem())) p.setProximo(p.getProximo().getProximo());
            else p = p.getProximo();
        }
        return inicio;
    }
    public static <E> Celula<E> removerDuplicados(Celula<E> inicio) {
        for (Celula<E> p = inicio; p != null; p = p.getProximo()) {
            Celula<E> anterior = p;
            while (anterior.getProximo() != null) {
                if (p.getItem().equals(anterior.getProximo().getItem())) anterior.setProximo(anterior.getProximo().getProximo());
                else anterior = anterior.getProximo();
            }
        }
        return inicio;
    }
    public static <E extends Comparable<E>> Celula<E> particionarEstavel(Celula<E> inicio, E limite) {
        Celula<E> s1 = new Celula<>(), s2 = new Celula<>(), f1 = s1, f2 = s2;
        for (Celula<E> atual = inicio; atual != null;) {
            Celula<E> seguinte = atual.getProximo(); atual.setProximo(null);
            if (atual.getItem().compareTo(limite) < 0) { f1.setProximo(atual); f1 = atual; }
            else { f2.setProximo(atual); f2 = atual; }
            atual = seguinte;
        }
        f1.setProximo(s2.getProximo()); return s1.getProximo();
    }
    public static <E> void inverterPrimeiros(Fila<E> fila, int k) {
        int n = fila.tamanho();
        if (k < 0 || k > n) throw new IllegalArgumentException("k invalido");
        Pilha<E> p = new Pilha<>();
        for (int i = 0; i < k; i++) p.empilhar(fila.desenfileirar());
        while (!p.vazia()) fila.enfileirar(p.desempilhar());
        for (int i = 0; i < n - k; i++) fila.enfileirar(fila.desenfileirar());
    }
    /** Pessoas 0..n-1; retorna sobrevivente. */
    public static int josephus(int n, int m) {
        if (n <= 0 || m <= 0) throw new IllegalArgumentException();
        Fila<Integer> f = new Fila<>();
        for (int i = 0; i < n; i++) f.enfileirar(i);
        for (int restam = n; restam > 1; restam--) {
            int passos = (m - 1) % restam;
            for (int i = 0; i < passos; i++) f.enfileirar(f.desenfileirar());
            f.desenfileirar();
        }
        return f.desenfileirar();
    }
    public static int[] proximosMaiores(int[] a) {
        int[] resultado = new int[a.length]; Pilha<Integer> indices = new Pilha<>();
        for (int i = 0; i < a.length; i++) {
            resultado[i] = -1;
            while (!indices.vazia() && a[i] > a[indices.consultarTopo()]) resultado[indices.desempilhar()] = a[i];
            indices.empilhar(i);
        }
        return resultado;
    }
    public static boolean sequenciaDesempilhavel(int[] entrada, int[] saida) {
        if (entrada.length != saida.length) return false;
        Pilha<Integer> p = new Pilha<>(); int j = 0;
        for (int x : entrada) {
            p.empilhar(x);
            while (!p.vazia() && j < saida.length && p.consultarTopo() == saida[j]) { p.desempilhar(); j++; }
        }
        return j == saida.length;
    }
}
