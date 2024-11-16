class Solution {
    public int maxFrequencyElements(int[] numss) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        int maxi=0;
        int sum=0;
        for(int nums: numss ){
            mp.put(nums,mp.getOrDefault(nums,0)+1);
      maxi=Math.max(maxi,mp.get(nums));


        }

        for(int keys:mp.keySet()){
            if(mp.get(keys)==maxi){
                sum+=mp.get(keys);
            }
        }
        return sum;
    }
}