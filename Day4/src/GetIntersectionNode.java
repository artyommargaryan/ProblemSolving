//Given the heads of two singly linked-lists headA and headB, return the node
// at which the two lists intersect. If the two linked lists have no intersection
// at all, return null.

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

public class GetIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode currentA = headA;
        ListNode currentB = headB;

        int sizeA = 0;
        int sizeB = 0;

        while (currentA.next != null) {
            ++sizeA;
            currentA = currentA.next;
        }

        while (currentB.next != null) {
            ++sizeB;
            currentB = currentB.next;
        }

        int sizeDif;
        currentA = headA;
        currentB = headB;

        if (sizeA > sizeB) {
            sizeDif = sizeA - sizeB;
            for (int i = 0; i < sizeDif; ++i) {
                currentA = currentA.next;
            }
        } else {
            sizeDif = sizeB - sizeA;
            for (int i = 0; i < sizeDif; ++i) {
                currentB = currentB.next;
            }
        }

        while (currentA != currentB) {
            currentA = currentA.next;
            currentB = currentB.next;
        }

        return currentA;
    }
}