class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> result=new ArrayList<>();
        int n=groupSizes.length;
        // List<Integer> li=new ArrayList<>();
        HashMap<Integer,List<Integer>> mp=new HashMap<>();
        for(int i=0;i<n;i++){
         int l=groupSizes[i];
         
       if(!mp.containsKey(l)){
        mp.put(l,new ArrayList<>());
       }
       mp.get(l).add(i);
       if(l==mp.get(l).size()){
        result.add(new ArrayList<>(mp.get(l)));
        mp.get(l).clear();
       }

                  
        }
        return result;

    }
}