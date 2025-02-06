class Solution {
    public int tupleSameProduct(int[] nums) {
int tuple=0;
        HashMap<Integer,Integer>mp=new HashMap<>();
       for(int i=0;i<nums.length;i++){
        for(int j=i+1;j<nums.length;j++){
            mp.put(nums[i]*nums[j],mp.getOrDefault(nums[i]*nums[j],0)+1);
        }
       }

       for(int num:mp.values()){
        if(num>1){
         tuple+=num*(num-1)/2;
        }
       } 
       return tuple*8;
    }
}