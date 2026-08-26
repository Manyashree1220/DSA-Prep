class kv{
    int val;
    int index;
    kv(int v,int i)
    {
        this.val=v;
        this.index=i;
    }
}
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        // Deque<Integer> dq=new ArrayDeque<>();
        // int[] ans=new int[nums.length-k+1];
        // int index=0;
        // for(int i=0;i<nums.length;i++)
        // {
        //     while(!dq.isEmpty() && dq.peekFirst()<=i-k)
        //     {
        //         dq.pollFirst();
        //     }
        //     while(!dq.isEmpty() && nums[dq.peekLast()]<nums[i])
        //     {
        //         dq.pollLast();
        //     }
        //     dq.offerLast(i);
        //     if(i>=k-1)
        //     {
        //         ans[index++]=nums[dq.peekFirst()];
        //     }
        // }
        // return ans;
         PriorityQueue<kv> pq =
            new PriorityQueue<>((a, b) -> b.val - a.val);

        int[] ans = new int[nums.length - k + 1];

        for(int i = 0; i < nums.length; i++) {

            pq.offer(new kv(nums[i], i));

            while(!pq.isEmpty() && pq.peek().index < i - k + 1) {
                pq.poll();
            }

            if(i >= k - 1) {
                ans[i - k + 1] = pq.peek().val;
            }
        }
        return ans;
    }
}