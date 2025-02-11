class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
       
      int res = 0;
        if (left.length > 0) {
            Arrays.sort(left);
            res = left[left.length - 1]; 
        }
        for (int i = 0; i < right.length; i++) {
            res = Math.max(res, n - right[i]);
        }
        return res;
    }
}