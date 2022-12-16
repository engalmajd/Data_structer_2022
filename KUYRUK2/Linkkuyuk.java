public class Linkkuyuk {
    Node front = null;
    Node rear = null;
    int lingth = 0;

    public boolean bosmi() {
        return this.rear == null;
    }

    public void addqueue(int Elemen) {
        Node elemaNode = new Node();
        elemaNode.data = Elemen;
        if (bosmi()) {
            this.front = this.rear = elemaNode;
            return;
        }
        this.rear.next = elemaNode;
        this.rear = elemaNode;
        lingth++;
    }

    public void deletequeue() {
        if (!bosmi()) {
            this.front = this.front.next;
            if (this.front == null) {
                this.rear = null;
            }
            lingth--;

        }

    }

    public int getfront() {
        return front.data;
    }

    public int getrear() {
        return rear.data;
    }

    public int searchqueue(int element) {
        int gar = -1;
        Node g;
        g = front;
        while (gar != rear.data)
            if (element == front.data) {
                element = front.data;
                gar++;

                break;
            } else {
                front = front.next;
                gar++;

            }
        front = g;
        return gar;

    }

    public void printo() {
        Node pas = front;
        while (pas != null) {
            System.out.println(pas.data);
            pas = pas.next;
        }
    }

}
