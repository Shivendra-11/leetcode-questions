class Solution {
    public int subarraySum(int[] nums, int k) {
        int prefix=0;
        
        int total=0;
  
        HashMap<Integer,Integer>mp=new HashMap<>();
           mp.put(0,1);

        for(int i=0;i<nums.length;i++){
            prefix +=nums[i];

           int target=prefix-k;

            if(mp.containsKey(target)){
                total +=mp.get(target);
            } 
            mp.put(prefix, mp.getOrDefault(prefix, 0) + 1);
        }
        return total;
    }
}