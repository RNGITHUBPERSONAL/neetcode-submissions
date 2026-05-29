class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
  
     int min = arrays.get(0).get(0);
        int max = arrays.get(0).get(arrays.get(0).size() - 1);
        int res = 0;
        for (int i = 1; i < arrays.size(); i++) {
            List<Integer>current=  arrays.get(i);
            int first =current.get(0);
            int last=current.get(current.size()-1);


           res=Math.max(res,Math.abs(min-last)); //1-5 res=4
            res=Math.max(res,Math.abs(first-max));//4,14





            min=Math.min(min,first);
            max=Math.max(min,last);


            }
            return res;
    }
}
