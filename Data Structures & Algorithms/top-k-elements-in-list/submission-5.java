class Solution {
  public int[] topKFrequent(int[] nums, int k) {
 int res[]= new int[k];

HashMap<Integer,Integer> map = new HashMap<>();
for(int num:nums){
    map.put(num,map.getOrDefault(num,0)+1);
}
PriorityQueue<Integer>priorityQueue=new PriorityQueue<>((a,b)->map.get(a)-map.get(b));

for(int key:map.keySet()){
    
    priorityQueue.offer(key);
    if(priorityQueue.size()>k){
        priorityQueue.poll();
    }
}

for(int i=0;i<k;i++){
    res[i]=priorityQueue.poll();
}
return res;
  }
}
