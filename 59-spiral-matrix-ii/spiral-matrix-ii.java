class Solution {
    public int[][] generateMatrix(int n) {
        int [][]matrix = new int[n][n];
        int rb = 0;
        int re = n-1;
        int cb = 0;
        int ce = n-1;
        int a = 1;
        while(rb<=re && cb<=ce){
            //right
        for(int j=cb; j<=ce; j++){
            matrix[rb][j] = a++;
        }
        rb++;
        //down
        for(int i=rb; i<=re; i++){
            matrix[i][ce] = a++;
        }
        ce--;
        //left
        if(rb<=re)
        for(int i=ce; i>=cb; i--){
            matrix[re][i] = a++;
        }
        re--;
        //up
        if(cb<=ce)
        for(int i=re; i>=rb; i--){
            matrix[i][cb] = a++;
        }
        cb++;
        }
        return matrix;
    }
}