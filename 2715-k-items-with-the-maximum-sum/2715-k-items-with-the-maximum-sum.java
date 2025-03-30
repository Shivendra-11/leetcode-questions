class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
         int arr[]=new int[numOnes+numZeros+numNegOnes];
         int p=0;
         for(int i=0;i<numOnes;i++){
            arr[p++]=1;
         }
         for(int i=0;i<numZeros;i++){
            arr[p++]=0;
         }
         for(int i=0;i<numNegOnes;i++){
            arr[p++]=-1;
         }
         int sum=0;
         for(int i=0;i<k;i++){
            sum+=arr[i];
         }
         
         return sum;
    }
}