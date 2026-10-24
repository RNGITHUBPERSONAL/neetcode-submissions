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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right) {
            return head;
        }
        ListNode first = head;
        ListNode sec = head;
        ListNode before = null;
 
        for (int i = 0; i < left - 1; i++) {
            before = first;

            first = first.next;
        }
       for (int i = 0; i < right - 1; i++) {
            sec = sec.next;
        }
        // if (before != null) { // need to check if left is 1
        //     before.next = null; //we dont need this left part null becase 
        // }before = first; Now, before points to node 2, and first moves to node 3. Suppose we want to reverse nodes 3 to 5. After reversing, prev points to node 5, which is now the first node of the reversed section. We then execute before.next = prev; to connect node 2 to node 5. Finally, we connect the original node 3 (the tail of the reversed section) to node 6 to complete the list.

        ListNode temp = sec.next;
        sec.next = null;

        ListNode prev = null;
        while (first != null) {
            ListNode future = first.next;
            first.next = prev;
            prev = first;
            first = future;
        }
        ListNode res = prev;

        while (res.next != null) {
            res = res.next;
        }

        res.next = temp;
        if (before != null) {
            before.next = prev;

        } else {
            head = prev; // if its only 1 node so revrse should be head
        }
        return head;
    }
}