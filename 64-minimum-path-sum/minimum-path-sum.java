class Solution {
    public int ans(int[][] grid,int[][] dp,int i,int j,int r,int c){
          if (dp[i][j] != -1) {
            return dp[i][j];
        }
        if(i==r-1 && j==c-1) return dp[i][j]=grid[i][j];

        else if(i==r-1) return dp[i][j]=grid[i][j]+ ans(grid,dp,i,j+1,r,c);
        else if(j==c-1) return dp[i][j]=grid[i][j]+ans(grid,dp,i+1,j,r,c);
        else{
            return dp[i][j]=grid[i][j]+ Math.min(ans(grid,dp,i+1,j,r,c),ans(grid,dp,i,j+1,r,c));
        }

    }

    public int minPathSum(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int [][] dp=new int[r][c];

        for(int[] row:dp){
            Arrays.fill(row,-1);
        }

        return ans(grid,dp,0,0,r,c);
    }
}