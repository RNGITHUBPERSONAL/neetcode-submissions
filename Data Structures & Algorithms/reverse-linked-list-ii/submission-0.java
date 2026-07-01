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
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode prev = dummy;
    ListNode curr = head;

    for (int i = 1; i < left; i++) {
      prev = curr;
      curr = curr.next;
    }
    ListNode sublistHead = curr;
    prev.next = null;

    // start from middel till point

    ListNode preNode = null;
    for (int i = 1; i <= (right - left) + 1; i++) {
      ListNode nxt = curr.next;
      curr.next = preNode;

      preNode = curr;

      curr = nxt;
    }
    prev.next = preNode;
    sublistHead.next = curr;

    return dummy.next;
  }
}