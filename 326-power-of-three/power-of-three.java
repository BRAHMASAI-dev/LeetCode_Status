class Solution {
    public boolean isPowerOfThree(int n) {
        
        double val = Math.pow(3,19);
        return n>0 && val % n ==0;
    }
}