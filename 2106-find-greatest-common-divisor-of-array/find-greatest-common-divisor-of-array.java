class Solution {
    public int findGCD(int[] nums) {
        int gcd = 1;
        int n1 = Arrays.stream(nums).min().getAsInt();
        int n2 = Arrays.stream(nums).max().getAsInt();
        for(int i=n1; i>1; i--){
            if(n1%i == 0)
                if(n2%i == 0)
                    return i;
        }
        return gcd;
    }
}