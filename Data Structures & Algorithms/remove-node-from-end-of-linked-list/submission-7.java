

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;
        int i = 1;
        if (head == null || head.next == null)
            return null;

        while (fast != null ) {
            if (i > n) {
                break;
            }
            fast = fast.next;
           

            i++;
        }


while(fast!=null && fast.next!=null){

fast=fast.next;
    slow =slow.next;
}





        slow.next = slow.next.next;

        return dummy.next;
    }
}
