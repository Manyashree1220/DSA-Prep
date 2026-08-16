class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int dp[][]=new int[m][n];
        for(int row[]:dp)
            Arrays.fill(row,-1);
        return bt(0,0,m,n,dp,obstacleGrid);
    }
    int bt(int row, int col,int m,int n,int[][] dp,int[][] obstacleGrid)
    {
        
        if(row>=m || col>=n)
            return 0;
        if(obstacleGrid[row][col]==1)
            return 0;

            if(row==m-1 && col==n-1)
            return 1;

        
        
        if(dp[row][col]!=-1)
            return dp[row][col];

        return dp[row][col]=bt(row+1,col,m,n,dp,obstacleGrid)+bt(row,col+1,m,n,dp,obstacleGrid);
    }
}