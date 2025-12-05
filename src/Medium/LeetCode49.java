package Medium;

import java.util.*;

// Group Anagrams
// Time Complexity - O(n*k)
// Space Complexity - O(n*k)

public class LeetCode49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        List<List<String>> result = new ArrayList<>();

        for(String str : strs){
            int[] char_freq = new int[26];

            for(char ch : str.toCharArray()){
                char_freq[ch - 'a']++;
            }

            String char_freq_Str = Arrays.toString(char_freq);

            if(map.containsKey(char_freq_Str)){
                map.get(char_freq_Str).add(str);
            }else{
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(char_freq_Str,list);
            }
        }

        result.addAll(map.values());

        return result;
    }
}
