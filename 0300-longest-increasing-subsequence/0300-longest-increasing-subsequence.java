class Solution {
    public int lengthOfLIS(int[] nums) {
        int maxlen=0;
        int t[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    t[i]=Math.max(t[i],t[j]+1);
                    maxlen=Math.max(maxlen,t[i]);
                }
            }
        }
        return maxlen+1;
    }
}