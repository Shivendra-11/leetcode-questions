class Solution {
    static void swap(int arr[],int ci ,int i){
        int temp=arr[ci];
        arr[ci]=arr[i];
        arr[i]=temp;
    }
    public int findDuplicate(int[] arr) {
        // using cyclic sort
        int i = 0;
        while (i < arr.length) {

            if (arr[i] != i + 1) {
                int ci =arr[i]-1;
                if(arr[ci]!=arr[i]){
                    swap(arr , ci, i);
                }else{
                    return arr[i];
                }

            } else {
                i++;
            }
        }
return -1;
    }
}