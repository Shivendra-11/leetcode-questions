class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {

        int minpos = -1;
        int maxpos = -1;
        int culin = -1;
        long ans=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < minK || nums[i] > maxK) {

                culin = i;
            }

                if (nums[i] == maxK) {
                    maxpos = i;

                }
                if (nums[i] == minK) {
                    minpos = i;

                }

                long smaller = Math.min(maxpos, minpos);
                long temp = smaller - culin;

                ans += (temp <= 0) ? 0 : temp;

            
        }
        return ans;

    }
}