class Solution {
    public static List<String> converted(char[][] board) {
        List<String> result = new ArrayList<>();
        for (char[] row : board) {
            result.add(new String(row));
        }
        return result;
    }
   public static  boolean safe(int i,int j,char[][]board){  
    // left side ka 
    int row=i;
    int col=j;
    while(row>=0&&col>=0){
          if(board[row][col]=='Q'){
            return false;
          }
          row--;
          col--;
    }
    // right side ka 
     row=i;
     col=j;
    while(row>=0&&col<board.length){
        if(board[row][col]=='Q'){
            return false;
        }
        row--;
        col++;
    }
    return true ;

   } 
    public static void find(int row,int n,List<List<String>>ans,char[][] board,boolean col[]){
        // base condition 
        if(row==n){
            ans.add(converted(board));
        }
        for(int j=0;j<n;j++){
            if(!col[j]&&safe(row,j,board)){
                col[j]=true;
                board[row][j]='Q';
                find(row+1,n,ans,board,col);
                  col[j]=false;
                board[row][j]='.';
              
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans=new ArrayList<>();
        char[][]board=new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.');
        }
    boolean col[]=new boolean[n];
    find(0,n,ans,board,col);
    return ans;
    }
}