class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
  int[] ans = new int[temperatures.length];

for (int i = 0; i < temperatures.length; i++) {

    while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
// If we don't pop it, we'll keep checking the same top element and won't reach the next element.  with 75, 71, 69, 72, 76, we need to pop 69 and 71 so that 75
        int previous = stack.pop();

        // i - previous means calculate how many days it took the previous day to find a warmer temperature and store that result at the previous day’s position
        ans[previous] = i - previous;
    }

    stack.push(i);
}

return ans;
    }
}
