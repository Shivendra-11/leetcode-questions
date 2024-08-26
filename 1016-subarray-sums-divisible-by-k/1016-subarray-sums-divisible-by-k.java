class Solution {
    public int subarraysDivByK(int[] nums, int k) {

          HashMap<Integer, Integer> prefix = new HashMap<>();

        int sum = 0;
        int count = 0;
    prefix.put(0,1);
        for (int num : nums) {
            sum += num;
            int rem = sum % k;


            if(rem<0){
                rem=rem+k;
            }

            if(prefix.containsKey(rem)){
                count +=prefix.get(rem);
                prefix .put(rem,prefix.get(rem)+1);
            }
            else{
                prefix.put(rem,1);
            }
        }

        return count;

    }
}