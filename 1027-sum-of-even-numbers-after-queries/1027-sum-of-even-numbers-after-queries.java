class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int res[]=new int[queries.length];
        int r=queries.length;
        int sume=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0)
            sume+=nums[i];
        }

        for(int i=0;i<r;i++){
            int val=queries[i][0];
            int idx=queries[i][1];

            if(nums[idx]%2==0){
                sume-=nums[idx];
            }
            nums[idx]+=val;
            if(nums[idx]%2==0){
                sume+=nums[idx];
            }
            res[i]=sume;
        }
        return res;
        
    }
}