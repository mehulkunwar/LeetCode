package Easy;

import java.util.HashSet;
import java.util.Set;

// Contains Duplicate
// Time Complexity - O(n)
// Space Complexity - O(n)

public class LeetCode217 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int i : nums){
            if(set.contains(i)) return true;
            set.add(i);
        }

        return false;
    }
}
