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
    public void reorderList(ListNode head) {

        if(head==null || head.next==null) return;
        ListNode slow = head;
        ListNode fast = head;
        ListNode start = null;

        ListNode previousSlow = null;
        while (fast != null && fast.next != null) {
            // previousSlow = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
 
        // start = slow;
                start = slow.next;

        // break the link

        // previousSlow.next = null;
slow.next=null;
        // start revesre
        ListNode previous = null;
        while (start != null) {
            ListNode nxt = start.next;
            start.next = previous;
            previous = start;
            start = nxt;
        }

        ListNode firstHalf = head;
        ListNode secondHalf = previous; 

        while (firstHalf != null && secondHalf != null) {
            ListNode temp = firstHalf.next;
            ListNode temp2 = secondHalf.next;
            firstHalf.next = secondHalf;
            secondHalf.next = temp;
            firstHalf = temp;
            secondHalf = temp2;
        }
    }
}
