//Given the head of a sorted linked list, delete all duplicates such
// that each element appears only once. Return the linked list sorted as well.

// time complexity: O(n), space complexity: O(1)
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
