class Solution {
    public int maxProfit(int[] nums) {
        int mini = nums[0];
        int maxi = 0;
        for (int i = 1; i < nums.length; i++) {

            int profit = nums[i] - mini;
            maxi = Math.max(profit, maxi);
            mini = Math.min(nums[i], mini);

        }
        return maxi;
    }
}