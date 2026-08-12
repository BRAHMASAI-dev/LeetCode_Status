class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minlen = Integer.MAX_VALUE;
        int n = nums.length;
        int l = 0;
        int r = 0;
        int maxsum = 0;
        for(;r<n;r++){
            maxsum += nums[r];
            while(maxsum>=target){
                minlen = Math.min(minlen,r-l+1);
                maxsum -= nums[l];
                l++;
            } 
        }
        return minlen==Integer.MAX_VALUE?0:minlen;
    }
}