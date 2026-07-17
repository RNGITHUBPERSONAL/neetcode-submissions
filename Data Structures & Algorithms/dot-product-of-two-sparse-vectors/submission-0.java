class SparseVector {
        

 HashMap<Integer, Integer> map = new HashMap<>();

    SparseVector(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {
                map.put(i, nums[i]);   // index -> value
            }

        }
    }
    
	// Return the dotProduct of two sparse vectors
    public int dotProduct(SparseVector vec) {
           int sum = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            int index = entry.getKey();

            if (vec.map.containsKey(index)) {
                sum += entry.getValue() * vec.map.get(index);
            }
        }

        return sum;
     
    }
}

// Your SparseVector object will be instantiated and called as such:
// SparseVector v1 = new SparseVector(nums1);
// SparseVector v2 = new SparseVector(nums2);
// int ans = v1.dotProduct(v2);
