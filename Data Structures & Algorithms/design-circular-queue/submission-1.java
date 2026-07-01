
class ListNode {
  int val;
  ListNode prev, next;

  ListNode(ListNode next, int val, ListNode prev) {
    this.next = next;
    this.val = val;
    this.prev = prev;
  }
}

class MyCircularQueue {
  int size;
  ListNode right = null;
  ListNode left = null;
  int track = 0;
  public MyCircularQueue(int k) {
    this.right = new ListNode(null, 0, null);
    this.left = new ListNode(null, 0, null);
    this.left.next = this.right;
    this.right.prev = this.left;
    this.size = k;
  }

  public boolean enQueue(int value) {
    if (track < this.size) {
      ListNode newNode = new ListNode(null, value, null);
      ListNode lastNode = right.prev;

      lastNode.next = newNode;
      newNode.next = right;

      newNode.prev = lastNode;
      right.prev = newNode;

      track++;
      return true;
    }
    return false;
  }

  public boolean deQueue() {
    if (track != 0) {
      ListNode temp = left.next;
      left.next = temp.next;
      temp.next.prev = left;
      track--;
      return true;
    }
    return false;
  }

  public int Front() {
    if (track != 0) {
      return left.next.val;
    }
    return -1;
  }

  public int Rear() {
    if (track != 0) {
     return this.right.prev.val;
    }
    return -1;
  }

  public boolean isEmpty() {
    if (track == 0) {
      return true;
    }
    return false;
  }

  public boolean isFull() {
    if (track == size) {
      return true;
    }

    return false;
  }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */