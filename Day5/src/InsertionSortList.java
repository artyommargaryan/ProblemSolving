//Given the head of a singly linked list, sort the list using insertion sort, and return the sorted list's head.
//The steps of the insertion sort algorithm:
//Insertion sort iterates, consuming one input element each repetition and growing a sorted output list.
//At each iteration, insertion sort removes one element from the input data, finds the location it belongs within the sorted list and inserts it there.
//It repeats until no input elements remain.

// time complexity: O(n^2), space complexity: O(1)

public class InsertionSortList {
    public ListNode insertionSortList(ListNode head) {
        ListNode listNode = new ListNode(Integer.MIN_VALUE);
        ListNode prev = listNode;
        ListNode next;

        while (head != null) {
            next = head.next;
            if (prev.val >= head.val) {
                prev = listNode;
            }

            while (prev.next != null && prev.next.val < head.val) {
                prev = prev.next;
            }
            head.next = prev.next;
            prev.next = head;
            head = next;
        }

        return listNode.next;
    }
}
