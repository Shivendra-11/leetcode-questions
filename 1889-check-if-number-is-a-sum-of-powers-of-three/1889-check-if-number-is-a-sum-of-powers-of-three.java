class Solution {
    public static boolean ispow(int n, int i) {
        if (n == 0) {
            return true;  
        }
        if (n < 0 || Math.pow(3, i) > n) {
            return false;  
        }

        int power = (int) Math.pow(3, i);  
        
        
        return ispow(n - power, i + 1) || ispow(n, i + 1);
    }

    public boolean checkPowersOfThree(int n) {
        return ispow(n, 0);
    }
}
