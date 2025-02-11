class Solution {
    public int maxArea(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int area=-1;
      while(i<j){
    area=Math.max(area,(j-i)*Math.min(nums[i],nums[j]));
    if(nums[i]<nums[j]){
        i++;
    }else{
        j--;
    }
      }
      return area;
    }
}