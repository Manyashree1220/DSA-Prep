class Solution {
    public boolean find132pattern(int[] nums) {

        Stack<Integer> stack = new Stack<>();

        int second = Integer.MIN_VALUE;

        for (int i = nums.length - 1; i >= 0; i--) {

            // nums[i] is the possible "1"
            if (nums[i] < second) {
                return true;
            }

            // Find a possible "2"
            while (!stack.isEmpty() && nums[i] > stack.peek()) {
                second = stack.pop();
            }

            // Store possible "3"
            stack.push(nums[i]);
        }

        return false;
    }
}