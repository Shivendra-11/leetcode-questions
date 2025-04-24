class Solution {
    // lower bound
    public static int binary(int target,ArrayList<Integer>li){
        int l=0;
        int h=li.size()-1;
        int res=li.size();
        while(l<=h){
            int mid=l+(h-l)/2;
            if(li.get(mid)<target){
                l=mid+1;
            }else{
                res=mid;
                h=mid-1;
            }
        }
        return res;
    }

    public int lengthOfLIS(int[] nums) {

        ArrayList<Integer>li=new ArrayList<>();
        
        for(int i=0;i<nums.length;i++){
              
              int idx=binary(nums[i],li);
              if(idx==li.size()){
                li.add(nums[i]);
              }else{
                li.set(idx,nums[i]);
              }

        }
        return li.size();
    }
}