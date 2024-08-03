class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        boolean p=true;
        Arrays.sort(target);
        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=target[i]){
             p=false;
           }
        }
       return p; 
    }
}