class Solution {
    public boolean divideArray(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        int c=0;
        for(Integer key:mp.keySet()){
            int k=mp.get(key);
            if(k%2!=0){
                return false;
            }
        }
     return true;
    }
}