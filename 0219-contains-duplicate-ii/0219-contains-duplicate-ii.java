class Solution {
    public static boolean check(HashMap<Integer, Integer> mp) {
        
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();

            if (value > 1) {
                return true;
            }
        }
        return false;
    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(k==0)return false;
        int i = 0;
        int j = 1;
        HashMap<Integer, Integer> mp = new HashMap<>();
        mp.put(nums[0], 1);
        int n = nums.length;
        while (j < n) {
            mp.put(nums[j], mp.getOrDefault(nums[j], 0) + 1);
            if (mp.get(nums[j]) > 1)
                return true;

            if (j - i+1> k) {

                mp.put(nums[i], mp.getOrDefault(nums[i], 0) - 1);
                i++;

            }
            j++;
        }
        return false;
    }
}