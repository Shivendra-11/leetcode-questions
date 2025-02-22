class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        HashSet<Integer>lo=new HashSet<>();
        HashSet<Integer>wi=new HashSet<>();
        
      List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<matches.length;i++){
            mp.put(matches[i][1],mp.getOrDefault(matches[i][1],0)+1);
        }
        for(int i=0;i<matches.length;i++){
            int ele=matches[i][0];
            if(!mp.containsKey(ele)){
                  wi.add(ele);
            }
        }
        
        ArrayList<Integer> li=new ArrayList<>(wi);
        Collections.sort(li);
        ans.add(li);
        for(int n:mp.keySet()){
              int val=mp.get(n);
              if(val==1){
                lo.add(n);
              }
        }
        ArrayList<Integer> li2=new ArrayList<>(lo);
        Collections.sort(li2);
        ans.add(li2);
        return ans;
    }
}