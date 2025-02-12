class Solution {
    public List<Integer> partitionLabels(String s) {
        ArrayList<Integer> li=new ArrayList<>();
       HashMap<Character,Integer> mp=new HashMap<>();
         for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
          mp.put(ch, i);
         }
         int maxi=0;
         int prev=-1;
         for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            maxi=Math.max(maxi,mp.get(ch));
            if(maxi==i){
        li.add(maxi-prev);
        prev=maxi;
            }
         }
         return li;
    }
}