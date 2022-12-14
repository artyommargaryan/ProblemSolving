//Given the head of a sorted linked list, delete all duplicates such
// that each element appears only once. Return the linked list sorted as well.

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

public class DeleteDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode current = head;

        while (current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
                continue;
            }
            current = current.next;
        }

        return head;
    }
}
