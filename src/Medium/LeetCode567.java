package Medium;

import java.util.Arrays;

// Permutation in String
// Time Complexity - O(n)
// Space Complexity - O(1)
public class LeetCode567 {
    public boolean checkInclusion(String s1, String s2) {
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        int l = 0, r = 0;

        for(int i=0; i<s1.length(); i++){
            arr1[s1.charAt(i) - 'a']++;
        }

        while(r < s2.length()){
            if(r - l + 1 > s1.length()){
                arr2[s2.charAt(l) - 'a']--;
                l++;
            }

            arr2[s2.charAt(r) - 'a']++;

            if(Arrays.equals(arr1,arr2)) return true;
            r++;

        }

        return false;
    }
}
