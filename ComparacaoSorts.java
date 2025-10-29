public class ComparacaoSorts {

    static int trocas, iteracoes;

    public static void troca(int[] v, int i, int j) {
        int temp = v[i];
        v[i] = v[j];
        v[j] = temp;
        trocas++;
    }

    public static void combSort(int[] v, int n) {
        trocas = 0;
        iteracoes = 0;
        int gap = n;
        boolean trocado = true;
        while (gap > 1 || trocado) {
            iteracoes++;
            gap = (gap * 10) / 13;
            if (gap < 1) gap = 1;
            trocado = false;
            int i = 0;
            while (i + gap < n) {
                if (v[i] > v[i + gap]) {
                    troca(v, i, i + gap);
                    trocado = true;
                }
                i++;
            }
        }
    }

    public static void gnomeSort(int[] v, int n) {
        trocas = 0;
        iteracoes = 0;
        int i = 1;
        while (i < n) {
            iteracoes++;
            if (i == 0 || v[i - 1] <= v[i]) {
                i++;
            } else {
                troca(v, i, i - 1);
                i--;
            }
        }
    }

    public static void bucketSort(int[] v, int n) {
        trocas = 0;
        iteracoes = 0;

        int min = v[0], max = v[0];
        for (int i = 1; i < n; i++) {
            iteracoes++;
            if (v[i] < min) min = v[i];
            if (v[i] > max) max = v[i];
        }

        int range = max - min + 1;
        int[] count = new int[range];

        for (int i = 0; i < range; i++) count[i] = 0;

        for (int i = 0; i < n; i++) {
            iteracoes++;
            count[v[i] - min]++;
        }

        int idx = 0;
        for (int i = 0; i < range; i++) {
            while (count[i] > 0) {
                v[idx++] = i + min;
                count[i]--;
                trocas++;
            }
        }
    }

    public static void bubbleSortFlag(int[] v, int n) {
        trocas = 0;
        iteracoes = 0;
        boolean trocado = true;
        while (trocado) {
            trocado = false;
            for (int i = 0; i < n - 1; i++) {
                iteracoes++;
                if (v[i] > v[i + 1]) {
                    troca(v, i, i + 1);
                    trocado = true;
                }
            }
        }
    }

    public static void selectionSort(int[] v, int n) {
        trocas = 0;
        iteracoes = 0;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                iteracoes++;
                if (v[j] < v[min]) min = j;
            }
            if (min != i) troca(v, i, min);
        }
    }

    public static void cocktailSort(int[] v, int n) {
        trocas = 0;
        iteracoes = 0;
        boolean trocado = true;
        int start = 0;
        int end = n - 1;
        while (trocado) {
            trocado = false;
            for (int i = start; i < end; i++) {
                iteracoes++;
                if (v[i] > v[i + 1]) {
                    troca(v, i, i + 1);
                    trocado = true;
                }
            }
            if (!trocado) break;
            trocado = false;
            end--;
            for (int i = end - 1; i >= start; i--) {
                iteracoes++;
                if (v[i] > v[i + 1]) {
                    troca(v, i, i + 1);
                    trocado = true;
                }
            }
            start++;
        }
    }

    public static void main(String[] args) {
        int[][] vetores = {
            {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28},
            {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32},
            {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6}
        };

        String[] nomes = {"Comb Sort", "Gnome Sort", "Bucket Sort", "Bubble Sort", "Selection Sort", "Cocktail Sort"};

        for (int k = 0; k < 3; k++) {
            System.out.println("\n===== VETOR " + (k + 1) + " =====");
            for (int a = 0; a < 6; a++) {
                int[] v = new int[20];
                for (int i = 0; i < 20; i++) v[i] = vetores[k][i];

                switch (a) {
                    case 0: combSort(v, 20); break;
                    case 1: gnomeSort(v, 20); break;
                    case 2: bucketSort(v, 20); break;
                    case 3: bubbleSortFlag(v, 20); break;
                    case 4: selectionSort(v, 20); break;
                    case 5: cocktailSort(v, 20); break;
                }
                System.out.println(nomes[a] + " -> Trocas: " + trocas + " | Iterações: " + iteracoes);
            }
        }
    }
}