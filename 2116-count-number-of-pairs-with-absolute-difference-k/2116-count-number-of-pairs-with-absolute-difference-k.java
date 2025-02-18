class Solution {
    public int countKDifference(int[] nums, int k) {
        HashMap<Integer,Integer> mp=new HashMap<>();
    int c=0;
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
       
        for(int i=0;i<nums.length;i++){
           int key=nums[i]-k;
           if(mp.containsKey(key)){
            c+=mp.get(key);
           } 
        }
        return c;
    }
}