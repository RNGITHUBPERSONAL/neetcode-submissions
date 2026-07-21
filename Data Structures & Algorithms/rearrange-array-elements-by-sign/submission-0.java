class Solution {
    public int[] rearrangeArray(int[] nums) {
 ArrayList<Integer>positive=new ArrayList<>();
        ArrayList<Integer>negetive=new ArrayList<>();

      for(int i=0;i<nums.length;i++){
      if(nums[i]<0){
      negetive.add(nums[i]);

      }else {
          positive.add(nums[i]);
      }
      }
      int j=0;int k=1;
  int i=0;


      while(i<positive.size() ){
          nums[j]=positive.get(i);
          nums[k]=negetive.get(i);
j=j+2;
k=k+2;
i++;
      }
          return nums;  
    }
}