class Solution {
    public int evalRPN(String[] tokens) {
       Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {

            if (tokens[i].equals("*")) {

                int i1 = stack.pop();
                int i2 = stack.pop();

                int result = i1 * i2;
                stack.push(result);

            } else if (tokens[i].equals("+")) {

                int i1 = stack.pop();
                int i2 = stack.pop();

                int result = i1 + i2;
                stack.push(result);

            } else if (tokens[i].equals("-")) {

                int i1 = stack.pop();
                int i2 = stack.pop();

                int result = i2 - i1;
                stack.push(result);

            } else if (tokens[i].equals("/")) {

                int i1 = stack.pop();
                int i2 = stack.pop();

                int result = i2 / i1;
                stack.push(result);

            } else {

                stack.push(Integer.parseInt(tokens[i]));
            }
        }

        return stack.peek();
      
    }
}
