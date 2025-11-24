package Easy;

// Valid Anagram
// Time Complexity - O(n)
// Space Complexity - O(1)

public class LeetCode242 {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        int[] char_freq = new int[26];

        for(int i=0; i<s.length(); i++){
            char_freq[s.charAt(i)-'a']++;
            char_freq[t.charAt(i) - 'a']--;
        }

        for(int i : char_freq){
            if(i != 0) return false;
        }

        return true;
    }
}
