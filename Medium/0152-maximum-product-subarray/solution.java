class Solution {
    public int maxProduct(int[] nums) {
        int maxP = nums[0], minP = nums[0], res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int tempMax = Math.max(nums[i], Math.max(maxP * nums[i], minP * nums[i]));
            int tempMin = Math.min(nums[i], Math.min(maxP * nums[i], minP * nums[i]));
            maxP = tempMax;
            minP = tempMin;
            res = Math.max(res, maxP);
        }
        return res;
    }
}
