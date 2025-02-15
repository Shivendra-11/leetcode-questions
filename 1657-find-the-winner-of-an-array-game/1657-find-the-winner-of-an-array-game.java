class Solution {
    public int getWinner(int[] arr, int k) {
        int maxi=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxi){
                maxi=arr[i];
            }
        }
        if(k>=arr.length) return maxi;
int win=arr[0];
int streak=0;
        for(int i=1;i<arr.length;i++){
           
     if(win>arr[i]){
        streak++;
     }else{
        win=arr[i];
        streak=1;
     }
     if(streak==k || win==maxi) return win;
        }
        return 0;
    }
}