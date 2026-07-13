class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        Arrays.sort(trips,(a,b)->Integer.compare(a[1],b[1]));
PriorityQueue<Integer[]> pq=new PriorityQueue<>((a, b) -> Integer.compare(a[1], b[1]));
int totalPassenger=0;
for(int i=0;i<trips.length;i++){
    
    
    while(!pq.isEmpty() && pq.peek()[1]<=trips[i][1]){
        
        Integer [] data=   pq.poll();
        totalPassenger=totalPassenger-data[0];
        
       
    }
    totalPassenger=totalPassenger+trips[i][0];
    
    if(totalPassenger>capacity){
        return false;
    }
    pq.add(new Integer[]{trips[i][0],trips[i][2]});
}
return true;
    }
}