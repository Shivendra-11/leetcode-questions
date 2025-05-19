class Solution {
    public String triangleType(int[] nums) {
        Arrays.sort(nums);
        StringBuilder str=new StringBuilder();
        if(nums[0]+nums[1]<=nums[2]){
            return "none";
        }
      
        int c=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                 c++;
            }
        }
        if(c==2){
            str.append("equilateral");
            return str.toString();
        }
        int p=0;

        for(int i=0;i<nums.length-1;i++){
              if(nums[i]==nums[i+1]){
                p++;
              }
        }
        if(p==1){
           str.append("isosceles");
            return str.toString(); 
        }
        
        if(nums[0]+nums[1]>nums[2]){
            str.append("scalene");
            return str.toString(); 
        }
      
        return "none";
    }
}