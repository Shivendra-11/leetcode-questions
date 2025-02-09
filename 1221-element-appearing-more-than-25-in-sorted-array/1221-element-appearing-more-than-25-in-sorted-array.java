class Solution {
    public int findSpecialInteger(int[] nums) {
         HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        int n=nums.length;
        for(Map.Entry<Integer, Integer> entry : mp.entrySet()){
           int value = entry.getValue();
            if(value>n/4){
                int key=entry.getKey();
                return key;
            }
        }
        return -1;
    }
}