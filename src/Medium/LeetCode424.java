package Medium;

// Longest Repeating Character Replacement
// Time Complexity - O(n)
//Space Complexity - O(1)

public class LeetCode424 {
    public int characterReplacement(String s, int k) {
        int l = 0, r = 0;
        int maxLength = 0;
        int max_freq = 0;
        int[] count_char = new int[26];

        while(r < s.length()){
            count_char[s.charAt(r) - 'A']++;
            max_freq = Math.max(max_freq,count_char[s.charAt(r) - 'A']);

            if((r - l + 1) - max_freq <= k){
                maxLength = Math.max(maxLength,r-l+1);
            }
            else{
                count_char[s.charAt(l) - 'A']--;
                l++;
            }

            r++;
        }

        return maxLength;
    }
}
