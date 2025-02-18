class Solution {
    private static long getSumElements(long count, long val) {
        return val * count - (count * (count + 1)) / 2;
    }

    public int maxValue(int n, int index, int maxSum) {
        long left = 1, right = maxSum;
        long result = 0;

        while (left <= right) {
            long mid = left + (right - left) / 2;

            long leftCount = Math.min(index, mid - 1);
            long leftSum = getSumElements(leftCount, mid);
            leftSum += Math.max(0, index - (mid - 1));

            long rightCount = Math.min(n - index - 1, mid - 1);
            long rightSum = getSumElements(rightCount, mid);
            rightSum += Math.max(0, n - index - 1 - (mid - 1));

            long total = leftSum + rightSum + mid;

            if (total <= maxSum) {
                result = Math.max(result, mid);
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return (int) result;
    }
}
