//Given head, the head of a linked list, determine if the linked list has a cycle in it.
//There is a cycle in a linked list if there is some node in the list that can be reached again
// by continuously following the next pointer. Internally, pos is used to denote the index of
// the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.
//Return true if there is a cycle in the linked list. Otherwise, return false.

// time complexity: O(n), space complexity: O(1)

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {
 *     }
 *
 *     ListNode(int val) {
 *         this.val = val;
 *         next = null;
 *     }
 *
 *     ListNode(int val, ListNode next) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */

public class HasCycle {
    public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }

        ListNode current1 = head;
        ListNode current2 = head;

        while(current2 != null && current2.next != null){
            current1 = current1.next;
            current2 = current2.next.next;

            if(current1 == current2){
                return true;
            }
        }

        return false;
    }
}