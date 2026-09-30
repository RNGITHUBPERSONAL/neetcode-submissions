class MyQueue {
  Stack<Integer> stack = null;
    Stack<Integer> stack2 = null;
    public MyQueue() {
        stack = new Stack<Integer>();
        stack2 = new Stack<Integer>();
    }
    public void push(int x) {
    while(!stack.isEmpty()){
       stack2.push(stack.pop());
    }

stack.push(x);

while(!stack2.isEmpty()){
       stack.push(stack2.pop());
    }
    }
    
    public int pop() {
       return stack.pop();
    }
    
    public int peek() {
      return   stack.peek();
    }
    
    public boolean empty() {
      return  stack.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */