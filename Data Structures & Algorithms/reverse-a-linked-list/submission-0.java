
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode previous = null;
        while (current != null) {
            ListNode future = current.next;

            current.next = previous;

            previous = current;

            current = future;
        }
        return previous;
    }
}
