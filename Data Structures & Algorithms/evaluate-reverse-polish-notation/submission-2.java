class Solution {
    public int evalRPN(String[] tokens) {
        List<String> arrayList = new ArrayList<>(List.of(tokens));

        int result = 0;
        while (arrayList.size() > 1) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i).equals("+") || arrayList.get(i).equals("-")
                    || arrayList.get(i).equals("*") || arrayList.get(i).equals("/")) {
                    int i1 = Integer.parseInt(arrayList.get(i - 1));
                    int i2 = Integer.parseInt(arrayList.get(i - 2));
                    if (arrayList.get(i).equals("+")) {
                        result = i1 + i2;
                    } else if (arrayList.get(i).equals("-")) {
                        result = i2 - i1;
                    } else if (arrayList.get(i).equals("*")) {
                        result = i1 * i2;
                    } else if (arrayList.get(i).equals("/")) {
                        result = i2 / i1;
                    }
                    arrayList.set(i - 2, String.valueOf(result));
                    arrayList.remove(i);
                    arrayList.remove(i - 1);
                    break;
                }
            }
        }
        return Integer.parseInt(arrayList.get(0));
    }
}
