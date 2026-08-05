class Solution {
    public int findGCD(int[] nums) {
        int n1 = 9999;
        int n2 = 0;
        int gcd = 1;
        for(int i=0; i<nums.length; i++){
            if(nums[i]<n1)
                n1 = nums[i];
            if(nums[i]>n2)
                n2 = nums[i];
        }
        for(int i=n1; i>1; i--){
            if(n1%i == 0)
                if(n2%i == 0)
                    return i;
        }
        return gcd;
    }
}