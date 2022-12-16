class BinaryTree {
    Node root;

    /*
     * Bir ağacın "maxDepth" değerini hesaplayın --
     * kök düğümden en uzun yol boyunca düğümler
     * en uzak yaprak düğümüne kadar.
     */
    int maxDepth(Node node) {
        if (node == null)
            return 0;
        else {
            /* her bir alt ağacın derinliğini hesapla */
            int lDepth = maxDepth(node.left);
            int rDepth = maxDepth(node.right);

            /* daha büyük olanı kullan */
            if (lDepth > rDepth)
                return (lDepth + 1);
            else
                return (rDepth + 1);
        }
    }

    /* Yukarıdaki işlevleri test etmek için sürücü programı */
}