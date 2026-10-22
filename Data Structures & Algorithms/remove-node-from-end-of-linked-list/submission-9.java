/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy;

        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        ListNode slow = dummy;

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return dummy.next;
    }
}

// [1, 2, 3, 4], n = 2
// If n = 2, we need to remove node 3.
// Counting backward in out thought  from the tail n times , n points to node 3,
// so we need to move our fast pointer to node 3 in the first loop.




// [1,2,3,4], n = 2
// If n = 2, we need to remove node 3, but in the first loop, we move fast forward by 2 links from the head.

// 1 → 2 → 3 → 4
// - Initially, fast points to node 1.
// - After 1 link, fast points to node 2.
// - After 2 links, fast points to node 3.
// So yes, after the first loop, fast points to node 3, the target node.

// But remember, we need slow to reach node 2, the node immediately before the target, so we can remove node 3 by changing slow.next.