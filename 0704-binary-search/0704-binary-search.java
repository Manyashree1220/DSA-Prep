class Solution {
    public int search(int[] nums, int target) {
        // int s=0;
        // int e=nums.length-1;
        // int mid=0;
        // while(s<=e)
        // {
        //     mid=(s+e)/2;
        //     if(nums[mid]==target)
        //         return mid;
        //     else if(nums[mid]>target)
        //         e=mid-1;
        //     else if(nums[mid]<target)
        //         s=mid+1;
        // }
        // return -1;

        return binary(nums,target,0,nums.length-1);

    }
    int binary(int[] nums,int target, int low, int high)
    {
        if(low>high)
            return -1;
        
        int mid=low+(high-low)/2;

        if(nums[mid]==target)
            return mid;
        
        if(nums[mid]>target)
            return binary(nums,target,low,mid-1);

        return binary(nums,target,mid+1,high);
    }
}