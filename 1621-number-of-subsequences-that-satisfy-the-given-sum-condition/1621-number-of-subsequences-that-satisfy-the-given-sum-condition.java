

class Solution {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int i = 0, j = nums.length - 1;
        int count = 0;
        int M = 1_000_000_007;
        
        while (i <= j) {
            if (nums[i] + nums[j] <= target) {
                int n = j - i;
                count = (count + fastPower(2, n, M)) % M;
                i++;
            } else {
                j--;
            }
        }
        return count;
    }
    
    private int fastPower(int base, int exp, int mod) {
        int result = 1;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = (int)((1L * result * base) % mod);
            }
            base = (int)((1L * base * base) % mod);
            exp >>= 1;
        }
        return result;
    }
}
