class Solution {
    public int minSwaps(int[] nums) {
        int i=0;
        int j=0;
        int n=nums.length+nums.length;
        int []arr=new int[nums.length+nums.length];
        for(int p=0;p<nums.length+nums.length;p++){
             arr[p]=nums[p%nums.length];
        }
        int ones=0;
        for(int q=0;q<nums.length;q++){
            if(nums[q]==1){
                ones++;
            }
        }
       int countc=0;
       int res=1000000000;
        while(j<n){
              if(arr[j]==1){
                countc++;
              }
              if(j-i+1>ones){
                  countc-=arr[i];
                  i++;
              }
              res=Math.min(res,ones-countc);
              j++;

        }
        return res;
    }

}