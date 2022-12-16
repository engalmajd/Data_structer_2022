public class tree {
    private Node root;

    public tree() {
        root = null;
    }

    public Node getroot() {
        return root;
    }

    public void preOrder(Node localRoot) {
        if (localRoot != null) {
            localRoot.display();
            preOrder(localRoot.sol);
            preOrder(localRoot.sag);
        }
    }

    public void inOrder(Node localRoot) {
        if (localRoot != null) {
            inOrder(localRoot.sol);
            localRoot.display();
            inOrder(localRoot.sag);
        }
    }

    public void postOrder(Node localRoot) {
        if (localRoot != null) {
            postOrder(localRoot.sol);

            postOrder(localRoot.sag);
            localRoot.display();
        }

    }

    public void insert(int newdata) {
        Node newNode = new Node();
        newNode.veri = newdata;
        if (root == null) {
            root = newNode;
        } else {
            Node current = root;
            Node parent;
            while (true) {
                parent = current;
                if (newdata < current.veri) {
                    current = current.sol;
                    if (current == null) {
                        parent.sol = newNode;
                        return;
                    }
                } else {
                    current = current.sag;
                    if (current == null) {
                        parent.sag = newNode;
                        return;
                    }

                }
            }
        } // end
    }// end insert
}// class tree
