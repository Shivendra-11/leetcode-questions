class Solution {
    public int[][] generateMatrix(int n) {
        int p=n*n;
       int arr[][]=new int[n][n];
        int toprow=0;
        int bottomrow=n-1;
        int rightcol=n-1;
        int leftcol=0;
        int ele=1;

while(ele<=p){

    // for toprow
    for(int i=leftcol;i<=rightcol && ele<=p ;i++){
        arr[toprow][i]=ele++;
        
    }
    toprow++;

    for(int j=toprow;j<=bottomrow && ele<=p;j++){
        arr[j][rightcol]=ele++;
        
    }
    rightcol--;

    for(int i=rightcol;i>=leftcol && ele<=p;i--){
    arr[bottomrow][i]=ele++;
        
    }
    bottomrow--;
    for(int j=bottomrow;j>=toprow && ele<=p; j--){
    arr[j][leftcol]=ele++;
    
    }
    leftcol++;
}
return arr;

    }
}