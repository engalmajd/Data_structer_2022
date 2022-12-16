public class Main {

    public static void main(String[] args) {
        stack y = new stack();

        if (y.isEmpty())
            System.out.println("Yığın boş");
        y.push(49);
        y.push(23);

        System.out.println("Yığının ilk elemanı: " + y.pop());
        y.push(44);
        y.push(22);
        System.out.println("Yığının ilk elemanı: " + y.pop());
        System.out.println("Yığının ilk elemanı: " + y.pop());
        System.out.println("Yığının ilk elemanı: " + y.pop());
        // System.out.println("Yığının ilk elemanı: " + y.pop());
        if (y.isEmpty())
            System.out.println("Yığın boş");
    }

}
