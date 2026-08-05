class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum = nums[0];
        int curr = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int val = nums[i];
            curr = (val > curr + val) ? val : curr + val;
            maxsum = (maxsum > curr) ? maxsum : curr;
        }
        
        return maxsum;
    }
}
