class Solution {
    public long countBadPairs(int[] nums) {
      
        HashMap<Integer,Integer> mp=new HashMap<>();
        long result=0;
        mp.put(nums[0],1);
        for(int i=1;i<nums.length;i++){
              int total=i;
              int freq=mp.getOrDefault(nums[i]-i,0);
              int bp=total-freq;
              result+=bp;
              mp.put(nums[i]-i,mp.getOrDefault(nums[i]-i,0)+1);
        }
        return result;
    }
}