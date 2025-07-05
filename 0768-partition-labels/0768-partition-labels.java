class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character,Integer>mp=new HashMap<>();
        ArrayList<Integer>li=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            mp.put(s.charAt(i),i);
        }

        int i=0;
        int prev=-1;
        int j=mp.get(s.charAt(i));
        int n =s.length();

        while(i<n ){
            j=Math.max(j,mp.get(s.charAt(i)));
             if(i==j){
                li.add(j-prev);
                prev=j;
            }
            i++;

            


        }
return li;
    }
}