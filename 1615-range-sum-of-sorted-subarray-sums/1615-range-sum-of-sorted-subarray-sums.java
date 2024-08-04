import java.util.Arrays;

class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        
        int[] arr = new int[n * (n + 1) / 2];
        
        int p = 0;
      
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                arr[p] = sum;
                p++;
            }
        }

        Arrays.sort(arr);

       
        int sum_res = 0;
        for (int k = left - 1; k < right; k++) {
            sum_res += arr[k];
            sum_res %= 1_000_000_007;  // Apply modulus operation here to avoid overflow
        }

        return sum_res;
    }
}
