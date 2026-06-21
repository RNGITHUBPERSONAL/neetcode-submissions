class Solution {
    public String simplifyPath(String path) {
       
        Stack<String> stack = new Stack<>();
        String st[]=path.split("/");
      for(String element:st) {
          if (element.equals("") || element.equals(".")) {
              continue;
          }

              if (element.equalsIgnoreCase("..")) {
                  if (!stack.isEmpty()) {
                      stack.pop();
                  }

              } else {
                  stack.push(element);
              }

          }







      return "/" + String.join("/", stack);
 
    }
}