class Solution {
    public int largestUniqueNumber(int[] nums) {

        HashMap<Integer, Integer> res = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            res.put(nums[i], res.getOrDefault(nums[i],0)+1 );


        }
        int largestNumber=-1;
        for (int key:res.keySet()) {

            int val=res.get(key);

            if(   largestNumber<key              && val==1)
               largestNumber=key;

        }


        return largestNumber;
    }
}

