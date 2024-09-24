class Solution {
    public int shipWithinDays(int[] arr, int m) {


        int s=0;
        int e=0;
        int mid;
        int ans=-1;
       
        
        for(int i=0;i<arr.length;i++){
           if(s<arr[i]){
            s=arr[i];
           }
            e+=arr[i];
        }
        while(s<=e){
             mid=s+(e-s)/2;
            int count=1;
            int page=0;
            for(int i=0;i<arr.length;i++){
            page+=arr[i];
            if(page>mid){
                count++;
                page=arr[i];
            }
                
        }
        if(count<=m){
            ans=mid;
            e=mid-1;
        }else{
            s=mid+1;
        }
            
    }
        return ans;
  
    }
}