package Medium;

import java.util.*;

// Encode and Decode Strings
// Time Complexity - O(n)
// Space Complexity - O(n)

public class LeetCode271 {
    public String encode(List<String> strs) {
        StringBuilder strb = new StringBuilder();

        for(String str : strs){
            Integer size = str.length();

            strb = strb.append(size).append('@').append(str);
        }

        return strb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();

        int i = 0;

        while(i < str.length()){
            int j = i;

            while(j < str.length() && str.charAt(j) != '@') j++;

            int size = Integer.parseInt(str.substring(i,j));

            result.add(str.substring(j+1, j+size+1));

            i = j + size + 1;
        }

        return result;
    }
}
