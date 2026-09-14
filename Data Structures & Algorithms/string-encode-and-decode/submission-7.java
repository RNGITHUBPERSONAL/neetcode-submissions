class Solution {
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            int len = str.length();
            sb.append(len).append("#").append(str);

           
        }
         return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> lst = new ArrayList<>();

        StringBuilder sb1 = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                sb1.append(str.charAt(i));
            } else if (str.charAt(i) == '#') {
                Integer range = Integer.parseInt(String.valueOf(sb1));
                String sub = str.substring(i + 1, i + range + 1);
                lst.add(sub);
                sb1 = new StringBuilder();
                 i = i + range;
            }
            }
       

        return lst;
    }
}
