class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1)
        {
            return nums[0];
        }
        int s1=fun(nums,0,n-2);
        int s2=fun(nums,1,n-1);
        return Math.max(s1,s2);
    }
    int fun(int[] nums,int s, int e)
    {
        int n=e-s+1;
        if(n==1)
            return nums[s];
        int dp[]=new int[n];
        dp[0]=nums[s];
        dp[1]=Math.max(nums[s],nums[s+1]);

        for(int i=2;i<n;i++)
        {
            dp[i]=Math.max(dp[i-1],nums[s+i]+dp[i-2]);
        }
        return dp[n-1];
    }
}