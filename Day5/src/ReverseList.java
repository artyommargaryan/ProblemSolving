//Given the head of a singly linked list, reverse the list, and return the reversed list.
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
public class ReverseList {
    public ListNode reverseList(ListNode head) {
        ListNode current = null;
        ListNode newHead = null;

        while(head != null){
            current = head;
            head = head.next;
            current.next = newHead;
            newHead = current;
        }

        return newHead;
    }
}
