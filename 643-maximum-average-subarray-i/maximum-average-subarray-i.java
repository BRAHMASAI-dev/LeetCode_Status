class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        double maxsum = 0;
        for(int i=0; i<k; i++)
            maxsum += nums[i];
        double curr = maxsum;
        for(int i=k; i<nums.length; i++){
            curr += nums[i];
            curr -= nums[i-k];
            maxsum = Math.max(curr,maxsum);
        }
        return maxsum/k;
    }
}