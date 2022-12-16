public class stack {
    private Node first = null;

    private class Node {
        private int item;
        private Node next;

    }

    public boolean isEmpty() {
        return first == null;
    }

    public void push(int item) {
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
    }

    public int pop() {
        int item = first.item;
        first = first.next;
        return item;
    }

}