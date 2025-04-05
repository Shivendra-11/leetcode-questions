class Solution {
   int total=0;
   public  void find(int nums[],int i,int curxor ){
    if(i==nums.length){
        total+=curxor;
        return;
    }
    
    find(nums,i+1,curxor^nums[i]);

    find(nums,i+1,curxor);

   }
    public int subsetXORSum(int[] nums) {

find(nums,0,0);
return total;
    }
}