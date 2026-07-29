class Solution {
    public int[] replaceElements(int[] arr) {
        
        for(int i=0; i<arr.length; i++){
            int r = -1;
            for(int j=i+1; j<arr.length; j++){
                    r = Math.max(r,arr[j]);
            }
            arr[i]=r;
        }
        return arr;
    }
}