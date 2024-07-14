// Solved On: 13/07/2024

// Question:
// Given an array of strings strs, group all anagrams together into sublists. You may return the output in any order.
// An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.

// Example 1:
//     Input: strs = ["act","pots","tops","cat","stop","hat"]
//     Output: [["hat"],["act", "cat"],["stop", "pots", "tops"]]

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class anagramGroups {

    static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            int[] count = new int[26];
            for (Character c : s.toCharArray()) {
                count[c - 'a']++;
            }
            String key = Arrays.toString(count);
            System.out.println("key: " + key);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }
        System.out.println("map: " + map);
        return new ArrayList<>(map.values());

    }

    public static void main(String[] args) {
        String[] strs = { "act", "pots", "tops", "cat", "stop", "hat" };
        System.out.println(groupAnagrams(strs));
    }
}
