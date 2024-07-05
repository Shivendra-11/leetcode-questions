class Solution {
    public int maxSubarrayLength(int[] nums, int k) {

        HashMap<Integer,Integer> mp=new HashMap<>();
        int l=0;
        int r=0;
        int len=Integer.MIN_VALUE;
       
       

       while(r<nums.length){
          mp.put(nums[r], mp.getOrDefault(nums[r], 0) + 1);

          while(mp.get(nums[r])>k){
          mp.put(nums[l], mp.get(nums[l]) - 1);
          l++;

          }
          len=Math.max(len,r-l+1);



   r++;
       }
       return len;
        
    }
}