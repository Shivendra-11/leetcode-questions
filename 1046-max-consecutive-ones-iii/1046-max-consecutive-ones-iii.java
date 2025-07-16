class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0;
        int j=0;
        int n=nums.length;
        int res=0;
        int count=k;
        //  case F->T
        while(j<n){
            int ch=nums[j];
            if(ch==0){
                count--;
            }
            while(j<n && count<0){
                if(nums[i]==0){
                    count++;
                }
                i++;
            }
            res=Math.max(res,j-i+1);
            j++;

        }
        return res;
    }
}