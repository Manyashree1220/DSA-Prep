class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {

        int n=triangle.size();
        int dp[]=new int[n];
        dp[0]=triangle.get(0).get(0);
        for(int i=1;i<n;i++)
        {
            List<Integer> list=triangle.get(i);
            for(int j=i;j>=0;j--)
            {
                if(j==0)
                {
                    dp[j]=dp[j]+list.get(0);
                }
                else if(j==i)
                {
                    dp[j]=dp[j-1]+list.get(j);
                }
                else
                {
                    dp[j]=Math.min(dp[j-1],dp[j])+list.get(j);
                }
            }
        }
        int ans=dp[0];
        for(int i=1;i<dp.length;i++)
        {
            ans=Math.min(ans,dp[i]);
        }
        return ans;
        
    }
    
}