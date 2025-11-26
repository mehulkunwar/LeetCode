package Easy;

// Valid Palindrome
// Time Complexity - O(n)
// Space Complexity - O(1)

public class LeetCode125 {
    public boolean isPalindrome(String s) {
        s = s.toUpperCase();
        int l = 0, r = s.length()-1;

        while(l < r){
            while(l < r && !Character.isLetterOrDigit(s.charAt(l))) l++;
            while(l < r && !Character.isLetterOrDigit(s.charAt(r))) r--;

            if(s.charAt(r) != s.charAt(l)) return false;

            l++;r--;
        }

        return true;
    }
}
