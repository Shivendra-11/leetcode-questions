class Solution {
    public static long findc(int nums[],int cost[],long mid){
        long res=0;
        for(int i=0;i<nums.length;i++){
            res+=Math.abs(mid-nums[i])*cost[i];
        }
        return res;
    }
    public long minCost(int[] nums, int[] cost) {
        long min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        long max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
         
        long l=min;
        long h=max;
        long res=Integer.MIN_VALUE;
        while(l<=h){
            long mid=l+(h-l)/2;
            long c1=findc(nums,cost,mid);
            long c2=findc(nums,cost,mid+1);
            res=Math.min(c1,c2);
            if(c1>c2){
                l=mid+1;
            }else{
                h=mid-1;
            }

        }
        return res==Integer.MIN_VALUE?0:res;
    }
}