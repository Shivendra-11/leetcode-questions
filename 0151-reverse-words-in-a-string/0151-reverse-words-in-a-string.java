class Solution {
    public String reverseWords(String s) {

        char[] charArray = s.toCharArray();
        int n = charArray.length;
        
        // Reverse the entire character array
        reverse(charArray, 0, n - 1);

        int i = 0, l = 0, r = 0;

        while (i < n) {
            while (i < n && charArray[i] != ' ') {
                charArray[r++] = charArray[i++];
            }
            if (l < r) {
                reverse(charArray, l, r - 1);
                if (r < n) { // Ensure there's space for adding a space
                    charArray[r] = ' ';
                    r++;
                }
                l = r;
            }
            i++;
        }
        
        // Remove the trailing space if there is one
        return new String(charArray, 0,  charArray[r - 1] == ' ' ? r - 1 : r);
    }

    private void reverse(char[] arr, int start, int end) {
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
