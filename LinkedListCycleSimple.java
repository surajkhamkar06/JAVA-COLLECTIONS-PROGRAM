package package1;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class LinkedListCycleSimple {

    // Method to check if there's a cycle
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;         // move by 1
            fast = fast.next.next;    // move by 2

            if (slow == fast) {
                return true;          // cycle found
            }
        }
        return false;                 // no cycle
    }

    public static void main(String[] args) {
        // Create nodes
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);

        // Link nodes: 1 -> 2 -> 3 -> 2 (cycle)
        a.next = b;
        b.next = c;
        c.next = b; // cycle here

        LinkedListCycleSimple obj = new LinkedListCycleSimple();
        boolean hasLoop = obj.hasCycle(a);

        System.out.println("Cycle detected: " + hasLoop);
    }
}