public class Main {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        // create root
        tree.root = new Node(1);
        /*
         * aşağıdaki, yukarıdaki ifadeden sonraki ağaçtır
         * 1
         * / \
         * null null
         */

        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        /*
         * 2 ve 3 sol ve sağ çocukları olmak 1
         * 1
         * / \
         * 2 3
         * / \ / \
         * null null null null
         */
        tree.root.left.left = new Node(4);
        /*
         * 4 sol çocuğu olur 2
         * 1
         * / \
         * 2 3
         * / \ / \
         * 4 null null null
         * / \
         * null null
         */
    }

}
