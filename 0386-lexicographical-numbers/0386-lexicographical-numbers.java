class Solution {
    public List<Integer> lexicalOrder(int n) {

        ArrayList<Integer> li=new ArrayList<>();
        ArrayList<String> ans=new ArrayList<>();

        for(int i=1;i<=n;i++){
            ans.add(String.valueOf(i));
        }
   Collections.sort(ans);
        for(int i=0;i<ans.size();i++){
            li.add(Integer.valueOf(ans.get(i)));
        }
        return li;
    }
}