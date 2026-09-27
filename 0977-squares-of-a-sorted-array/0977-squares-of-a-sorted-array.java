class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int t[]=new int[n];
        int left=0;
        int right=n-1;
        int pos=n-1;
        while(left<=right)
        {
            int l=nums[left]*nums[left];
            int r=nums[right]*nums[right];

            if(l>r)
                {
                    t[pos]=l;
                    left++;
                }
                else
                {
                    t[pos]=r;
                    right--;
                }
                pos--;
        }
        return t;
    }
}