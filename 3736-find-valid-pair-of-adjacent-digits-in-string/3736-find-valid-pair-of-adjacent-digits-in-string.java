class Solution {
    public String findValidPair(String s) {
        char arr[] = s.toCharArray();
        HashMap<Character, Integer> mp = new HashMap<>();
        for (char ch : arr) {
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }

        for (int i = 1; i < arr.length; i++) {
            char first = arr[i-1];
            char second = arr[i];

            if (first != second) {
                if (mp.get(first) == first - '0' && mp.get(second) == second - '0') {
                    return "" + first + second;
                }
            }
        }
        return "";

    }
}