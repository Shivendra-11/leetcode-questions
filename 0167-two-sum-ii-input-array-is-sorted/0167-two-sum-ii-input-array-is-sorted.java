class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0, j = numbers.length - 1;

        while (i < j) {
            int sum = numbers[i] + numbers[j];
            if (sum == target) {
                return new int[] {i + 1, j + 1}; // 1-based index
            } else if (sum < target) {
                i++; // Move left pointer right
            } else {
                j--; // Move right pointer left
            }
        }
        
        return new int[] {}; // return empty array if no solution
    }
}
