class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int res[]=new int[nums.length];
        int pre[]=new int[nums.length];
        // pre[0]=nums[0];
        for(int i=0;i<nums.length;i++){
            pre[i]=nums[i];
        }
        for(int i=1;i<nums.length;i++){
            pre[i]=pre[i]+pre[i-1];
        }
        for(int i=0;i<nums.length;i++){
        res[i]=(nums[i]*i-(pre[i]-nums[i]))+pre[nums.length-1]-pre[i]-(nums[i]*(nums.length-i-1));
           
        }
        return res;
    }
}