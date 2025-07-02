class Solution {
    public static void reverse(char arr[], int i, int j) {
        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public String reverseWords(String s) {
        char[] input = s.toCharArray();
        int n = input.length;

        
        reverse(input, 0, n - 1);

        
        char[] arr = new char[n + 1]; 
        int i = 0, r = 0, l = 0;

        while (i < n) {
        
            while (i < n && input[i] == ' ') i++;

        
            while (i < n && input[i] != ' ') {
                arr[r++] = input[i++];
            }

        
            if (l < r) {
                reverse(arr, l, r - 1);

                
                arr[r++] = ' ';
                l = r;
            }
        }

        
        // if (r > 0 && arr[r - 1] == ' ') r--;

        return new String(arr, 0, r-1);
    }
}
