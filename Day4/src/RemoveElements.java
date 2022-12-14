//Given the head of a linked list and an integer val, remove all the nodes of
// the linked list that has Node.val == val, and return the new head.

// time complexity: O(n), space complexity: O(1)

/**
 * Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
            next = null;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
 */

public class RemoveElements {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }

        while (head != null) {
            if (head.val == val) {
                head = head.next;
            } else {
                break;
            }
        }

        ListNode current = head;

        if (current == null) {
            return null;
        }

        while (current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }
}
