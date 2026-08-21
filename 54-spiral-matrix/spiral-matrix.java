class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rb = 0;
        int cb = 0;
        int re = matrix.length-1;
        int ce = matrix[0].length-1;
        List<Integer> res = new ArrayList<>();
        while(rb<=re && cb<=ce){
            //right
            for(int j=cb; j<=ce; j++){
                res.add(matrix[rb][j]);
            }
            rb++;
            //down
            for(int i=rb; i<=re; i++){
                res.add(matrix[i][ce]);
            }
            ce--;
            //left
            if(rb<=re)
            for(int i=ce; i>=cb; i--){
                res.add(matrix[re][i]);
            }
            re--;
            //up
            if(cb<=ce)
            for(int i=re; i>=rb; i--){
                res.add(matrix[i][cb]);
            }
            cb++;
        }
        return res;
    }
}