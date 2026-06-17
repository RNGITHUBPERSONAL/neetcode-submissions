class MyStack {
    private Queue<Integer> q1;
private Queue<Integer> q2;
    public MyStack() {
        q1= new ArrayDeque();
        
    }
    
    public void push(int x) {
        
           q1.offer(x); //1,2,3
         int size= q1.size();


         for(int i=0;i<size-1;i++){
            q1.offer(q1.poll());
         }
    }
//     offer(5)
// [4,3,2,1,5]

// rotate 4 times:
// [3,2,1,5,4]
// [2,1,5,4,3]
// [1,5,4,3,2]
// [5,4,3,2,1]
    public int pop() { // ned to remove 3 not 1
      
      return q1.poll();
        
    }
    
    public int top() {
        return q1.peek();
    }
    
    public boolean empty() {
        if(q1.isEmpty()) return true; return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */