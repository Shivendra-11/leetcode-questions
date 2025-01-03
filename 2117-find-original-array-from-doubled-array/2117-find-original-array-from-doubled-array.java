class Solution {
    public int[] findOriginalArray(int[] changed) {
        int n = changed.length;

        
        if (n % 2 != 0) {
            return  new int[0];
        }

       
        Arrays.sort(changed);

        
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : changed) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        int nums[]=new int[n/2];

       
        int p=0;
        for (int num : changed) {
            int twice = 2 * num;

            if (freqMap.get(num) == 0) continue;

            
            if (!freqMap.containsKey(twice) || freqMap.get(twice) == 0) {
                return new int[0];
            }
            if(p<nums.length){
            nums[p++]=num;
            }
            freqMap.put(num, freqMap.get(num) - 1);
            freqMap.put(twice, freqMap.get(twice) - 1);
        }

         return nums;
    }
}