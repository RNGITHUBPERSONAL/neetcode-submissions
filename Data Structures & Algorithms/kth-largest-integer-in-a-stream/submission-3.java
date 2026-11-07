class KthLargest {
    PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
    int k = 0;
    public KthLargest(int k, int[] nums) {
        this.k=k;
        for(int i:nums){

            priorityQueue.offer(i);
            if(!priorityQueue.isEmpty() && priorityQueue.size()>k){
                priorityQueue.poll();
            }
        }
    }

    public int add(int val) {

 this.k=k;
        

            priorityQueue.offer(val);
            if(!priorityQueue.isEmpty() && priorityQueue.size()>k){
                priorityQueue.poll();
            }
       return priorityQueue.peek();





       
    }
}
// After inserting all elements using offer(), aren't they already ordered? Why do we need poll()? Can't we just loop through the PriorityQueue and find the Kth element?