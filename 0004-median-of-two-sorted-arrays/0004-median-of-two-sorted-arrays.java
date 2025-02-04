class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int arr[] = new int[m + n];
        int i = 0;
        int k = 0;
        int j = 0; 
        int idx1=((m+n)/2)-1;
        int idx2=(m+n)/2;
        int ele1=0;
        int ele2=0;
        while (i < n && j < m) {
            if (nums1[i] <= nums2[j]) {
               if(idx1==k){
                    ele1=nums1[i];
               }
                  if(idx2==k){
                    ele2=nums1[i];
                  }
                  i++;
                  k++;
            } else {
                if(idx1==k){
                    ele1=nums2[j];
               }
                  if(idx2==k){
                    ele2=nums2[j];
                  }
                  j++;
                  k++;
            }
        }

        while (i < n) {
             if(idx1==k){
                    ele1=nums1[i];
               }
                  if(idx2==k){
                    ele2=nums1[i];
                  }
                  i++;
                  k++;
        }
        while (j < m) {
             if(idx1==k){
                    ele1=nums2[j];
               }
                  if(idx2==k){
                    ele2=nums2[j];
                  }
                  j++;
                  k++;
        }

        if ((m+n)% 2 == 0){
            return (double) (ele1+ele2)/2.0;        
        }

           return (double) ele2;    
         
    }
}