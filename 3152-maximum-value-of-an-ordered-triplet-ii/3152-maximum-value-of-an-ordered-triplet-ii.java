class Solution {
    public long maximumTripletValue(int[] nums) {
        int pre[]=new int[nums.length];
        int suf[]=new int[nums.length];
        pre[0]=0;
        for(int i=1;i<nums.length;i++){
            pre[i]=Math.max(pre[i-1],nums[i-1]);

        }
        suf[nums.length-1]=0;
        for(int i=nums.length-2;i>=0;i--){
            suf[i]=Math.max(suf[i+1],nums[i+1]);
        }

     long maxi=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            maxi=Math.max(maxi,(long)(pre[i]-nums[i])*suf[i]);
        }
        return maxi;
    }
}