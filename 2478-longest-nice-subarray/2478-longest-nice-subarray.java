class Solution {
    public int longestNiceSubarray(int[] nums) {
        
// first step is to compare the first and second element and then after we have to use or operation so that next element transfer all its 1 bit wich make the easy to comapre withi the next element..[3,8,48] ... in this first we perform the and operation and then after we use use or so that i can transfer all the 8 1 bit to the previous mask valyue and then check with the next element by doing and operation..
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int mask=0;
            for(int j=i;j<nums.length;j++){
                 if((mask & nums[j])!=0){
                    break;
                 }
                mask |=nums[j];
                maxi=Math.max(maxi,j-i+1);
            }
        }
        return maxi;
    }
}