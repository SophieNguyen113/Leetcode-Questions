class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minSize = Integer.MAX_VALUE;
        int left = 0, right = 0;
        int currSum = 0;
        
        while(right<nums.length){
           currSum += nums[right];
           while(currSum >= target){
               minSize = Math.min(minSize, right - left + 1 );
               currSum -= nums[left];
               left++;
           }
           right++;
        }
        return minSize == Integer.MAX_VALUE ? 0 : minSize;
    }
}