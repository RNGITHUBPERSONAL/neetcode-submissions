class Solution {
    public int compress(char[] chars) {
 int len=chars.length-1;int count=1;
        StringBuilder stringBuilder= new StringBuilder();

        for(int i=1;i<chars.length;i++) {

            if (chars[i - 1] == chars[i]) {
                count++;
            } else {
                stringBuilder.append(chars[i - 1]);
                if (count > 1) {
                    stringBuilder.append(count);
                }
                count = 1;
            }
        }
            stringBuilder.append(chars[len]);

            if(count>1) {
                stringBuilder.append(count);
            }


    for (int i = 0; i < stringBuilder.length(); i++) {
            chars[i] = stringBuilder.charAt(i);
        }

        return stringBuilder.length();
        
    }
}