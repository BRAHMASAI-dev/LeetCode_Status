class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        long rev = 0;
        while(x>0){
            int rem = x%10;
            rev = rev *10 + rem;
            x/= 10;
        }
        if(temp == rev)
            return true;
        return false;
    }
}