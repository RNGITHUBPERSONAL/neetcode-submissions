class Solution {
    public String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();
        int num = 0;
        String ans = "";
        StringBuilder stringBuilder = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');

            } else if (ch == '[') {
                numStack.push(num);
                num = 0;
                stringStack.push(String.valueOf(ch));
            } else if (ch == ']') {
                while (!stringStack.peek().equals("[")) {
                  stringBuilder.insert(0, stringStack.pop());
                }
                stringStack.pop();
              
                num = numStack.pop();
                String res = "";
                for (int i = 0; i < num; i++) {
                    res = res + stringBuilder.toString();
                }

                stringStack.push(res);
                stringBuilder = new StringBuilder();
                num = 0; // 3[z]4[c]
            } else {
                stringStack.push(String.valueOf(ch));
            }
        }
        while (!stringStack.isEmpty()) {
            ans = stringStack.pop() + ans;
        }

        return ans;
    }
}