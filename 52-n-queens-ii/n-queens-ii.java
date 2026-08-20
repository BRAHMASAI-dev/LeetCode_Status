class Solution {
    int count = 0;
    boolean isSafe(int row, int col, char[][]cboard, int n){
        //horizantal
        for(int i=0; i<n; i++){
            if(cboard[row][i]=='Q')
                return false;
        }
        //vertical
        for(int i=0; i<n; i++){
            if(cboard[i][col] == 'Q')
                return false;
        }
        //left diagonal
        for(int j=col,i=row; i>=0 && j>=0; i--, j--){
            if(cboard[i][j] == 'Q')
                return false;
        }
        //right diaonal
        for(int i=row,j=col; i>=0 && j<n; i--, j++){
            if(cboard[i][j] == 'Q')
                return false;
        }
        return true;
    }
    private void backtrack(int row, int n, char[][] cboard){
        //store the correct combinations
        if(row==n){
            count++;
            return ;
        }
        //Placing the queenson the board
        for(int col=0; col<n; col++){
            if(isSafe(row,col,cboard,n)){
                cboard[row][col] = 'Q';
                backtrack(row+1, n, cboard);
                cboard[row][col] = '.';
            }
        }
    }
    public int totalNQueens(int n) {
        char [][] cboard = new char[n][n];
        for(char []c: cboard) 
            Arrays.fill(c,'.');
        backtrack(0,n,cboard);
        return count;
    }
}