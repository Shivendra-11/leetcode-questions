import java.util.Arrays;

class Solution {
    public int[] maximumBeauty(int[][] items, int[] queries) {
        int n = items.length;
        int[] out = new int[queries.length];

        Arrays.sort(items, (a, b) -> Integer.compare(a[0], b[0]));


        int[] arr = new int[n];
        arr[0] = items[0][1];
        for (int i = 1; i < n; i++) {
            arr[i] = Math.max(arr[i - 1], items[i][1]);
        }

        for (int i = 0; i < queries.length; i++) {
            int l = 0, h = n - 1, bestIndex = -1;

            while (l <= h) {
                int mid = l + (h - l) / 2;
                if (items[mid][0] <= queries[i]) {
                    bestIndex = mid; 
                    l = mid + 1;     
                } else {
                    h = mid - 1;
                }
            }

            
            out[i] = (bestIndex == -1) ? 0 : arr[bestIndex];
        }

        return out;
    }
}
