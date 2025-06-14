class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[]=new int[2];
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],i);
        }
    
    for(int i=0;i<nums.length;i++){
        int key=target-nums[i];
        if(mp.containsKey(key)&&i!=mp.get(key)){
               arr[0]=i;
               arr[1]=mp.get(key);
        }
    }
    return arr;

    }
}