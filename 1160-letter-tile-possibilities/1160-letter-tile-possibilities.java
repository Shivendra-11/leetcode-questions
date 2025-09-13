class Solution {
    public static void gen(HashSet<String>st,StringBuilder temp,String tiles,int boola[]){
            st.add(temp.toString());
        for(int i=0;i<tiles.length();i++){
                if(boola[i]==1) continue;
          char ch=tiles.charAt(i);
            boola[i]=1;
            temp.append(ch);
            gen(st,temp,tiles,boola);
            boola[i]=0;
            temp.deleteCharAt(temp.length()-1);

        }
    }
    public int numTilePossibilities(String tiles) {
        StringBuilder temp=new StringBuilder();
        HashSet<String>st=new HashSet<>();
        int boola[]=new int[tiles.length()];
       

      gen(st,temp,tiles,boola);
        return st.size()-1;
    }
}