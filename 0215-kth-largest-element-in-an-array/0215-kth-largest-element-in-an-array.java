class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++)
            pq.offer(nums[i]);
        int c=1;
        while(!pq.isEmpty() && c!=k)
        {
            pq.poll();
            c++;
        }
        return pq.peek();
    }
}