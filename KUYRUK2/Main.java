import java.util.Scanner;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int veri, veri1, veri2, veri3, l = 0;

        Linkkuyuk k = new Linkkuyuk();
        System.out.print(" kac tane islem yapmak isteyorsun");
        Scanner n = new Scanner(System.in);
        veri3 = n.nextInt();

        do {
            System.out.print(" 1-6 arasi komutu giriniz:");
            Scanner i = new Scanner(System.in);
            veri = i.nextInt();
            l++;
            switch (veri) {
                case 1:
                    System.out.print("Liste  eklecek numarasi giriniz= ");
                    Scanner deger = new Scanner(System.in);// kullanicidan deger almak için

                    veri1 = deger.nextInt();// veri alinir
                    k.addqueue(veri1);// liste eklenir

                    break;
                case 2:
                    System.out.println("ilk eleman seleceksin");
                    k.deletequeue();

                    break;
                case 3:
                    System.out.println("kuyrukta hangi eleman aramak isteyorsun :");
                    Scanner deger1 = new Scanner(System.in);
                    veri2 = deger1.nextInt();
                    System.out.print(k.searchqueue(veri2));

                    break;
                case 4:
                    System.out.println("ilk eleman geterecek" + k.getfront());

                    break;
                case 5:
                    System.out.println("son eleman geterecek" + k.getrear());

                    break;
                case 6:
                    k.printo();

                default:

                    break;
            }
            // oku.close();
        } while (veri3 != l);
        k.printo();
    }

}
