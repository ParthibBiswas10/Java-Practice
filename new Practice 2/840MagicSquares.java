class Solution {
    public boolean isMagic(int[][]grid, int r, int c){
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(grid[r+i][c+j]<1||grid[r+i][c+j]>9||set.contains(grid[r+i][c+j])){
                    return false;
                }
                set.add(grid[r+i][c+j]);
            }
        }
        int sum=grid[r][c]+grid[r][c+1]+grid[r][c+2];
        for(int i=0;i<3;i++){
            if(grid[r+i][c]+grid[r+i][c+1]+grid[r+i][c+2]!=sum) return false; //row
            if(grid[r][c+i]+grid[r+1][c+i]+grid[r+2][c+i]!=sum) return false; //column
        }
        for(int i=0;i<3;i++){
        if((grid[r][c]+grid[r+1][c+1]+grid[r+2][c+2])!=sum) return false; //diagonal
        if((grid[r][c+2]+grid[r+1][c+1]+grid[r+2][c])!=sum) return false; //antidiag
        
        }
        return true;
    }
    public int numMagicSquaresInside(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int count=0;
        for(int i=0;i<=r-3;i++){
            for(int j=0;j<=c-3;j++){
                if(isMagic(grid,i,j)){
                    count++;
                }
            }
        }
        return count;
    }
}
