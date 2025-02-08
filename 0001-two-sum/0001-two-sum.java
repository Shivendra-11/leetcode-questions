class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[]=new int[2];
    Map<Integer,Integer> mp=new HashMap<>();

    for(int i=0;i<nums.length;i++){
       int  diff=target-nums[i];
        if(mp.containsKey(diff)){
            ans[1]=i;
            ans[0]=mp.get(diff);
            return ans;

        }else{
            mp.put(nums[i],i);
        }
    }


return ans;

    }
}