// Solved On: 13/07/2024

// Question:
// Given two strings s and t, return true if the two strings are anagrams of each other, otherwise return false.
// An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.

// Example 1:
//     Input: s = "racecar", t = "carrace"
//     Output: true

import java.util.HashMap;
import java.util.Map;

public class isAnagram {

    static boolean findAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        Map<Character, Integer> s_map = new HashMap<>();
        Map<Character, Integer> t_map = new HashMap<>();

        for (Character c : s.toCharArray()) {
            if (s_map.containsKey(c)) {
                s_map.put(c, s_map.get(c) + 1);
            } else {
                s_map.put(c, 1);
            }
        }

        for (Character c : t.toCharArray()) {
            if (t_map.containsKey(c)) {
                t_map.put(c, t_map.get(c) + 1);
            } else {
                t_map.put(c, 1);
            }
        }

        if (s_map.equals(t_map))
            return true;
        return false;

    }

    public static void main(String[] args) {

        String s = "racecar", t = "carrace";
        System.out.println(findAnagram(s, t));

    }
}
