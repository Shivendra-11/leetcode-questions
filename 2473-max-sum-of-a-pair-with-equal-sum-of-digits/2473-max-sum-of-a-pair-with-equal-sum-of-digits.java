import java.util.*;

class Solution {
    public static int sumd(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public int maximumSum(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxSum = -1;

        for (int num : nums) {
            int digitSum = sumd(num);
            if (map.containsKey(digitSum)) {
                maxSum = Math.max(maxSum, map.get(digitSum) + num);
                map.put(digitSum, Math.max(map.get(digitSum), num)); 
            } else {
                map.put(digitSum, num);
            }
        }
        return maxSum;
    }
}
