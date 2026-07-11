class Solution {
    public int maxScore(String s) {
         int max = Integer.MIN_VALUE;
        int zeroCount = 0; int oneCount = 0;


       for(int i=0;i<s.length()-1;i++){


           if(s.charAt(i)=='0'){
               zeroCount++;
           }

           for(int j=i+1;j<s.length();j++){

               if(s.charAt(j)=='1'){
                   oneCount++;
               }
           }

           max=Math.max(max,zeroCount+oneCount);
           oneCount=0;


       }
       return max;
    }
}