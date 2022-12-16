public class Main {
    public static void main(String[] args) {
        AVLağaç tree = new AVLağaç();

        /* Yukarıdaki şekilde verilen ağaç oluşturma */
        tree.root = tree.insert(tree.root, 10);
        tree.root = tree.insert(tree.root, 20);
        tree.root = tree.insert(tree.root, 30);
        tree.root = tree.insert(tree.root, 40);
        tree.root = tree.insert(tree.root, 50);
        tree.root = tree.insert(tree.root, 25);

        /*
         * Oluşturulan AVL Ağacı şöyle olacaktır:
         * 30
         * / \
         * 20 40
         * / \ \
         * 10 25 50
         */
        System.out.println("Ön sipariş geçişi" +
                "inşa edilen ağacin : ");
        tree.preOrder(tree.root);
    }
}
