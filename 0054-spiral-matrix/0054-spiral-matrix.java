class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> li=new ArrayList<>();
    int r=matrix.length;
        int c=matrix[0].length;
        int n=matrix.length;
        int toprow=0;
        int bottomrow=r-1;
        int rightcol=c-1;
        int leftcol=0;
    
        int ele=0;

while(ele<r*c){

    // for toprow
    for(int i=leftcol;i<=rightcol&& ele<r*c ;i++){
        li.add(matrix[toprow][i]);
        ele++;
    }
    toprow++;

    for(int j=toprow;j<=bottomrow && ele<r*c  ;j++){
        li.add(matrix[j][rightcol]);
        ele++;
    }
    rightcol--;

    for(int i=rightcol;i>=leftcol && ele<r*c;i--){
        li.add(matrix[bottomrow][i]);
        ele++;
    }
    bottomrow--;
    for(int j=bottomrow;j>=toprow && ele<r*c ;j--){
    li.add(matrix[j][leftcol]);
      ele++;
    }
    leftcol++;

}
return li;
    }
}