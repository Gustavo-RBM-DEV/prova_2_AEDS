package aed.ordenacao;
/** Implementacoes autorais, sem Arrays.sort/Collections.sort. */
public final class Ordenacoes {
    private Ordenacoes() { }
    public static void trocar(int[] a, int i, int j) { int t = a[i]; a[i] = a[j]; a[j] = t; }
    public static void mergeSort(int[] a) { mergeSort(a, new int[a.length], 0, a.length - 1); }
    private static void mergeSort(int[] a, int[] aux, int esq, int dir) {
        if (esq >= dir) return;
        int meio = esq + (dir - esq) / 2;
        mergeSort(a, aux, esq, meio); mergeSort(a, aux, meio + 1, dir);
        int i = esq, j = meio + 1, k = esq;
        while (i <= meio && j <= dir) aux[k++] = a[i] <= a[j] ? a[i++] : a[j++];
        while (i <= meio) aux[k++] = a[i++];
        while (j <= dir) aux[k++] = a[j++];
        for (k = esq; k <= dir; k++) a[k] = aux[k];
    }
    public static void quickSortCentro(int[] a) { quick(a, 0, a.length - 1, false); }
    public static void quickSortUltimo(int[] a) { quick(a, 0, a.length - 1, true); }
    private static void quick(int[] a, int esq, int dir, boolean ultimo) {
        if (esq >= dir) return;
        int i = esq, j = dir;
        int pivo = a[ultimo ? dir : esq + (dir - esq) / 2];
        while (i <= j) {
            while (a[i] < pivo) i++;
            while (a[j] > pivo) j--;
            if (i <= j) { trocar(a, i, j); i++; j--; }
        }
        if (esq < j) quick(a, esq, j, ultimo);
        if (i < dir) quick(a, i, dir, ultimo);
    }
    public static int particionar(int[] a, int esq, int dir) {
        int pivo = a[dir], i = esq - 1;
        for (int j = esq; j < dir; j++) if (a[j] <= pivo) trocar(a, ++i, j);
        trocar(a, i + 1, dir); return i + 1;
    }
    public static void quickSortLomuto(int[] a) { lomuto(a, 0, a.length - 1); }
    private static void lomuto(int[] a, int e, int d) {
        if (e >= d) return;
        int p = particionar(a, e, d);
        lomuto(a, e, p - 1); lomuto(a, p + 1, d);
    }
    public static void quickSortTresVias(int[] a) { tresVias(a, 0, a.length - 1); }
    private static void tresVias(int[] a, int e, int d) {
        if (e >= d) return;
        int menor = e, maior = d, i = e + 1, pivo = a[e];
        while (i <= maior) {
            if (a[i] < pivo) trocar(a, menor++, i++);
            else if (a[i] > pivo) trocar(a, i, maior--);
            else i++;
        }
        tresVias(a, e, menor - 1); tresVias(a, maior + 1, d);
    }
    public static void heapSort(int[] a) {
        for (int i = a.length / 2 - 1; i >= 0; i--) descer(a, i, a.length);
        for (int fim = a.length - 1; fim > 0; fim--) { trocar(a, 0, fim); descer(a, 0, fim); }
    }
    private static void descer(int[] a, int pai, int n) {
        while (2 * pai + 1 < n) {
            int filho = 2 * pai + 1;
            if (filho + 1 < n && a[filho + 1] > a[filho]) filho++;
            if (a[pai] >= a[filho]) return;
            trocar(a, pai, filho); pai = filho;
        }
    }
    /** R19: array[0] ignorado, elementos em 1..n. */
    public static void heapSortBaseUm(int[] a) {
        int n = a.length - 1;
        for (int i = n / 2; i >= 1; i--) descerBaseUm(a, i, n);
        for (int fim = n; fim > 1; fim--) { trocar(a, 1, fim); descerBaseUm(a, 1, fim - 1); }
    }
    private static void descerBaseUm(int[] a, int pai, int n) {
        while (2 * pai <= n) {
            int filho = 2 * pai;
            if (filho < n && a[filho + 1] > a[filho]) filho++;
            if (a[pai] >= a[filho]) return;
            trocar(a, pai, filho); pai = filho;
        }
    }
    public static void insertionSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int item = a[i], j = i - 1;
            while (j >= 0 && a[j] > item) { a[j + 1] = a[j]; j--; }
            a[j + 1] = item;
        }
    }
    public static void selectionSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int menor = i;
            for (int j = i + 1; j < a.length; j++) if (a[j] < a[menor]) menor = j;
            trocar(a, i, menor);
        }
    }
    public static void bubbleSort(int[] a) {
        for (int fim = a.length - 1; fim > 0; fim--) {
            boolean trocou = false;
            for (int j = 0; j < fim; j++) if (a[j] > a[j + 1]) { trocar(a, j, j + 1); trocou = true; }
            if (!trocou) return;
        }
    }
}
