
class MergeSort {
    // arr[]'nin iki alt dizisini birleştirir.
    // İlk alt dizi arr[l..m]
    // İkinci alt dizi arr[m+1..r]
    void merge(int arr[], int l, int m, int r) {
        // Birleştirilecek iki alt dizinin boyutunu bulun
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Geçici diziler oluştur */
        int L[] = new int[n1];
        int R[] = new int[n2];

        /* Verileri geçici dizilere kopyala */
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        // Birinci ve ikinci alt dizilerin başlangıç ​​dizinleri
        int i = 0, j = 0;

        // Birleştirilmiş alt dizi dizisinin ilk dizini
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Varsa, L[] öğesinin kalan öğelerini kopyalayın */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Varsa, R[] öğesinin kalan öğelerini kopyalayın */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // arr[l..r] öğesini kullanarak sıralayan ana işlev // merge()
    void sort(int arr[], int l, int r) {
        if (l < r) {
            // Find the middle point
            int m = l + (r - l) / 2;

            // Birinci ve ikinci yarıyı sırala
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Sıralanmış yarımları birleştir
            merge(arr, l, m, r);
        }
    }

    /* A n boyutunda diziyi yazdırmak için yardımcı işlev */
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 12, 11, 13, 5, 6, 7 };

        System.out.println("Verilen Dizi");
        printArray(arr);

        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length - 1);

        System.out.println("\nsiralanmiş dizi");
        printArray(arr);
    }
}
