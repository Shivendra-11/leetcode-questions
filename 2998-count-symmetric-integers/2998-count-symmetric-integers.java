class Solution {
    public boolean check(int n) {
        int digit = 0;
        int sum = 0;
        int sum2 = 0;
        int p = n;
        int q = n;
        while (p > 0) {
            sum += p % 10;
            p = p / 10;
            digit++;
        }
        for (int i = 0; i < digit / 2; i++) {
            sum2 += q % 10;
            q = q / 10;
        }
        return (sum - sum2) == sum2 ? true : false;
    }

    public int countSymmetricIntegers(int low, int high) {
        int c = 0;
        for (int i = low; i <= high; i++) {
            String q = Integer.toString(i);
            if (q.length() % 2 != 0) {
                continue;
            } else if ((check(i))) {
                c++;
            }
        }
        return c;
    }
}