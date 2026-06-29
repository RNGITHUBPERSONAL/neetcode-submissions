

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null)
            return null;
        Node originalNode = head;
        Node dummy = new Node(0);

        Node copyNode = dummy;

        HashMap<Node, Node> map = new HashMap();
        while (originalNode != null) {
            Node newNode = new Node(originalNode.val);
            copyNode.next = newNode;
            copyNode = copyNode.next;
            map.put(originalNode, newNode);
            originalNode = originalNode.next;
        }

        originalNode = head;
        copyNode = dummy.next;
        while (originalNode != null) {
            Node originalRandom = originalNode.random;
            Node val = map.get(originalRandom);

            copyNode.random = val;
            copyNode = copyNode.next;
            originalNode = originalNode.next;
        }

        return dummy.next;
    }
}
