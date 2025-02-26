class Solution {
    public int numOfSubarrays(int[] arr) {
        long m = 1_000_000_007;
        for (int i = 1; i < arr.length; i++){
            arr[i] = arr[i] + arr[i - 1]; 
        }

        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                c++;
            }
        }

        int even = arr.length - c; 

        
        return (int) ((c + (long) c * even) % m);
    }
}
