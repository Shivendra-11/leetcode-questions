class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] arr = new int[code.length];
        
        // k > 0
        if (k > 0) {
            for (int i = 0; i < code.length; i++) {
                int sum = 0;
                for (int j = 1; j <= k; j++) {  
                    sum += code[(i + j) % code.length];
                }
                arr[i] = sum;
            }
        }

        // k == 0
        else if (k == 0) {
            for (int i = 0; i < code.length; i++) {
                arr[i] = 0;
            }
        }

        // k < 0
        else {
            for (int i = 0; i < code.length; i++) {
                int sum = 0;
                for (int j = 1; j <= Math.abs(k); j++) {  
                    sum += code[(i - j + code.length) % code.length];
                }
                arr[i] = sum;
            }
        }

        return arr;
    }
}
