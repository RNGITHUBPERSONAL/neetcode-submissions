class MinStack {
    Stack<Integer> stack = null;
    Stack<Integer> newStack = null;
    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        int res = Integer.MAX_VALUE;;

        for (int min : stack) {
            if (res >= min) {
                res = min;
            }
        }
        return res;
    }
}
