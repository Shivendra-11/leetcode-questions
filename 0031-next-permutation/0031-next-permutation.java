class Solution {
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int start) {
        int end = nums.length - 1;
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    public void nextPermutation(int[] nums) {

        int gola_idx = -1;
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i-1] < nums[i]) {
                gola_idx = i - 1;
                break;
            }
        }
        int swap_idx = 0;
        if (gola_idx!= -1) {
            for (int j = nums.length - 1; j >gola_idx ; j--) {
                if (nums[j] > nums[gola_idx]) {
                    swap_idx = j;
                    break;
                }
            }
            swap(nums, gola_idx, swap_idx);
        }
        reverse(nums, gola_idx + 1);

    }
}