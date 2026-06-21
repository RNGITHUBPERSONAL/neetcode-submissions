class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
         Stack<Double> stack = new Stack<>();
       int[][]arr= new int[position.length][2];
        for(int i=0;i<position.length;i++){
            arr[i][0]=position[i];
            arr[i][1]=speed[i];
        }
        Arrays.sort(arr,(a,b)->Integer.compare(b[0],a[0]));
       for(int[] ar:arr){
             double coverDistance=(double)(target-ar[0])/ar[1];
           stack.push(coverDistance);
if(stack.size()>=2 && stack.peek()<=stack.get(stack.size() - 2)){
    stack.pop();
}

       }
       return stack.size();
    }
}
