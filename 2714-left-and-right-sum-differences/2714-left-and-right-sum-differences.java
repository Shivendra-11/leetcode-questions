class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] arrl = new int[nums.length]; // Array to store sums from left side
        int[] arrR = new int[nums.length]; // Array to store sums from right side
        int[] ans = new int[nums.length];  // Array to store absolute differences
        
        // Calculate sum from left to right
        arrl[0] = 0;
        int suml = 0;
        for (int i = 1; i < nums.length; i++) {
            suml += nums[i - 1];
            arrl[i] = suml;
        }
        
        // Calculate sum from right to left
        arrR[nums.length - 1] = 0;
        int sumR = 0;
        for (int i = nums.length - 2; i >= 0; i--) {
            sumR += nums[i + 1];
            arrR[i] = sumR;
        }
        
        // Calculate absolute differences
        for (int i = 0; i < nums.length; i++) {
            ans[i] = Math.abs(arrl[i] - arrR[i]);
        }
        
        return ans;
    }
}
