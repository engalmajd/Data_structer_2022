public class List {

    Node head;// head adında bir node
    Node tail;// tail adında bir node

    // listenin YAPILANDIRICI sınıfıdır.
    public List() {
        head = null;
        tail = null;
    }

    // Liste başına eleman ekleme
    void listHeadAdd(Node yeni) {// başa ekle
        if (head == null) {
            head = yeni;
            tail = yeni;
        } else {
            yeni.next = head;
            head = yeni;
        }
    }

    // Liste sonuna eleman ekleme
    void listTailAdd(Node yeni) {
        if (tail == null) {
            tail = yeni;
            head = yeni;
        } else {
            tail.next = yeni;
            tail = yeni;
        }
    }

    int listSearch(int deger)// Listte aranan elemanın kaçıncı sırada olduğunu

    {
        int sayac = 1;
        Node tmp;
        tmp = head;
        while (tmp != null)// tmp boş değilse
        {
            if (tmp.data == deger)
                return sayac;// sayaç değerini gönder döngüyü bitir
            tmp = tmp.next;// bir sonraki düğüme geç
            sayac++;
        }
        return -1;// değer bulunmadı
    }

    int listHeadDelete()// Liste başındaki elemanı siler
    {
        int sayi = -1;
        if (head != null)// bir dizimiz varsa
            sayi = head.data;// baştaki elemanın değerini al
        head = head.next;// bir sonraki elemana geç
        if (head == null)// eleman kalmadıysa
            tail = null;// tail'i de null yap
        return sayi;// silinen her sayıyı gönder
    }

    int listTailDelete()// Liste sonundaki elemanı siler
    {
        Node tmp, prev;
        tmp = head;
        prev = null;
        while (tmp != tail) {
            prev = tmp;
            tmp = tmp.next;
        }
        if (prev == null)
            head = null;
        else
            prev.next = null;
        tail = prev;
        return 0;

    }

    int listeSondanSil() {
        System.out.println("Liste sondan silme");
        Node tmp = head;
        System.out.println(tmp.next.next.data);
        // Node prev=null;
        while (tmp.next != null) {
            if (tmp.next.next != null)
                tmp = tmp.next;
            else
                break;
        }
        tmp.next = null;
        tail = tmp;
        System.out.println("Liste sondan silme2");
        return 0;
    }

    int ortadanSil(int deger) {
        int sayi = 0;
        Node tmp, prev;
        tmp = head;
        prev = tmp;
        while (tmp != null)// tmp boş değilse
        {
            if (tmp.data != deger) {
                prev = tmp;
                tmp = tmp.next;
            } else {
                sayi = tmp.data;
                prev.next = tmp.next;// ????
                tmp.next = null;
                return sayi;
            }
        }
        return sayi;// değer bulunmadı

    }

    void ortayaEkle(Node yeni, int sno) {
        Node tmp;
        tmp = head;
        int sayac = 0;
        while (tmp != null)// tmp boş değilse
        {
            if (sayac == sno) {
                yeni.next = tmp.next;
                tmp.next = yeni;
            }
            tmp = tmp.next;// bir sonraki düğüme geç
            sayac++;
        }
    }

    void listPrint() {
        System.out.println("------Bağlı Liste------");
        Node tmp;
        tmp = head;
        while (tmp != null) {
            System.out.print(tmp.data);
            System.out.print("-->");
            tmp = tmp.next;
        }
        System.out.println(" ");
        System.out.println("-----------------------");
    }
}
