package aed.app;
import aed.base.Celula;

/** Leia a saida esperada em 02_RECURSAO. Nao depende de interface grafica. */
public final class RecursaoPassoAPasso {
    private RecursaoPassoAPasso() { }
    public static int contar(Celula<Integer> atual, String margem) {
        System.out.println(margem + "ENTROU: " + (atual == null ? "null" : atual.getItem()));
        if (atual == null) {
            System.out.println(margem + "RETORNA 0");
            return 0;
        }
        System.out.println(margem + "Esta chamada espera o resultado da proxima");
        int resposta = contar(atual.getProximo(), margem + "  ");
        System.out.println(margem + "VOLTOU para " + atual.getItem() + "; resposta=" + resposta);
        System.out.println(margem + "RETORNA " + (1 + resposta));
        return 1 + resposta;
    }
    public static void main(String[] args) {
        Celula<Integer> c30 = new Celula<>(30);
        Celula<Integer> c20 = new Celula<>(20, c30);
        Celula<Integer> c10 = new Celula<>(10, c20);
        System.out.println("Resultado final=" + contar(c10, ""));
    }
}
