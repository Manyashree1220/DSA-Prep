class Solution {
    public int paintWalls(int[] cost, int[] time) {
        
        int m=time.length;
        int n=cost.length;
        int dp[][]=new int[m+1][n+1];

        Arrays.fill(dp[0],Integer.MAX_VALUE/2);
        dp[0][0]=0;
        for(int i=0;i<=m;i++)
        {
            dp[i][0]=0;
        }
        for(int i=1;i<=m;i++)
        {
            for(int j=1;j<=n;j++)
            {
                int cover=time[i-1]+1;
                int rem=Math.max(0,j-cover);
                int take=cost[i-1]+dp[i-1][rem];
                int not=dp[i-1][j];
                dp[i][j]=Math.min(take,not);
            }
        }
        return dp[m][n];
    }
}