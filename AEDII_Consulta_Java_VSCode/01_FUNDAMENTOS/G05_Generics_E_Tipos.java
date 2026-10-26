/*
 * ============================================================================
 * E, T, PEDIDO, CELULA<E> E FILA<E>
 * ============================================================================
 *
 *
 * E e um parametro de tipo, nao uma variavel de objeto.
 *   Fila<Pedido> pedidos = new Fila<>();
 * Nessa instancia, E corresponde a Pedido. Enfileirar recebe Pedido e retirar
 * devolve Pedido. A fila usa Celula<Pedido> internamente para armazenar links.
 *
 *   E                         um item do tipo configurado
 *   Celula<E>                 um no que guarda E e proximo
 *   Fila<E>                   o objeto estrutura, com frente/tras
 *   Predicate<E>              recebe E e devolve boolean
 *   Function<E, Double>        recebe E e devolve Double
 *
 * Nao use int como argumento generico: Fila<Integer>, nao Fila<int>.
 * A conversao automatica entre int e Integer se chama boxing/unboxing.
 * Desempacotar um Integer/Double null causa NullPointerException.
 *
 * E nao garante compareTo. Para ordenar pela ordem natural:
 *   public class Lista<E extends Comparable<E>> { ... }
 *
 * Equals existe em Object, portanto igualdade por equals nao exige Comparable.
 * Pode haver outra variante com Comparator<E> recebido como argumento; nao e
 * necessario alterar compareTo da classe para cada criterio de ordenacao.
 *
 * Um metodo static da App nao pode usar E da instancia de outra classe:
 *   static Fila<Pedido> filaPedidos = new Fila<>();
 * Um metodo static generico pode declarar seu proprio tipo:
 *   public static <T> void mostrar(T item) { ... }
 *
 * Nao crie new E() nem new E[10] diretamente. As variantes sequenciais usam
 * Object[] com cast controlado na leitura. Evite raw types como Fila sem <...>.
 */
