class Solution {
    public int maxSubArray(int[] nums) {
        int length = nums.length;
        int currSum =0;
        int maxSum =nums[0];
        for(int i=0;i<length;i++){
            currSum = Math.max(currSum,0);
            currSum += nums[i];
            maxSum = Math.max(maxSum,currSum);
        }
        return maxSum;
    }
}
