class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n=nums.length;
        int mini=10000000;

        
        Arrays.sort(nums);
        for(int k=0;k<nums.length-2;k++){
            int i=k+1;
            int j=n-1;
            
            while(i<j){
             int sum =nums[i]+nums[j]+nums[k];
            
            if(Math.abs(target-sum)<Math.abs(target-mini)){
                mini=sum;
            }
              
                if(sum<target){
                    i++;
                }
                else{
                    j--;
                }

                
            }
        }
        return mini;
    }
}