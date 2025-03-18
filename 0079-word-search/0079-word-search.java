class Solution {
    public static boolean find(char[][] board, String word, int i, int r, int c) {
        if(i==word.length()) return true;
        if (r < 0 || c < 0 || r >= board.length || c >= board[0].length) {
            return false;
        }
        if (board[r][c] != word.charAt(i)) {
            return false;
        }
        if (board[r][c] == '&') {
            return false;
        }
        char temp = board[r][c];
        board[r][c] = '&';

        if (find(board, word, i + 1, r - 1, c) || find(board, word, i + 1, r + 1, c)
                || find(board, word, i + 1, r, c - 1) || find(board, word, i + 1, r, c + 1)) {
            return true;
        }

         board[r][c]=temp;
        return false;
    }

    public boolean exist(char[][] board, String word) {
      
         for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                     if(find(board, word,0, i, j)){
                       return true;
                     }
                }
            }
         }
         return false;
    }
}