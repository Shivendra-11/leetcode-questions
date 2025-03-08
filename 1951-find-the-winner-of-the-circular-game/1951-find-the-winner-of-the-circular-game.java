class Solution {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer>li=new ArrayList<>();
        for(int i=1;i<=n;i++){
            li.add(i);
        }
        int i=0;
        while(li.size()>1){
            int idx=(i+k-1)%li.size();
            li.remove(idx);
            i=idx;

        }
return li.get(0);
    }
}