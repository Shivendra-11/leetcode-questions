class Solution {
    public int[] shortestToChar(String s, char c) {
        ArrayList<Integer>ls=new ArrayList<>();
        char ch[]=s.toCharArray();
        int res[]=new int[ch.length];
       for(int i=0;i<ch.length;i++){
        if(ch[i]==c){
            ls.add(i);
        }

        for(int j=0;j<ch.length;j++){
            int k=0;
            int min=10000;
            while(k<ls.size())
            {
                int smin=Math.abs(j-ls.get(k));
                min=Math.min(smin,min);
                k++;


            }
            res [j]=min;
        }  
    }

        return res;
        
    }
}