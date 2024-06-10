class Solution {
    static void swap(int[] arr, int i, int ci) {
        int temp = arr[i];
        arr[i] = arr[ci];
        arr[ci] = temp;
    }

    public int[] findErrorNums(int[] nums) {
        int[] arr = new int[2];
        int i = 0;

        while (i < nums.length) {
            int ci = nums[i] - 1;
            if (nums[i] != nums[ci]) {
                swap(nums, ci, i);
            } else {
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                arr[0] = nums[j];
                arr[1] = j + 1;
            }
        }

        return arr;
    }
}
