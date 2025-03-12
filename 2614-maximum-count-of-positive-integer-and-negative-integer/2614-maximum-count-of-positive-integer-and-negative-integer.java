class Solution {
    public int maximumCount(int[] nums) {
        int neg = findFirstPositive(nums); 
        int pos = nums.length - findFirstNonNegative(nums); 
        return Math.max(neg, pos);
    }

    private int findFirstPositive(int[] nums) {
        int l = 0, h = nums.length - 1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (nums[mid] < 0) {
                l = mid + 1; 
            } else {
                h = mid - 1; 
            }
        }
        return l; 
    }

    private int findFirstNonNegative(int[] nums) {
        int l = 0, h = nums.length - 1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (nums[mid] <= 0) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return l; 
    }
}
