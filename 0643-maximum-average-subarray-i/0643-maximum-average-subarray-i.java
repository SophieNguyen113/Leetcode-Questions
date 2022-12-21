class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxAvr = -Double.MAX_VALUE;
        double sum = 0;
        int left = 0, right = 0;
        while(right < nums.length){
            while(right - left + 1 <= k ){
                sum += nums[right];
                right++;
            }
            maxAvr = Math.max(maxAvr,sum/k);
            sum -= nums[left];
            left++;
        }
        return maxAvr;
    }
}