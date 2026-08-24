class Solution {
    public int search(int[] nums, int target) {
        int m=0;
        int l = 0;
        int r = nums.length-1;
        if(nums.length==1 && nums[0]== target) return 0;
        while(l<=r){
            m = (l+r)/2;
            
            if(nums[m] == target)
                return m;
            if(nums[m]>target)
                r=m-1;
            else
                l=m+1;
        }
        return -1;
    }
}