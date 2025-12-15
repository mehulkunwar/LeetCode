package Medium;

// Longest Substring without repeating characters
// Time Complexity - O(n)
// Space Complexity - O(1)

public class LeetCode3 {
    public int lengthOfLongestSubstring(String s) {
        int[] freq_array = new int[256];
        int j = 0;
        int maxLen = 0;

        for(int i=0; i<s.length(); i++){
            freq_array[s.charAt(i)]++;

            while(freq_array[s.charAt(i)] > 1){
                freq_array[(s.charAt(j))]--;
                j++;
            }

            maxLen = Math.max(maxLen,i - j + 1);
        }

        return maxLen;
    }
}
