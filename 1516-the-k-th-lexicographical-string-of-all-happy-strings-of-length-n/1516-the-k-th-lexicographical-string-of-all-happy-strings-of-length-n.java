class Solution {
    public static void gen(ArrayList<String>li,String str,StringBuilder temp,int n,int idx){
        if(idx>=n){
            li.add(temp.toString());
            return;
        }

        for(int i=0;i<str.length();i++){
            if(temp.length()!=0 && temp.charAt(temp.length()-1)==str.charAt(i)){
                continue;
            }
            temp.append(str.charAt(i));
            gen(li,str,temp,n,idx+1);
            temp.deleteCharAt(temp.length()-1);
        }
    }
    public String getHappyString(int n, int k) {
       ArrayList<String>li=new ArrayList<>(); 
       String str="abc";
       StringBuilder temp=new StringBuilder();
       gen(li,str,temp,n,0);
       Collections.sort(li);
       if(li.size()<k){
        return "";
       }
       return li.get(k-1);
    }
}