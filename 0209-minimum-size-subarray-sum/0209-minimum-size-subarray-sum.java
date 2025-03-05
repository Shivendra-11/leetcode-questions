class Solution {
    public int minSubArrayLen(int k, int[] nums) {
        int first=0;
        int second=0;
        // int total=0;
        int maxlen=Integer.MAX_VALUE;
        int sum=0;

        while(second<nums.length){
            sum +=nums[second];

             while(sum>=k && first<=second ){
                 maxlen=Math.min(maxlen,second-first+1);

                sum -=nums[first];
                first++;

             }
           second++;
        }
         return maxlen == Integer.MAX_VALUE ? 0 : maxlen;
    }
}