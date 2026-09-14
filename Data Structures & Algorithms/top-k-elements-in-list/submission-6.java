class Solution {
  public int[] topKFrequent(int[] nums, int k) {
 int res[]= new int[k];

HashMap<Integer,Integer> map = new HashMap<>();
for(int num:nums){
    map.put(num,map.getOrDefault(num,0)+1);
}
PriorityQueue<Integer>priorityQueue=new PriorityQueue<>((a,b)->map.get(a)-map.get(b));
map.keySet().stream().forEach(data->{
    priorityQueue.offer(data);
            if(priorityQueue.size()>k){
                priorityQueue.poll();
            }
    
        });


return IntStream.range(0,k).map(i->priorityQueue.poll()).toArray();

  }
}
