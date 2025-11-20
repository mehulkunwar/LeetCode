package Medium;

import java.util.*;

// Longest Consecutive Sequence
// Time Complexity - O(n)
// Space Complexity - O(n)
public class LeetCode128 {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int i : nums) set.add(i);

        int maxSequence = 0;

        for(int i : set){
            if(!set.contains(i-1)){
                int currNum = i;
                int currSequence = 1;
                while(set.contains(++currNum)){
                    currSequence++;
                }
                maxSequence = Math.max(maxSequence,currSequence);
            }

        }

        return maxSequence;
    }
}
