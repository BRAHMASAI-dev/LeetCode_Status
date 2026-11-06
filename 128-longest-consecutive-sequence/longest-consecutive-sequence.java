class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int max = 0;
        for(int i:nums)
            hs.add(i);
        for(int i:hs){
            int v = i;
            if(!hs.contains(v-1)){
                int c = 1;
                while(hs.contains(v+1)){
                    c++;
                    v++;
                }
            if(c>max) max = c;}
        }
        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna