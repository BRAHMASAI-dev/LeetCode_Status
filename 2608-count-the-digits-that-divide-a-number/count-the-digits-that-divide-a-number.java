class Solution {
    public int countDigits(int num) {
        int count = 0;
        int t = num;
        if(num<10)
            return 1;
        while(num!=0){
            int rem = num%10;
            if(t%rem == 0){
                count++;
            }
            num/=10;
        }
    return count;
    }
    
}