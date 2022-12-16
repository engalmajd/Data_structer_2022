

public class Node {
    int ON;
    Node next;
    int data;

    public Node(int d) {
        this.next = null;
        this.data = d;
    }

}
// public static void main(String[] args) {
// int k = 0;
// Scanner scan = new Scanner(System.in);

// System.out.print("Enter the First String: ");
// String strOne = scan.nextLine();
// System.out.print("Enter the Second String: ");
// String strTwo = scan.nextLine();

// int strOneLen = strOne.length();
// int strTwoLen = strTwo.length();

// if (strOneLen == strTwoLen) {
// for (int j = 0; j < strOneLen; j++) {
// for (int i = 0; i < strOneLen; i++) {
// if (strOne.charAt(i) == strTwo.charAt(j))
// k++;
// }
// }
// } else
// System.out.println("\nStrings are of Unequal size/length.");
// if (k == strOneLen)
// System.out.println("\nStrings are Equal.");
// }
// }