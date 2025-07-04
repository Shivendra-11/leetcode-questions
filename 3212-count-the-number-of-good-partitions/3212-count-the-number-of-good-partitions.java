class Solution {
    public int numberOfGoodPartitions(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            mp.put(nums[i], i);
        }
        int M=1000000007;
        int i = 0;
        long res = 1;
        int n = nums.length;
        int j = 0;
        
        j = Math.max(j, mp.get(nums[0]));
        
        while (i < n) {
            if (j < i) {
                res = (int)((res * 2L) % M);
                j = i;
            }
            j = Math.max(j, mp.get(nums[i]));
            i++;
        }
        
        return (int) res;
    }
}
