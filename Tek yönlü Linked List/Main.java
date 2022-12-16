import java.util.Scanner;//klavyeden veri almak için

public class Main {
    public static void main(String[] args) {
        List ogrNo = new List();
        int veri, secim;
        Node e;
        Node etail;
        do {
            System.out.println(" 1-15 arasi komutu giriniz:");
            Scanner oku = new Scanner(System.in);// kullanicidan deger almak için

            secim = oku.nextInt();

            switch (secim) {
                case 1:
                    System.out.println("Liste Basina eknecek ögrenci numarasi giriniz= ");
                    Scanner deger = new Scanner(System.in);// kullanicidan deger almak için

                    veri = deger.nextInt();// veri alinir
                    e = new Node(veri);// node çevrilir
                    ogrNo.listHeadAdd(e);// liste eklenir
                    ogrNo.listPrint();// yazdirma
                    break;

                case 2:
                    System.out.println("Liste Sonuna eknecek ögrenci numarasi giriniz= ");
                    Scanner deger2 = new Scanner(System.in);// kullanicidan deger almak için

                    veri = deger2.nextInt();// veri alinir
                    etail = new Node(veri);// node çevrilir
                    ogrNo.listTailAdd(etail);// liste eklenir
                    ogrNo.listPrint();// yazdirma
                    break;
                case 3:
                    System.out.println("Eklenecek elemani giriniz= ");
                    Scanner ekle = new Scanner(System.in);// kullanicidan deger almak için

                    veri = ekle.nextInt();// veri alinir
                    e = new Node(veri);// node çevrilir

                    System.out.println(veri + " sayisi kaçinci siraya eklensin= ");
                    Scanner sira = new Scanner(System.in);// kullanicidan deger almak için

                    int siraNo = sira.nextInt();// veri alinir

                    ogrNo.ortayaEkle(e, siraNo);
                    ogrNo.listPrint();// yazdirma
                    break;
                case 4:
                    ogrNo.listHeadDelete();// liste basinda bir eleman sil
                    ogrNo.listPrint();// yazdirma
                    break;
                case 5:
                    System.out.println("silinecek elemani giriniz= ");
                    Scanner sil = new Scanner(System.in);// kullanicidan deger almak için
                    veri = sil.nextInt();// veri alinir
                    int sonuc2 = ogrNo.ortadanSil(veri);
                    if (sonuc2 == -1)
                        System.out.println("Listede " + veri + " bulunamadi!");
                    else
                        System.out.println("Listede aranan " + sonuc2 + ". silindi.");
                    ogrNo.listPrint();// yazdirma
                    break;
                case 6:
                    ogrNo.listeSondanSil();// liste sonunda bir eleman sil
                    ogrNo.listPrint();// yazdirma
                    break;
                default:

                    break;
            }
            // oku.close();
        } while (secim != 20);
    }
}