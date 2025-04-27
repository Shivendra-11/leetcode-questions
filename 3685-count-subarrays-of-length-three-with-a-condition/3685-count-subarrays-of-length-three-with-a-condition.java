class Solution {
    public int countSubarrays(int[] nums) {
        int c = 0;
        for (int i = 0; i <= nums.length - 3; i++) {
            int num1 = nums[i];
            int num2 = nums[i + 1];
            int num3 = nums[i + 2];
            if (num2 == 2*(num1 + num3)) {
                c++;
            }
        }

        return c;
    }
}