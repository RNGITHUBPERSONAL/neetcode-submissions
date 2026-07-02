
class ListNode {
    int key;
    int val;
    ListNode prev = null;
    ListNode next = null;

    ListNode(int key, int val) {
        this.key = key;
        this.val = val;
    }
}

class LRUCache {
    int size;
    ListNode left;
    ListNode right;
    private HashMap<Integer, ListNode> cache;

    public LRUCache(int capacity) {
        this.size = capacity;
        cache = new HashMap<>();
        this.left = new ListNode(0, 0);

        this.right = new ListNode(0, 0);

        this.left.next = this.right;
        this.right.prev = this.left;
    }

    public int get(int key) {
     if (cache.containsKey(key)) {
            ListNode node = cache.get(key);
            int data = node.val;
            deleteNode(node);
              insertNode(node);
            return data;
        }

        return -1;


    }

    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            deleteNode(cache.get(key));
        }
        ListNode newNode = new ListNode(key, value);

        cache.put(key, newNode);
        insertNode(newNode);

        if (cache.size() > size) {
            ListNode removeNode = right.prev;
            deleteNode(removeNode);
            cache.remove(removeNode.key);
        }
    }

    public void deleteNode(ListNode removeNode) {
        ListNode nxt = removeNode.next;

        removeNode.prev.next = nxt;
        removeNode.next.prev = removeNode.prev;
    }

    public void insertNode(ListNode newNode) {
        ListNode temp = this.left.next;
        this.left.next = newNode;
        newNode.prev = left;
        newNode.next = temp;
        temp.prev = newNode;
    }

   
}
