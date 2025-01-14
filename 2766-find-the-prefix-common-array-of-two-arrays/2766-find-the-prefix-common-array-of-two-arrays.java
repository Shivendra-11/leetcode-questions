class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int a []=new int [A.length+1];
        int b[]=new int [B.length+1];
        int res[]=new int[A.length];
        for(int i=0;i<A.length;i++){
            a[A[i]]++;
            b[B[i]]++;
            int c=0;
            for(int j=1;j<=A.length;j++){
                if(a[j]==1 && b[j]==1) c++;
            }
            res[i]=c;
        }
        return res;
    }
}