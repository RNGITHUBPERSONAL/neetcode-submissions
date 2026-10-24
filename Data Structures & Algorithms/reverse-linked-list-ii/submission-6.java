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
        ListNode before = null;for (int i = 0; i < right-1; i++) {
            sec = sec.next;
        }
        for (int i = 0; i < left - 1; i++) {
            before = first;

            first = first.next;
        }

        if (before != null) { // need to check if left is 1
            before.next = null;
        }

        

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