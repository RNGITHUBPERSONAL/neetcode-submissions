

class Solution {
     HashMap<Integer, Integer> map=null;
     int rootIndex=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        map= new HashMap();
        int i = 0;
        for (int in : inorder) {
            map.put(inorder[i], i);
            i++;
        }
      return  buildTree(preorder, rootIndex, preorder.length-1);
    }

    TreeNode buildTree(int[] preorder, int start, int last) {
        if (start > last) {
            return null;
        }

        int rootValue= preorder[rootIndex];
         rootIndex=rootIndex+1;
        TreeNode newNode= new TreeNode(rootValue);
         int index= map.get(rootValue);//decide left and right part of node
         newNode.left=buildTree(preorder,start,index-1);
         newNode.right=buildTree(preorder,index+1,last);
         return newNode;
    }
}
