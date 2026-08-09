class Solution {
    public int search(int[] nums, int target) {
        // int left = 0, right = nums.length - 1;

        // while(left <= right) {
        //     int mid = left + (right - left) / 2;

        //     // ✅ found
        //     if(nums[mid] == target)
        //         return mid;

        //     // ✅ left half sorted
        //     if(nums[left] <= nums[mid]) {
        //         if(nums[left] <= target && target < nums[mid]) {
        //             right = mid - 1;
        //         } else {
        //             left = mid + 1;
        //         }
        //     }
        //     // ✅ right half sorted
        //     else {
        //         if(nums[mid] < target && target <= nums[right]) {
        //             left = mid + 1;
        //         } else {
        //             right = mid - 1;
        //         }
        //     }
        // }

        // return -1;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                return i;
            }
        }
        return -1;
    }
}