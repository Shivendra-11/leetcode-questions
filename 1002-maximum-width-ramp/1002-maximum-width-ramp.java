class Solution {
    public int maxWidthRamp(int[] nums) {

        int maxr[] = new int[nums.length];
        maxr[nums.length - 1] = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            maxr[i] = Math.max(maxr[i + 1], nums[i]);
        }
        int maxi = 0;
        int n = nums.length;
        int i = 0;
        int j = 0;
        while (j < n) {

            if (nums[i] <= maxr[j]) {
                maxi = Math.max(maxi, j - i);
                j++;
            } else {
                i++;
            }
        }
        return maxi;

    }
}