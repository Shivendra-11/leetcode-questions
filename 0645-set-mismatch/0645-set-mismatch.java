class Solution {
    public int[] findErrorNums(int[] nums) {
    
        int n=nums.length;
        int temp[]=new int[2];
       Arrays.sort(nums);
       int sum=0;
       for(int i=0;i<nums.length;i++){
        sum+=nums[i];
       }
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
               temp[0]=nums[i];
            }
            
        }
        temp[1]=(n*(n+1)/2)-sum+temp[0];
        return temp;
    }
}