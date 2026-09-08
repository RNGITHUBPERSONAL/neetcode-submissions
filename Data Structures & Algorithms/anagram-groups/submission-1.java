class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        ArrayList arrayList = new ArrayList<>();
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] str = strs[i].toCharArray();
            Arrays.sort(str);

            String sorted = new String(str);

            if (map.containsKey(sorted)) {
                ArrayList<String> val = map.get(sorted);
                val.add(strs[i]);
                map.put(sorted, val);
            } else {
                ArrayList<String> newArraylist = new ArrayList<>();
                newArraylist.add(strs[i]);
                map.put(sorted, newArraylist);
            }
        }

return new ArrayList<>(map.values());

    }
}
