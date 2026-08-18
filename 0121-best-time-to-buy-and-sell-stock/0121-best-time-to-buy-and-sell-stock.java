class Solution {
    public int maxProfit(int[] prices) {
        // int maxprofit=0;
        // int p=prices[0];
        
        // for(int i=1;i<prices.length;i++)
        // {
        //     if(prices[i]<p)
        //         p=prices[i];
        //     int profit=prices[i]-p;
        //     if(maxprofit<profit)
        //         maxprofit=profit;
        // }
        // return maxprofit;

        int min=prices[0];
        int maxProfit=0;
        for(int i=1;i<prices.length;i++)
        {
            int cost=prices[i]-min;
            maxProfit=Math.max(maxProfit,cost);
            min=Math.min(min,prices[i]);
        }
        return maxProfit;
    }
}