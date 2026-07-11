class Solution {
    public int maxScore(String s) {
         int max = Integer.MIN_VALUE;
         int zeroCount = 0; int oneCount = 0; int Count = 0;


        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)=='1'){
                Count++;
            }
        }


       for(int i=0;i<s.length()-1;i++){

           if(s.charAt(i)=='0'){
               zeroCount++;
           }else {
               oneCount++;
           }


           max=Math.max(max,zeroCount+(Count-oneCount));


       

       }
       return max;
    }
}