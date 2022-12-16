public class Main {
    public static void main(String[] args) {

        DBlist d = new DBlist();
        d.ekle("Tatvan");
        d.ekle("Hizan");
        d.ekle("Ahlat");
        d.ekle("Güroymak");
        d.ekle("Adilcevaz");
        d.listele();
        d.sil("Hizan");
        System.out.println();
        d.listele();
    }
}