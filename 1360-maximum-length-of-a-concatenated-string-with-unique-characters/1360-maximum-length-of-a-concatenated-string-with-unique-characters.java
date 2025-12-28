import java.util.*;

class Solution {
    Map<String, Integer> mp = new HashMap<>();

    public boolean hasCommon(String s1, String s2) {
        int[] freq = new int[26];

       
        for (char ch : s1.toCharArray()) {
            if (freq[ch - 'a'] > 0)
                return true;
            freq[ch - 'a']++;
        }

        
        for (char ch : s2.toCharArray()) {
            if (freq[ch - 'a'] > 0)
                return true;
        }

        return false;
    }

    public int solve(int idx, List<String> arr, String temp, int n) {
        if (idx >= n)
            return temp.length();

        if (mp.containsKey(temp))
            return mp.get(temp);

        int include = 0;
        int exclude;

        if (hasCommon(arr.get(idx), temp)) {
            exclude = solve(idx + 1, arr, temp, n);
        } else {
            exclude = solve(idx + 1, arr, temp, n);
            include = solve(idx + 1, arr, temp + arr.get(idx), n);
        }

        int ans = Math.max(include, exclude);
        mp.put(temp, ans);
        return ans;
    }

    public int maxLength(List<String> arr) {
        mp.clear();
        return solve(0, arr, "", arr.size());
    }
}
