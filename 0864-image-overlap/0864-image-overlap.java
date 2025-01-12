class Solution {
    public static int countm(int[][]a,int[][]b,int p,int q){
        int r1=a.length;
        int c1=a[0].length;
        int count=0;
        for(int i=0;i<r1;i++){
            for(int j=0;j<r1;j++){
                 if((i+p)<0 || (j+q)<0 || (i+p)>=r1 || (j+q)>=r1 )  continue;
                if(a[i][j]==1 && b[i+p][j+q]==1 ){
                    count++;
                }
            }
        }
         return count;
    }
    public int largestOverlap(int[][] img1, int[][] img2) {
        int n=img1.length;
        int maxi=0;
        for(int i=-n+1;i<n;i++){
            for(int j=-n+1;j<n;j++){
                 maxi=Math.max(maxi,countm(img1,img2,i,j));
            }   
            
        }
        return maxi;
    }
}