class Solution {
    public int maxSubArray(int[] nums) {
        // int sum=nums[0];
        // int currentSum=nums[0];
        // for(int i=1;i<nums.length;i++)
        // {
        //     sum=Math.max(nums[i],sum+nums[i]);
        //     currentSum=Math.max(sum,currentSum);
        // }
        // return currentSum;

        int n=nums.length;
        int dp[]=new int[n];
        dp[0]=nums[0];
        int cur=nums[0];
        for(int i=1;i<n;i++)
        {
            dp[i]=Math.max(nums[i],nums[i]+dp[i-1]);
            cur=Math.max(dp[i],cur);
        }
        return cur;
    }
}