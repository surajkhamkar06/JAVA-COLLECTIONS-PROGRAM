package package1;

public class AddTwoNumbers {

    // Node class
    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    // Add two numbers
    public static Node add(Node l1, Node l2) {
        Node dummy = new Node(0);
        Node current = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;
            current.next = new Node(sum % 10);
            current = current.next;
        }

        return dummy.next;
    }

    // Create linked list from array
    public static Node create(int[] arr) {
        Node head = null, tail = null;
        for (int val : arr) {
            Node newNode = new Node(val);
            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        return head;
    }

    // Print linked list
    public static void print(Node node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        Node l1 = create(new int[]{2, 4, 3});
        Node l2 = create(new int[]{5, 6, 4});
        Node result = add(l1, l2);

        System.out.print("Result: ");
        print(result);  // Output: 7 0 8
    }
}