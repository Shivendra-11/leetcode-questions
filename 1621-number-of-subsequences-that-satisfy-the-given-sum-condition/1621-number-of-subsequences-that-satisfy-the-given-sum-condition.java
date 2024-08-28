class Solution {
    public int numSubseq(int[] nums, int target) {

         int M = 1_000_000_007;
        Arrays.sort(nums);
        int l = 0;
        int r = nums.length - 1;
        int result = 0;

        int[] powerOfTwo = new int[nums.length];
        powerOfTwo[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            powerOfTwo[i] = (powerOfTwo[i - 1] * 2) % M;
        }

        while (l <= r) {
            if (nums[l] + nums[r] <= target) {
                result = (result + powerOfTwo[r - l]) % M;
                l++;
            } else {
                r--;
            }
        }

        return result;
        
    }
}