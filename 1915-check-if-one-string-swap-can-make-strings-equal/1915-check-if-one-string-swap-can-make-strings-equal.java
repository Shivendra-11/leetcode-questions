class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int c = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i))
                c++;
        }
        char arr1[] = s1.toCharArray();
        char arr2[] = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        String str1=new String(arr1);
        String str2=new String(arr2);

        if (str1.equals(str2) && (c == 0 || c == 2)) {
            return true;
        }
        return false;
    }
}