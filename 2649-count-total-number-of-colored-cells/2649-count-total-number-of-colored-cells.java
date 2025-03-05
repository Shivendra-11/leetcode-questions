class Solution {
    public static long find(int n,int i){
         if(n==1){
            return 1;
         }
         return (4*i)+find(n-1,i+1);
    }
    public long coloredCells(int n) {
        return find(n,1);
    }
}