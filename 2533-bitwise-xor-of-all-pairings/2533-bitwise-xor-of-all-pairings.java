class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int x=0;
        if(nums2.length%2!=0){
        for(int a:nums1){
            x^=a;
        }
        }
         if(nums1.length%2!=0){
        for(int b:nums2){
            x^=b;
        }
         }
       return x; 
    }
}