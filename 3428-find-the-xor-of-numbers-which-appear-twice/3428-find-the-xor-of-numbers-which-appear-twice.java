class Solution {
    public int duplicateNumbersXOR(int[] nums) {

        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
        }
        int ans = 0;
        for (Integer key : mp.keySet()) {
            if(mp.get(key)==2){
            ans ^=key;
            }
        }
        return ans;
    }
}