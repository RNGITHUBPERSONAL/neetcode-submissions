class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        int result = 0;

        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*")
                || tokens[i].equals("/")) {
                int i1 = stack.pop();
                int i2 = stack.pop();
                if (tokens[i].equals("+")) {
                    result = i1 + i2;
                    stack.push(result);
                } else if (tokens[i].equals("-")) {
                    result = i2 - i1;
                    stack.push(result);
                } else if (tokens[i].equals("*")) {
                    result = i1 * i2;
                    stack.push(result);
                } else if (tokens[i].equals("/")) {
                    result = i2 / i1;
                    stack.push(result);
                }

            } else {
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return stack.pop();
    }
}
