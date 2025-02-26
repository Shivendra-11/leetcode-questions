class Solution {
    public int maxAbsoluteSum(int[] nums) {
        // kadanes algorithm for poostitve
        int sum1 = 0;
        int maxi = Integer.MIN_VALUE;
        int maxi2 = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            maxi = Math.max(maxi, sum1 += nums[i]);
            if (sum1 < 0) {
                sum1 = 0;
            }
        }
        int sum2 = 0;
        for (int i = 0; i < nums.length; i++) {
            maxi2 = Math.min(maxi2, sum2 += nums[i]);
            if (sum2 > 0) {
                sum2 = 0;
            }
        }

        return maxi > Math.abs(maxi2) ? maxi : Math.abs(maxi2);
    }

}