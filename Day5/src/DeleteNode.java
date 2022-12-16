public class DeleteNode {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node = node.next.next;
    }

}
