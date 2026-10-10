class Solution {
    public boolean isMajorityElement(int[] nums, int target) {
        Map<Integer, Long> res = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(
                        num -> num,
                        Collectors.counting()
                ));

        Long val = res.getOrDefault(target, 0L);

        return val > nums.length / 2;
    }
}