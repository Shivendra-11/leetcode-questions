class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!mp.containsKey(i-j)){
                    mp.put(i-j,matrix[i][j]);
                } 
              else if(mp.get(i-j)!=matrix[i][j]) {
                    return false;
                    }
            }
        }
return true;
    }
}