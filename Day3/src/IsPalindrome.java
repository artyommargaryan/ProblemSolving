//A phrase is a palindrome if, after converting all uppercase letters into lowercase letters
//and removing all non-alphanumeric characters, it reads the same forward and backward.
//Alphanumeric characters include letters and numbers.
//Given a string s, return true if it is a palindrome, or false otherwise.

// time complexity: O(n), space complexity: O(1)

public class IsPalindrome {
    public boolean isPalindrome(String s) {
        char[] chars = s.toLowerCase().toCharArray();

        StringBuilder str = new StringBuilder();

        for (char x: chars){
            if (x>='a' && x<='z' || x >= '0' && x<='9'){
                str.append(x);
            }
        }

        return str.toString().equals(str.reverse().toString());
    }
}
