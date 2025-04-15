class Solution {
    public int lengthOfLIS(int[] nums) {
        int maxlen=1;
        int t[]=new int[nums.length];
        Arrays.fill(t,1);
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    t[i]=Math.max(t[i],t[j]+1);
                    maxlen=Math.max(maxlen,t[i]);
                }
            }
        }
        return maxlen;
    }
}