class Solution {
    public String decodeString(String s) {
         
        Stack<Character>stack= new Stack<>();

        for(char ch:s.toCharArray()){//2[a34[ba]]c

            if(ch !=']'){
                stack.push(ch);
            }else{
                StringBuilder charBuild= new StringBuilder();
                while(!stack.isEmpty() && stack.peek()!='['){
                     charBuild.append(stack.pop());//ab ->we need ba
                }
                stack.pop();
                charBuild.reverse();
                StringBuilder numBuild= new StringBuilder();
                while(!stack.isEmpty() && Character.isDigit(stack.peek())){
                    numBuild.append(stack.pop());   //34
                }
                numBuild.reverse();
                int num= Integer.parseInt(String.valueOf(numBuild));

                for(int i=0;i<num;i++){
                     for(char cr:charBuild.toString().toCharArray()){
                         stack.push(cr);
                     }
                }
            }

        }
        StringBuilder sbd=new StringBuilder();
        for(char ch:stack){
            sbd.append(ch);
        }
          String ans=sbd.toString();
      return    ans;
        
         
    }
}