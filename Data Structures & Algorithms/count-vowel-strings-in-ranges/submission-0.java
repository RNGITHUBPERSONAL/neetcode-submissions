class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
              List<Integer> result = new ArrayList<>();
        List<Character> arrayList = Arrays.asList('a', 'e', 'i','o','u');
        int count = 0;
        for (int j = 0; j < queries.length; j++) {
            for (int i = queries[j][0]; i <= queries[j][1]; i++) {
                String str = words[i];
                char c1 = str.charAt(0);
                char c2 = str.charAt(str.length() - 1);

                boolean isTrue = arrayList.contains(c1);
                boolean isTrue1 = arrayList.contains(c2);

                if (isTrue1 && isTrue) {
                    count++;
                }
            }
            result.add(count);
            count = 0;

        }
       return result.stream().mapToInt(r->r).toArray();
    }
}