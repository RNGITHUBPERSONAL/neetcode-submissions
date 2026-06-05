class Solution {
    public boolean isValid(String s) {
                if(s.length()==1){
 return false;
                }
                

               Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
  if(c=='(' || c=='{' || c=='['){
      st.push(c);
  }else if(c==')' || c=='}' || c==']'){
    if (st.empty()) return false;
      if(!st.empty() && (st.peek()== '[' && c==']')){
         st.pop();
      }
      else if(!st.empty() && (st.peek()== '{' && c=='}')){
          st.pop();
      }
      else if(!st.empty() && (st.peek()== '(' && c==')')){
          st.pop();
      }else{
        return false;
      }
  }
        }

      

    
   
    
   
     if(st.empty()){
             return true;
        }
        return false;  
    }
}
