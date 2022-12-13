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
