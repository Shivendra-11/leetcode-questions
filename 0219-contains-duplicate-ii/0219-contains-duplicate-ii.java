class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int temp = Math.abs(i - j);
                if (temp > k) {
                    break;
                }
                if (temp <= k && nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}