class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1) return 0;
        int i=0;
        int j=0;
        int n=nums.length;
        int prod=1;
        int res=0;
        while(j<n){
            prod=prod*nums[j];
            while(prod>=k){
                prod=(int)prod/nums[i];
                i++;
            }
            res+=j-i+1;
            j++;  
        }
        return res;
    }
}