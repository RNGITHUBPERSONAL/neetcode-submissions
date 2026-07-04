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
  public boolean isPalindrome(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;

      fast = fast.next.next;
    }
    ListNode middel = null;
    if (fast == null) {
      middel = slow;
      slow = null;
    } else {
      middel = slow.next;
      slow.next = null;
    }

    ListNode current = middel;

    ListNode previous = null;
    ListNode nxt = null;

    while (current != null) {
      nxt = current.next;
      current.next = previous;
      previous = current;

      current = nxt;
    }
    while (previous != null && head != null) {
      if (previous.val != head.val) {
        return false;
      }

      previous = previous.next;
      head = head.next;
    }

    return true;
  }
}