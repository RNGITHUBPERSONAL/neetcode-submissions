class Solution {

    public String encode(List<String> strs) {
 StringBuilder stb= new StringBuilder();
      for(String str:strs){
       
             stb.append(str.length()).append("#").append(str);



      }
return new String(stb);
    }

    public List<String> decode(String str) {
 List<String> strs = new ArrayList<>();
       
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            if (Character.isDigit(str.charAt(i))) {
                stringBuilder.append(str.charAt(i));
            } else if (str.charAt(i) == '#') {
                int a = Integer.parseInt(String.valueOf(stringBuilder));
                String sp = str.substring(i+1, a + i+1);
                strs.add(sp);
                i = i + a;
                stringBuilder = new StringBuilder();

            }


        }
        return strs;
    }
}
