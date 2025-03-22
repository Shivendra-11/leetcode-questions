class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int rem=(int) (arr.length*(0.05));
        int resm=0;
        for(int i=0;i<rem;i++){
              resm+=arr[i];
              resm+=arr[arr.length-i-1];
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }

        return (double)(sum-resm)/(arr.length-rem*2);
    }
}