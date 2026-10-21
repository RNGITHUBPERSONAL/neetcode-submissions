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


    if (head == null || head.next == null) {
        return;
    }

    // Step 1: Find the middle of the linked list
    ListNode fast = head.next;
    ListNode slow = head;

    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }

    // Step 2: Split the list into two halves
    ListNode middle = slow.next;
    slow.next = null;

    // Step 3: Reverse the second half
    ListNode prev = null;
    ListNode future = null;
    ListNode curr = middle;

    while (curr != null) {
        future = curr.next;  // Save the next node
        curr.next = prev;    // Reverse the current link

        prev = curr;         // Move prev forward
        curr = future;       // Continue to the next node
    }

    // prev is the head of the reversed second half

    // Step 4: Merge both halves alternately
    ListNode first = head;
    ListNode second = prev;

    while (second != null) {

        ListNode tempFirst = first.next;
        ListNode tempSec = second.next;

        first.next = second;      // Connect first node to second
        second.next = tempFirst;  // Connect second back to first half

        first = tempFirst;        // Advance first pointer
        second = tempSec;         // Advance second pointer
    }   
    }
}
