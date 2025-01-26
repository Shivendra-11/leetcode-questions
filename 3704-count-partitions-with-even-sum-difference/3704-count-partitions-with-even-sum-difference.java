class Solution {
    public int countPartitions(int[] nums) {
  int pre=0;
  for(int i=0;i<nums.length;i++){
    pre+=nums[i];

  }
  int left=0;
  int c=0;
  for(int i=0;i<nums.length-1;i++){
    left+=nums[i];
    pre-=nums[i];
    if((left-pre)%2==0){
        c++;
    }
  }
        return c;
    }
}