class Solution {
    public String simplifyPath(String path) {
      Stack<String>stack= new Stack<>();
       
        String []arr=path.split("/");
        for(String s: arr){
              if(s.equals("")||s.equals(".")){
                  continue;
              }else{
                  if( !stack.isEmpty() && s.equals("..")){
                      stack.pop();
                  }else{
                     if(stack.isEmpty() && s.equals("..")){
                        continue;  
                      }
                      stack.push(s);
                  }

              }
        }
String ans="";

while(!stack.isEmpty()){
    String val=stack.pop();
   ans="/"+val+ans;
} 
return ans==""?"/":ans; 
    }
}