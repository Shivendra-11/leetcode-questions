class Solution {
    public int maxDifference(String s) {
        char[] arr = s.toCharArray();
        HashMap<Character, Integer> mp = new HashMap<>();

         for (char c : arr) {
            mp.put(c, mp.getOrDefault(c, 0) + 1);
        }

        int oddc = Integer.MIN_VALUE;
        int evenc = Integer.MAX_VALUE;

        for (int num : mp.values()) {
            if (num % 2!= 0) {
            oddc=Math.max(oddc,num);
            }else{
            evenc=Math.min(evenc,num);
            }
        }      
        if( oddc == Integer.MIN_VALUE || evenc == Integer.MAX_VALUE){
            return 0;
        }
        return oddc-evenc;
    }
}