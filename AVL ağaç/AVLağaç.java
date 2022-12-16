class AVLağaç {

    Node root;

    // Ağacın yüksekliğini elde etmek için bir yardımcı fonksiyon
    int height(Node N) {
        if (N == null)
            return 0;

        return N.height;
    }

    // A en fazla iki tamsayı elde etmek için yardımcı işlev
    int max(int a, int b) {
        return (a > b) ? a : b;
    }

    // A y ile köklü alt ağacı sağa döndürmek için yardımcı işlev
    // Yukarıda verilen şemaya bakın.
    Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        // Rotasyon gerçekleştir
        x.right = y;
        y.left = T2;

        // Yükseklikleri güncelle
        y.height = max(height(y.left), height(y.right)) + 1;
        x.height = max(height(x.left), height(x.right)) + 1;

        // Yeni kök döndür
        return x;
    }

    // x ile köklü alt ağacı sola döndürmek için bir yardımcı işlev
    // Yukarıda verilen şemaya bakın.
    Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        // Rotasyon gerçekleştir
        y.left = x;
        x.right = T2;

        // Yükseklikleri güncelle
        x.height = max(height(x.left), height(x.right)) + 1;
        y.height = max(height(y.left), height(y.right)) + 1;

        // Yeni kök döndür
        return y;
    }

    // N düğümünün Denge faktörünü alın
    int getBalance(Node N) {
        if (N == null)
            return 0;

        return height(N.left) - height(N.right);
    }

    Node insert(Node node, int key) {

        /* 1. Normal BST yerleştirmeyi gerçekleştirin */
        if (node == null)
            return (new Node(key));

        if (key < node.key)
            node.left = insert(node.left, key);
        else if (key > node.key)
            node.right = insert(node.right, key);
        else // Yinelenen anahtarlara izin verilmez
            return node;

        /* 2. Bu ata düğümün güncelleme yüksekliği */
        node.height = 1 + max(height(node.left),
                height(node.right));

        int balance = getBalance(node);

        // Bu düğüm dengesizleşirse, o zaman

        if (balance > 1 && key < node.left.key)
            return rightRotate(node);

        // Sağ Sağ Kasa
        if (balance < -1 && key > node.right.key)
            return leftRotate(node);

        // Sol Sağ Kasa
        if (balance > 1 && key > node.left.key) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // Sağ Sol Kasa
        if (balance < -1 && key < node.right.key) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        /* (değişmemiş) düğüm işaretçisini döndür */
        return node;
    }

    // Ön sipariş geçişini yazdırmak için bir yardımcı işlev
    // ağacın.
    // Fonksiyon ayrıca her düğümün yüksekliğini de yazdırır
    void preOrder(Node node) {
        if (node != null) {
            System.out.print(node.key + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }
}