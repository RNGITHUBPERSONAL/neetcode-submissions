class Solution {
    public List<List<String>> groupStrings(String[] strings) {
List<List<String>> data= new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();



        for (int i = 0; i < strings.length; i++) {
            String hashKey = getHash(strings[i]);
            if (map.containsKey(hashKey)) {

                List<String> temp = map.get(hashKey);
                temp.add(strings[i]);
            } else {
                List<String> res = new ArrayList<>();
                res.add(strings[i]);
                map.put(hashKey, res);


            }
        }
        for(String key: map.keySet()){
             data.add( map.get(key));
        }
       return data;


    }

    private static String getHash(String strings) {
        char[] ch = strings.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ch.length - 1; i++) {
           sb.append((ch[i + 1] - ch[i]+ 26) % 26).append(",");
        }
        return sb.toString();
    }
}
