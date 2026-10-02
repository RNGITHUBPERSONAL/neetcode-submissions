class MinStack {
    int min = Integer.MAX_VALUE;
    Stack<Integer> minStack = null;
    Stack<Integer> stack = null;
    public MinStack() {
        minStack = new Stack<>();
        stack = new Stack();
    }

    public void push(int val) {
        stack.push(val);

        if (minStack.isEmpty()) {
            minStack.push(val);
        } else {
            min = Math.min(val, minStack.peek());
            minStack.push(min);
        }
    }

    public void pop() {
        if (!stack.isEmpty()) {
            minStack.pop();

            stack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
