class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

       for (int i = 0; i < asteroids.length; i++) {

            int current=asteroids[i];
            while(!stack.isEmpty() && current<0 && stack.peek()>0 ) {
                int val = stack.peek();
                int element= current * (-1);
                if (val == element) {
                    stack.pop();
                    current = 0;
                } else if (val < element) {
                    stack.pop();
                } else {
                    current = 0;

                }
            }
                if(current!=0) {
                    stack.push(asteroids[i]);//-4,4
                }
            }
        

        return stack.stream().mapToInt(Integer::intValue).toArray();
    }
}