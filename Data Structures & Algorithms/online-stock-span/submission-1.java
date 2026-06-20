class StockSpanner {
    Stack<int[]> stack = null;
   
    
    public StockSpanner() {
        stack = new Stack<>();
    }

    public int next(int price) {
       int current =1;

        while (!stack.isEmpty() && stack.peek()[0] <= price) {
            int pointer = stack.peek()[1];
            current = current + pointer;
            stack.pop();
        }
        
        stack.push(new int[] {price, current});
        return current;
    }
}
