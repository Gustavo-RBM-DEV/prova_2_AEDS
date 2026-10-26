package aed.testes;

import aed.base.Celula;
import aed.base.CelulaDupla;
import aed.base.Fila;
import aed.base.Lista;
import aed.base.ListaDupla;
import aed.base.Pilha;
import aed.base.PseudoFila;
import aed.base.PseudoPilha;
import aed.classicos.Classicos;
import aed.classicos.PilhaMinima;
import aed.ordenacao.Ordenacoes;
import aed.variacoes.ModelosRecursivos;
import java.lang.reflect.Field;
import java.util.Random;

/** Sem JUnit. Reflexao somente aqui, para testar IDENTIDADE dos nos. */
public final class Testes {
    private static int verificacoes;
    private Testes() { }
    private static void ok(boolean condicao, String nome) {
        verificacoes++;
        if (!condicao) throw new AssertionError(nome);
    }
    private static void igual(Object esperado, Object obtido, String nome) {
        ok(esperado == null ? obtido == null : esperado.equals(obtido),
                nome + ": esperado=" + esperado + ", obtido=" + obtido);
    }
    private static void seq(Object[] obtido, Object... esperado) {
        igual(esperado.length, obtido.length, "Comprimento");
        for (int i = 0; i < esperado.length; i++) igual(esperado[i], obtido[i], "Indice " + i);
    }
    private static void ints(int[] esperado, int[] obtido) {
        igual(esperado.length, obtido.length, "Tamanho vetor");
        for (int i = 0; i < esperado.length; i++) igual(esperado[i], obtido[i], "Vetor indice " + i);
    }
    private static void erro(Class<? extends Throwable> tipo, Runnable acao) {
        verificacoes++;
        try { acao.run(); }
        catch (Throwable ex) {
            if (tipo.isInstance(ex)) return;
            throw new AssertionError("Esperava " + tipo.getName(), ex);
        }
        throw new AssertionError("Faltou excecao " + tipo.getName());
    }
    private static Fila<Integer> fila(Integer... a) { return new Fila<>(a); }
    private static Lista<Integer> lista(Integer... a) {
        Lista<Integer> l = new Lista<>(); for (int x : a) l.inserirFinal(x); return l;
    }
    private static Pilha<Integer> pilha(Integer... topoPrimeiro) {
        Pilha<Integer> p = new Pilha<>();
        for (int i = topoPrimeiro.length - 1; i >= 0; i--) p.empilhar(topoPrimeiro[i]);
        return p;
    }
    private static ListaDupla<Integer> dupla(Integer... a) {
        ListaDupla<Integer> l = new ListaDupla<>(); for (int x : a) l.inserirFim(x); return l;
    }
    private static aed.revisao.Lista<Integer> rev(Integer... a) {
        aed.revisao.Lista<Integer> l = new aed.revisao.Lista<>();
        for (int x : a) l.inserirFinal(x); return l;
    }
    private static Celula<Integer> cadeia(Integer... a) {
        Celula<Integer> p = null;
        for (int i = a.length - 1; i >= 0; i--) p = new Celula<>(a[i], p);
        return p;
    }
    private static Object[] itens(Celula<?> p) {
        int n = 0; for (Celula<?> a = p; a != null; a = a.getProximo()) n++;
        Object[] r = new Object[n]; int i = 0;
        for (; p != null; p = p.getProximo()) r[i++] = p.getItem(); return r;
    }
    private static Object campo(Object o, String nome) {
        try { Field f = o.getClass().getDeclaredField(nome); f.setAccessible(true); return f.get(o); }
        catch (ReflectiveOperationException e) { throw new AssertionError(e); }
    }
    private static Object[] nos(Object lista) {
        Celula<?> p = ((Celula<?>) campo(lista, "inicio")).getProximo();
        Object[] a = new Object[itens(p).length]; int i = 0;
        while (p != null) { a[i++] = p; p = p.getProximo(); } return a;
    }
    private static Object[] nosDuplos(ListaDupla<?> lista) {
        CelulaDupla<?> p = ((CelulaDupla<?>) campo(lista, "inicio")).getProximo();
        Object[] a = new Object[lista.tamanho()]; int i = 0;
        while (p != null) { a[i++] = p; p = p.getProximo(); } return a;
    }

