import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        tree theTree = new tree();
        System.out.println("Sayiler :");
        for (int i = 0; i < 10; i++) {
            int sayi = (int) (Math.random() * 100);
            System.out.println(sayi + "");
            theTree.insert(sayi);
        }
        ;

        System.out.println("\n agacin inorder dolasmi :");
        theTree.inOrder(theTree.getroot());
        System.out.println("\n agacin inorder dolasmi :");
        theTree.preOrder(theTree.getroot());
        System.out.println("\n agacin inorder dolasmi :");
        theTree.postOrder(theTree.getroot());

    }

}
