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
        Node original = head;
        HashMap<Node, Node> hashmap = new HashMap();
        while (original != null) {
            Node newNode = new Node(original.val);
            hashmap.put(original, newNode);
            original = original.next;
           
        }

        original = head;
       
        while (original != null) {
            Node randomOriginal = original.random;
            Node newNodeReferenceCopy = hashmap.get(original);
            Node copyNodeRandomRefrence = hashmap.get(randomOriginal);
            newNodeReferenceCopy.random = copyNodeRandomRefrence;
            newNodeReferenceCopy.next=hashmap.get(original.next);
            original = original.next;
        }
      return  hashmap.get(head);
    }
}