    private static void testarFilas() throws Exception {
        Fila<Integer> f = fila();
        ok(f.vazia() && f.estruturaValida(), "Fila vazia");
        igual(0, f.obterNumeroItens(), "Contar vazia");
        erro(java.util.NoSuchElementException.class, () -> f.desenfileirar());
        for (int i = 0; i < 20; i++) {
            f.enfileirar(i); igual(i, f.desenfileirar(), "Reuso fila"); ok(f.estruturaValida(), "Extremos");
        }
        f.enfileirar(10); f.enfileirar(20); f.enfileirar(30);
        igual(3, f.obterNumeroItens(), "Contar"); igual(1, f.quantosAfrente(20), "Posicao");
        igual(2, f.obterNumItensAFrente(30), "Alias BF04");
        igual(30, f.obterItem(2), "Obter"); ok(f.contem(20) && !f.contem(99), "Contem");
        erro(java.util.NoSuchElementException.class, () -> f.quantosAfrente(99));
        erro(IndexOutOfBoundsException.class, () -> f.obterItem(-1));
        erro(IndexOutOfBoundsException.class, () -> f.obterItem(3));
        Fila<Integer> copia = f.copiar(); copia.desenfileirar(); seq(f.toArray(), 10, 20, 30);
        Fila<Integer> pares = f.dividir(); seq(pares.toArray(), 10, 30); seq(f.toArray(), 20);
        ok(f.estruturaValida() && pares.estruturaValida(), "Dividir");
        f.enfileirar(40); f.inverter(); seq(f.toArray(), 40, 20);
        f.inverterPorPilha(); seq(f.toArray(), 20, 40);
        f.inverterRecursivamente(); seq(f.toArray(), 40, 20);
        f.inverterSemAnterior(); seq(f.toArray(), 20, 40); ok(f.estruturaValida(), "Sem anterior");
        Fila<Integer> a = fila(1, 3), b = fila(2, 4, 6); a.mesclar(b);
        seq(a.toArray(), 1, 2, 3, 4, 6); seq(b.toArray(), 2, 4, 6);
        a = fila(1, 2); a.concatenar(a); seq(a.toArray(), 1, 2, 1, 2);
        a = fila(1, 2); a.mesclar(a); seq(a.toArray(), 1, 1, 2, 2);
        Fila<Integer> orig = fila(10, 20, 30, 40);
        seq(orig.filtrar(x -> x > 15, 3).toArray(), 20, 30);
        igual(20.0, orig.calcularValorMedio(x -> x.doubleValue(), 3), "Media");
        igual(60.0, orig.somarValores(x -> x.doubleValue(), 3), "Soma");
        igual(2, orig.contarSe(x -> x > 15, 3), "ContarSe");
        igual(40, orig.encontrarMaior(x -> x.doubleValue()), "Maior");
        seq(orig.toArray(), 10, 20, 30, 40);
        erro(IllegalArgumentException.class, () -> orig.calcularValorMedio(x -> x.doubleValue(), 0));
        erro(IllegalArgumentException.class, () -> orig.filtrar(x -> true, 5));
        erro(IllegalArgumentException.class, () -> orig.filtrar(x -> true, -1));
        erro(IllegalArgumentException.class, () -> orig.somarValores(x -> null, 1));
        seq(orig.itensDepoisDoAlvo(20).toArray(), 30, 40);
        seq(orig.itensDepoisDoAlvo(40).toArray());
        seq(orig.itensAntesDoAlvo(30).toArray(), 10, 20);
        seq(orig.itensAntesDoAlvo(10).toArray());
        erro(java.util.NoSuchElementException.class, () -> orig.itensDepoisDoAlvo(99));
        erro(java.util.NoSuchElementException.class, () -> orig.itensAntesDoAlvo(99));
        seq(new Fila<>(new Integer[]{1, null, 2}).toArray(), 1, 2);
        Pilha<Integer> p = pilha(3, 2, 1); seq(new Fila<>(p).toArray(), 3, 2, 1); seq(p.toArray(), 3, 2, 1);
        seq(fila(1, 2).unir(fila(3, 4)).toArray(), 1, 2, 3, 4);
        for (int n = 0; n < 20; n++) {
            Fila<Integer> q = fila(); for (int i = 0; i < n; i++) q.enfileirar(i);
            Fila<Integer> r = q.dividir();
            for (int i = 0; i < n; i += 2) igual(i, r.desenfileirar(), "Par");
            for (int i = 1; i < n; i += 2) igual(i, q.desenfileirar(), "Impar");
            ok(q.estruturaValida() && r.estruturaValida(), "Dividir varios tamanhos");
        }
    }
    private static void testarPilhas() {
        Pilha<Integer> p = pilha(30, 20, 10);
        igual(3, p.contarRecursivo(), "Contar pilha");
        seq(p.subPilha(2).toArray(), 30, 20); seq(p.toArray(), 30, 20, 10);
        erro(IllegalArgumentException.class, () -> p.subPilha(4)); seq(p.toArray(), 30, 20, 10);
        p.inverter(); seq(p.toArray(), 10, 20, 30); ok(p.estruturaValida(), "Inverter pilha");
        p.inverterRecursivamente(); seq(p.toArray(), 30, 20, 10);
        Pilha<Integer> b = pilha(8, 7); p.concatenar(b);
        seq(p.toArray(), 30, 20, 10, 8, 7); seq(b.toArray(), 8, 7);
        Pilha<Integer> c = pilha(2, 1); c.concatenar(c); seq(c.toArray(), 2, 1, 2, 1);
        Pilha<Integer> vazio = pilha(); vazio.inverter(); vazio.concatenar(pilha(1)); seq(vazio.toArray(), 1);
        PseudoFila<Integer> pf = new PseudoFila<>(); pf.enfileirar(1); pf.enfileirar(2);
        igual(1, pf.consultarInicio(), "Pseudo frente"); igual(1, pf.desenfileirar(), "Pseudo saida");
        pf.enfileirar(3); igual(2, pf.desenfileirar(), "Pseudo ordem"); igual(3, pf.desenfileirar(), "Pseudo ordem2"); ok(pf.vazia(), "Pseudo vazia");
        PseudoPilha<Integer> pp = new PseudoPilha<>(); pp.empilhar(1); pp.empilhar(2); pp.empilhar(3);
        igual(3, pp.consultarTopo(), "Pseudo topo"); igual(3, pp.consultarTopo(), "Consulta preservada");
        igual(3, pp.desempilhar(), "Pop3"); igual(2, pp.desempilhar(), "Pop2"); igual(1, pp.desempilhar(), "Pop1"); ok(pp.vazia(), "Vazia");
    }
    private static void testarListas() {
        Lista<Integer> l = lista(); l.inserir(2, 0); l.inserir(1, 0); l.inserir(3, 2);
        seq(l.toArray(), 1, 2, 3); igual(2, l.localizar(1), "Localizar");
        igual(1, l.removerInicio(), "Rem inicio"); igual(3, l.remover(Integer.valueOf(3)), "Rem valor");
        seq(l.toArray(), 2); ok(l.estruturaValida(), "Lista valida");
        l = lista(1, 2, 1, 1, 3, 1); igual(4, l.contarQtos(1), "Ocorrencias"); ok(l.contem(3), "Contem");
        l.removerTodos(1); seq(l.toArray(), 2, 3); l.removerTodos(2); l.removerTodos(3);
        ok(l.vazia() && l.estruturaValida(), "Remove todos");
        Lista<Integer> v = l; erro(IllegalStateException.class, () -> v.removerTodos(1));
        l = lista(1, 2, 3); seq(l.invertida().toArray(), 3, 2, 1); seq(l.toArray(), 1, 2, 3);
        l.inverter(); seq(l.toArray(), 3, 2, 1);
        Lista<Integer> clone = l.clone(); clone.removerInicio(); seq(l.toArray(), 3, 2, 1);
        Lista<Integer> a = lista(1, 3, 5), b = lista(2, 4); a.mesclar(b);
        seq(a.toArray(), 1, 2, 3, 4, 5); seq(b.toArray(), 2, 4);
        seq(lista(1, 3, 5).mesclarInvertidas(lista(2, 4, 6, 8)).toArray(), 5, 8, 3, 6, 1, 4, 2);
        Pilha<Integer> p = pilha(3, 2, 1); l = lista(0); l.unir(p);
        seq(l.toArray(), 0, 1, 2, 3); seq(p.toArray(), 3, 2, 1);
        for (int n = 1; n <= 8; n++) for (int i = 0; i < n; i++) for (int j = 0; j < n; j++) {
            Lista<Integer> x = lista(); Object[] esperado = new Object[n];
            for (int k = 0; k < n; k++) { x.inserirFinal(k); esperado[k] = k; }
            Object t = esperado[i]; esperado[i] = esperado[j]; esperado[j] = t;
            x.trocar(i, j); seq(x.toArray(), esperado); ok(x.estruturaValida(), "Trocar nos");
        }
        aed.flexiveis.ListaOrdenada<Integer> ord = new aed.flexiveis.ListaOrdenada<>();
        for (int x : new int[]{3, 1, 2, 2, 0, 5}) ord.inserirEmOrdem(x);
        seq(ord.toArray(), 0, 1, 2, 2, 3, 5);
    }
    private static void testarRevisao() {
        aed.revisao.Fila<Integer> f = new aed.revisao.Fila<>(new Integer[]{1, 3, 5}, new Integer[]{2, 3, 6});
        seq(f.toArray(), 1, 2, 3, 3, 5, 6); igual(3, f.obterItem(2), "R01");
        seq(f.extrairMenores(4).toArray(), 1, 2, 3, 3); seq(f.toArray(), 5, 6); ok(f.estruturaValida(), "Extrair");
        f.extrairMenores(99); ok(f.vazia() && f.estruturaValida(), "Extrair todos"); f.enfileirar(7); igual(7, f.desenfileirar(), "Reuso");
        Fila<Integer> a = fila(1, 3, 5), b = fila(2, 4);
        aed.revisao.Lista<Integer> l = new aed.revisao.Lista<>(a, b);
        seq(l.toArray(), 1, 2, 3, 4, 5); seq(a.toArray(), 1, 3, 5); seq(b.toArray(), 2, 4);
        seq(rev(1, 3, 5).intercalarOrdenadas(rev(2, 4, 6)).toArray(), 1, 2, 3, 4, 5, 6);
        igual(-2, rev(-9, -2, -7).obterMaior(), "Maior negativo");
        erro(java.util.NoSuchElementException.class, () -> rev().obterMaior());
        for (int n = 0; n <= 12; n++) for (int k = 0; k <= n; k++) {
            aed.revisao.Lista<Integer> x = rev(); Object[] esperado = new Object[n];
            for (int i = 0; i < n; i++) { x.inserirFinal(i); esperado[i] = (i + k) % n; }
            Object[] antes = nos(x); x.rotacionar(k); seq(x.toArray(), esperado); ok(x.estruturaValida(), "Rotacao");
            Object[] depois = nos(x); for (int i = 0; i < n; i++) ok(depois[i] == antes[(i + k) % n], "Reutiliza nos");
        }
        for (int n = 0; n <= 12; n++) {
            aed.revisao.Lista<Integer> x = rev(); for (int i = 0; i < n; i++) x.inserirFinal(i);
            Object[] antes = nos(x); aed.revisao.Lista<Integer> y = x.dividirAoMeio();
            igual((n + 1) / 2, x.tamanho(), "Esquerda"); igual(n / 2, y.tamanho(), "Direita");
            Object[] nx = nos(x), ny = nos(y);
            for (int i = 0; i < nx.length; i++) ok(nx[i] == antes[i], "Mesmos nos esquerda");
            for (int i = 0; i < ny.length; i++) ok(ny[i] == antes[nx.length + i], "Mesmos nos direita");
            ok(x.estruturaValida() && y.estruturaValida(), "Divisao valida");
        }
        l = rev(4, 7); l.trocarDoisPrimeiros(); l.inserirFinal(9); seq(l.toArray(), 7, 4, 9); ok(l.estruturaValida(), "Troca corrige fim");
        erro(IllegalStateException.class, () -> rev(1).trocarDoisPrimeiros());
        Random rnd = new Random(23917);
        for (int t = 0; t < 300; t++) {
            int n = rnd.nextInt(40); int[] v = new int[n]; l = rev();
            for (int i = 0; i < n; i++) { v[i] = rnd.nextInt(31) - 15; l.inserirFinal(v[i]); }
            Ordenacoes.insertionSort(v); l.ordenar(); Object[] esperado = new Object[n];
            for (int i = 0; i < n; i++) esperado[i] = v[i];
            seq(l.toArray(), esperado); ok(l.estruturaValida(), "Merge lista");
        }
    }
    private static void testarDuplas() {
        ListaDupla<Integer> l = dupla(1, 2, 3); l.inserir(0, 0); l.inserir(9, 2); l.inserirFim(4);
        seq(l.toArray(), 0, 1, 9, 2, 3, 4); seq(l.reversoArray(), 4, 3, 2, 9, 1, 0); ok(l.estruturaValida(), "Dupla inserir");
        igual(4, l.removerFim(), "Dupla fim"); igual(9, l.remover(2), "Dupla meio"); ok(l.estruturaValida(), "Dupla removida");
        l = dupla(1, 1, 2, 1); l.removerTodos(1); seq(l.toArray(), 2); l.removerFim(); ok(l.vazia() && l.estruturaValida(), "Dupla esvaziar");
        ok(dupla().ehPalindromo() && dupla(1).ehPalindromo() && dupla(1, 2, 2, 1).ehPalindromo() && dupla(1, 2, 1).ehPalindromo(), "Palindromos");
        ok(!dupla(1, 2, 3).ehPalindromo(), "Nao palindromo");
        for (int n = 0; n < 20; n++) {
            l = dupla(); for (int i = 0; i < n; i++) l.inserirFim(i);
            Object s = campo(l, "inicio"); Object[] antes = nosDuplos(l);
            l.inverter(); Object[] depois = nosDuplos(l);
            for (int i = 0; i < n; i++) ok(depois[i] == antes[n - 1 - i], "Inverter mesmos nos");
            ok(campo(l, "inicio") == s && l.estruturaValida(), "Mesma sentinela");
        }
        for (int n = 0; n < 5; n++) for (int m = 0; m < 5; m++) {
            ListaDupla<Integer> a = dupla(), b = dupla();
            for (int i = 0; i < n; i++) a.inserirFim(i);
            for (int i = 0; i < m; i++) b.inserirFim(n + i);
            Object[] na = nosDuplos(a), nb = nosDuplos(b); a.concatenar(b); Object[] nr = nosDuplos(a);
            for (int i = 0; i < n; i++) ok(nr[i] == na[i], "Concat preserva A");
            for (int i = 0; i < m; i++) ok(nr[n + i] == nb[i], "Concat transfere B");
            ok(a.estruturaValida() && b.vazia() && b.estruturaValida(), "Concat consistente");
            b.inserirFim(99); igual(99, b.removerFim(), "Reuso B");
        }
        Fila<Integer> f = fila(1, 2, 3); seq(new ListaDupla<>(f).toArray(), 1, 2, 3); seq(f.toArray(), 1, 2, 3);
    }
    private static void ordenarEConferir(int[] original) {
        int[] esperado = original.clone(); Ordenacoes.insertionSort(esperado);
        // Propriedades independentes da implementacao de referencia.
        for (int i = 1; i < esperado.length; i++) ok(esperado[i - 1] <= esperado[i], "Ordem da referencia");
        for (int v : original) {
            int n1 = 0, n2 = 0;
            for (int x : original) if (x == v) n1++;
            for (int x : esperado) if (x == v) n2++;
            igual(n1, n2, "Preserva multiplicidade");
        }
        for (int alg = 0; alg < 8; alg++) {
            int[] a = original.clone();
            switch (alg) {
                case 0: Ordenacoes.mergeSort(a); break;
                case 1: Ordenacoes.quickSortCentro(a); break;
                case 2: Ordenacoes.quickSortUltimo(a); break;
                case 3: Ordenacoes.quickSortLomuto(a); break;
                case 4: Ordenacoes.quickSortTresVias(a); break;
                case 5: Ordenacoes.heapSort(a); break;
                case 6: Ordenacoes.selectionSort(a); break;
                default: Ordenacoes.bubbleSort(a);
            }
            ints(esperado, a);
        }
        int[] base1 = new int[original.length + 1];
        for (int i = 0; i < original.length; i++) base1[i + 1] = original[i];
        Ordenacoes.heapSortBaseUm(base1);
        for (int i = 0; i < esperado.length; i++) igual(esperado[i], base1[i + 1], "Heap base1");
    }
    private static void enumerar(int[] a, int pos) {
        if (pos == a.length) { ordenarEConferir(a); return; }
        for (int x = -1; x <= 1; x++) { a[pos] = x; enumerar(a, pos + 1); }
    }
    private static void testarOrdenacoes() {
        for (int n = 0; n <= 7; n++) enumerar(new int[n], 0);
        ordenarEConferir(new int[]{Integer.MIN_VALUE, 0, Integer.MAX_VALUE, -1, 1});
        Random r = new Random(20261025);
        for (int k = 0; k < 200; k++) {
            int[] a = new int[r.nextInt(70)];
            for (int i = 0; i < a.length; i++) a[i] = r.nextInt(201) - 100;
            ordenarEConferir(a);
        }
        int[] a = {7, 2, 9, 4, 6, 1, 5}; igual(3, Ordenacoes.particionar(a, 0, 6), "Pivo Lomuto");
        ints(new int[]{2, 4, 1, 5, 6, 9, 7}, a);
    }
    private static void testarClassicosEModelos() {
        ok(Classicos.delimitadoresBalanceados("{a[()]}"), "Delimitadores");
        ok(!Classicos.delimitadoresBalanceados("([)]"), "Cruzado");
        ok(!Classicos.delimitadoresBalanceados("]"), "Sem abertura");
        igual(14.0, Classicos.avaliarPosfixa("2 3 4 * +"), "Posfixa");
        igual(-2.0, Classicos.avaliarPosfixa("3 5 -"), "Ordem operandos");
        erro(IllegalArgumentException.class, () -> Classicos.avaliarPosfixa("1 2"));
        erro(ArithmeticException.class, () -> Classicos.avaliarPosfixa("1 0 /"));
        igual("0", Classicos.binario(0), "Binario0"); igual("1101", Classicos.binario(13), "Binario13");
        ok(Classicos.palindromo("Socorram-me em Marrocos"), "Palindromo"); ok(!Classicos.palindromo("java"), "Nao palindromo");
        seq(itens(Classicos.inverterLigacoes(cadeia(1, 2, 3))), 3, 2, 1);
        seq(itens(Classicos.inverterLigacoesRec(cadeia(1, 2, 3))), 3, 2, 1);
        Celula<Integer> c = cadeia(1, 2, 3), c2 = c.getProximo(); c2.getProximo().setProximo(c2);
        ok(Classicos.temCiclo(c), "Ciclo"); ok(Classicos.inicioDoCiclo(c) == c2, "Inicio ciclo");
        ok(!Classicos.temCiclo(cadeia(1, 2, 3)), "Aciclica");
        igual(3, Classicos.meio(cadeia(1, 2, 3, 4)).getItem(), "Meio");
        igual(2, Classicos.kEsimoDoFim(cadeia(1, 2, 3), 2), "K fim");
        seq(itens(Classicos.removerKEsimoDoFim(cadeia(1, 2, 3), 3)), 2, 3);
        seq(itens(Classicos.removerKEsimoDoFim(cadeia(1), 1)));
        seq(itens(Classicos.intercalarNos(cadeia(1, 3, 5), cadeia(2, 3, 4))), 1, 2, 3, 3, 4, 5);
        seq(itens(Classicos.removerDuplicadosOrdenados(cadeia(1, 1, 2, 2, 3))), 1, 2, 3);
        seq(itens(Classicos.removerDuplicados(cadeia(1, 2, 1, 3, 2))), 1, 2, 3);
        seq(itens(Classicos.particionarEstavel(cadeia(4, 1, 5, 2, 3), 3)), 1, 2, 4, 5, 3);
        Fila<Integer> f = fila(1, 2, 3, 4, 5); Classicos.inverterPrimeiros(f, 3); seq(f.toArray(), 3, 2, 1, 4, 5);
        igual(3, Classicos.josephus(7, 3), "Josephus");
        ints(new int[]{5, 5, -1, -1}, Classicos.proximosMaiores(new int[]{4, 2, 5, 3}));
        ok(Classicos.sequenciaDesempilhavel(new int[]{1, 2, 3}, new int[]{2, 3, 1}), "Saida possivel");
        ok(!Classicos.sequenciaDesempilhavel(new int[]{1, 2, 3}, new int[]{3, 1, 2}), "Saida impossivel");
        PilhaMinima<Integer> p = new PilhaMinima<>(); p.empilhar(3); p.empilhar(1); p.empilhar(1);
        igual(1, p.minimo(), "Minimo"); p.desempilhar(); igual(1, p.minimo(), "Minimo repetido"); p.desempilhar(); igual(3, p.minimo(), "Minimo anterior");
        Celula<Integer> h = cadeia(1, 2, 3, 2);
        igual(2, ModelosRecursivos.contarSe(h, x -> x % 2 == 0), "Rec contarSe");
        igual(8.0, ModelosRecursivos.somar(h, x -> x.doubleValue()), "Rec soma");
        ok(ModelosRecursivos.algum(h, x -> x == 3), "Algum");
        ok(!ModelosRecursivos.todos(h, x -> x < 3), "Todos");
        ok(ModelosRecursivos.todos(null, (Integer x) -> false), "Todos vazio");
        ok(!ModelosRecursivos.algum(null, (Integer x) -> true), "Algum vazio");
        igual(1, ModelosRecursivos.indiceOuMenosUm(h, 2), "Indice");
        igual(-1, ModelosRecursivos.indiceOuMenosUm(h, 9), "Ausencia");
        igual(3, ModelosRecursivos.ultimoIndice(h, 2), "Ultimo indice");
        Celula<Integer> cp = ModelosRecursivos.copiarNos(h);
        seq(itens(cp), 1, 2, 3, 2); ok(cp != h && cp.getProximo() != h.getProximo(), "Nos copiados");
        seq(itens(ModelosRecursivos.filtrarNos(h, x -> x % 2 == 0)), 2, 2);
        seq(itens(ModelosRecursivos.removerTodosNos(cp, 2)), 1, 3); seq(itens(h), 1, 2, 3, 2);
        seq(ModelosRecursivos.copiarInvertido(h).toArray(), 2, 3, 2, 1);
        Celula<aed.app.PedidoDemo> original = new Celula<>(new aed.app.PedidoDemo(9, 100));
        Celula<aed.app.PedidoDemo> novo = ModelosRecursivos.copiarComFuncao(original, x -> new aed.app.PedidoDemo(x.getId(), x.valorFinal()));
        ok(original != novo && original.getItem() != novo.getItem(), "Copia de item");
    }
    private static void testarVariantes() {
        aed.variacoes.FilaCircular<Integer> f = new aed.variacoes.FilaCircular<>(3);
        f.enfileirar(1); f.enfileirar(2); f.enfileirar(3); ok(f.cheia(), "Circular cheia");
        erro(IllegalStateException.class, () -> f.enfileirar(4));
        igual(1, f.desenfileirar(), "Circular retira"); f.enfileirar(4); igual(3, f.tamanho(), "Modulo");
        igual(2, f.desenfileirar(), "Circular2"); igual(3, f.desenfileirar(), "Circular3"); igual(4, f.desenfileirar(), "Circular4"); ok(f.vazia(), "Circular vazia");
        aed.variacoes.PilhaVetor<Integer> p = new aed.variacoes.PilhaVetor<>(1); p.empilhar(9);
        erro(IllegalStateException.class, () -> p.empilhar(10)); igual(9, p.desempilhar(), "Pilha vetor");
        aed.variacoes.FilaSemSentinela<Integer> q = new aed.variacoes.FilaSemSentinela<>(); q.enfileirar(1);
        igual(1, q.desenfileirar(), "Sem sentinela"); q.enfileirar(2); igual(2, q.desenfileirar(), "Sem reuso");
        aed.variacoes.PilhaSemSentinela<Integer> r = new aed.variacoes.PilhaSemSentinela<>(); r.empilhar(1);
        igual(1, r.desempilhar(), "Pilha sem sentinela"); ok(r.vazia(), "Sem vazia");
    }
    public static void main(String[] args) throws Exception {
        testarFilas(); testarPilhas(); testarListas(); testarRevisao(); testarDuplas();
        testarOrdenacoes(); testarClassicosEModelos(); testarVariantes();
        System.out.println("OK: " + verificacoes + " verificacoes passaram.");
        System.out.println("Testes incluem vazio, unidade, duplicatas, limites, alias, preservacao e identidade de celulas.");
    }
}
