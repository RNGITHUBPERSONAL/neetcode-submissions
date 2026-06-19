class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<int[]> stack = new Stack<>();
        int []ans= new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
           int temp= temperatures[i]  ;
           while(!stack.isEmpty() && stack.peek()[0]<temp){
               int[] val=stack.peek();

                   stack.pop();
                   int difference=i-val[1];
                   ans[val[1]]=difference;

           }
            stack.push(new int[]{temp,i});


            }
            return ans;
    }
}
