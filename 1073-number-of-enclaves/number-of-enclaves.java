class Solution {
    private void dfs(int[][] grid,int r,int c){
        //out of bounds cond
        if(r<0 || c<0 || r>= grid.length || 
        c>=grid[0].length ) return ;

        if(grid[r][c]==0) return ;
        //visited cell marking with water 
        grid[r][c]=0;
        
        //if(grid[r][c]==1) return 1;
        dfs(grid, r-1, c);
        dfs(grid, r+1, c);
        dfs(grid, r, c-1);
        dfs(grid, r, c+1);
        //return 0;
    }
    
    public int numEnclaves(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        //check first and last row 
        //for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[0][j]==1)
                    dfs(grid, 0, j);
                    
                if(grid[n-1][j]==1)
                    dfs(grid, n-1, j);
            }
        //}
        //check first and last columns 
        //for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(grid[j][0]==1)
                    dfs(grid, j, 0);
                    
                if(grid[j][m-1]==1)
                    dfs(grid, j, m-1);
            }
        //}
        int count = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j]==1){
                    count++;
                }
            }
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna