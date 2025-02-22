class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        HashSet<Integer>st=new HashSet<>();
        for(int n:arr){
            mp.put(n,mp.getOrDefault(n,0)+1);
        }
        for(int num:mp.values()){
            
            st.add(num);
        }
        return st.size()==mp.size();

    }
}