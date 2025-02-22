import java.util.Arrays;

class Solution {
    public static int finds(int nums[], int x) {
        int l = 0;
        int h = nums.length - 1;
        while (l <= h) { 
            int mid = l + (h - l) / 2;
            if (nums[mid] >= x) {
                h = mid-1;
            } else {
                l = mid + 1;
            }
        }
        return nums.length - l; 
    }

    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i <= nums.length; i++) { 
            int c = finds(nums, i);
            if (c == i) {
                return i;
            }
        }
        return -1;
    }

}
