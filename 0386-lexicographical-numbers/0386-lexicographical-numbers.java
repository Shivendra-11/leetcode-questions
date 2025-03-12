class Solution {
    public static void gen(List<Integer> li,int n,int curr){
        if(curr>n){
            return;
        }
        li.add(curr);
        for(int i=0;i<=9;i++){
            int newn=(curr*10)+i;
            if(newn>n) {return;}
            gen(li,n,newn);
        }

    }

    public List<Integer> lexicalOrder(int n) {
        ArrayList<Integer> li=new ArrayList<>();
        for(int i=1;i<=9;i++){
         gen(li,n,i);
      }
    return li;
    }
}