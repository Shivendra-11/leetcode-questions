class Solution {
    public static int find(int arr[][],int target) {
        int l = 0;
        int m = arr[0].length;
        int h = arr.length - 1;
        while (l <= h) {
            int mid = (l + h) / 2;
            if (arr[mid][0] == target) {
                return mid;
            } else if (arr[mid][0] < target) {
                if (arr[mid][m - 1] >= target) {
                    return mid;
                } else {
                   l=mid+1;
                }

            } else {
                h = mid - 1;
            }
           
        }
         return  -1;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
    
          if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false; 
        }
        int key=find(matrix, target);
         if(key==-1) return false;
        int prev[]=matrix[key];
        int low=0;
        int high=prev.length-1;
        
        while(low<=high){
            int mid=(low+high)/2;
            if(prev[mid]==target){
                return true;
            }else if(prev[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return false;
    }
}