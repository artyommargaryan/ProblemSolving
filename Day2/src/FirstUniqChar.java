//Given a string s, find the first non-repeating character in it and return its index.
// If it does not exist, return -1.

//time complexity: O(n),space complexity: O(1)
public class FirstUniqChar {
    public int firstUniqChar(String s) {
            int res = Integer.MAX_VALUE;
            for (char c = 'a'; c <= 'z'; c++) {
                int ind = s.indexOf(c);
                if (ind != -1 && ind == s.lastIndexOf(c)) {
                    res = Math.min(res, ind);
                }
            }

            return res == Integer.MAX_VALUE ? -1 : res;
    }
}
