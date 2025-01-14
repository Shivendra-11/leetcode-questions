class Solution {
    public static int binarys(int nums[],int target ){
        int l=0;
        int r=nums.length-1;
        int res=-1;
        while(l<=r){
               int mid=l+(r-l)/2;
               if(nums[mid]<=target){
                res=mid;
                l=mid+1;
               }else{
                r=mid-1;
               }   
        }
        return res+1;

    }
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int result[]=new int[queries.length];
        int sum=0;
        for(int i=1;i<nums.length;i++){
                  nums[i]+=nums[i-1];
        }       
        for(int i=0;i<queries.length;i++){
           int count=binarys(nums,queries[i]);
            
            result[i]=count;
        }
        return result;
    }
}