class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int res[] = new int[nums.length];
        Stack<Integer> s1 = new Stack<>();
        Arrays.fill(res,-1);
        for(int i=0; i<2*nums.length; i++){
            int cidx = i%nums.length;
            while(!s1.isEmpty() && nums[cidx]>nums[s1.peek()]){
                res[s1.pop()] = nums[cidx];
            }
            if(i<nums.length)
                s1.push(i);
        }
        return res;
    }
}