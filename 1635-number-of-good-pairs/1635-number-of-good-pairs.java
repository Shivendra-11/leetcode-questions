class Solution {
    public int numIdenticalPairs(int[] nums) {
       HashMap<Integer,Integer>mp=new HashMap<>();
       for(int n:nums){
        mp.put(n,mp.getOrDefault(n,0)+1);
       } 
       int c=0;
       for(Map.Entry<Integer,Integer> entry:mp.entrySet()){
        int val=entry.getValue();
        if(val>1){
            c+=val*(val-1)/2;
        }
       }
       return c;
    }
}