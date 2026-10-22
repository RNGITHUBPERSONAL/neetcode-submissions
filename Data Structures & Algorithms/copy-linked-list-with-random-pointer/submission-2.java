/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
           if (head == null) {
            return null;
        }
        // Phase 1: Insert copied nodes
Node curr = head;

while (curr != null) {
    Node newNode = new Node(curr.val);

    newNode.next = curr.next;
    curr.next = newNode;

   
    curr = newNode.next;
}

// Phase 2: Assign random pointers
curr = head;

while (curr != null) {
    if (curr.random != null) {
        curr.next.random = curr.random.next;
    }

    curr = curr.next.next;
}

// Phase 3: Separate original and copied lists
curr = head;
Node  res = head.next;
Node newcurr = res;

while (curr != null ) {
    curr.next = newcurr.next;
    curr = curr.next;

    if (curr != null) {
        newcurr.next = curr.next;
        newcurr = newcurr.next;
    }
    
}

return res;
    }
}
