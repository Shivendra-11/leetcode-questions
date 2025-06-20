class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length/2;
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }

       for(int key : mp.keySet()){
        if(mp.get(key)>n){
            return key;
        }
       }
       return 0;
    }
}