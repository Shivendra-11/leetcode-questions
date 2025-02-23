class Solution {
    public static boolean finds(int arr[], int m, int k, int mid) {
        int c = 0;
        int boq = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= mid) {
                c++;
                if (c == k) {
                    c = 0;
                    boq++;
                }
            } else {
                c = 0;
            }
        }
        return boq>=m;
    }

    public int minDays(int[] arr, int m, int k) {
        if (m * k > arr.length) {
            return -1;
        }
        int ans=-1;
        int maxi = -1;
        int mini = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (maxi < arr[i]) {
                maxi = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (mini > arr[i]) {
                mini = arr[i];
            }
        }
        int l = mini;
        int h = maxi;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (finds(arr, m, k, mid)) {
                ans=mid;
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }
}