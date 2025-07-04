class Solution {
    public int numberOfGoodPartitions(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            mp.put(nums[i], i);
        }
        int M=1000000007;
        
        int i = 0;
        int res = 1;
        int n = nums.length;
        int j = 0;
        
        while (i < n) {
            j = Math.max(j, mp.get(nums[i]));
            
            if (i == j && i != n - 1) {
                res =(int) ((res * 2L) % M);
            }
            
            i++;
        }
        
        return  res;
    }
}
