class Solution {
    private static int res;
    // private static int maxi;

    public static void find(int arr[], int[] child, int k, int idx) {
        if (idx >= arr.length) {
           int maxi=0;
           for(int i=0;i<child.length;i++){
            if(maxi<child[i]){
                maxi=child[i];
            }
           }
            res = Math.min(res, maxi);
            return;
        }
        for (int i = 0; i < k; i++) {
            child[i] += arr[idx];
            find(arr, child, k, idx + 1);
            child[i] -= arr[idx];
        }
    }

    public int distributeCookies(int[] cookies, int k) {
        res = Integer.MAX_VALUE;
       
        int child[] = new int[k];
        find(cookies, child, k, 0);
        return res;
    }
}