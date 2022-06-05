package slidingWindow;

import java.util.HashMap;

/*
Input: s = "YazaAay"
Output: "aAa"
Explanation: "aAa" is a nice string because 'A/a' is the only letter of the alphabet in s, and both 'A' and 'a' appear.
"aAa" is the longest nice substring.
 */
public class LongestNiceSubstring {
    public static void main(String args[]) {
        longestNiceSubstring("YazaAay");
    }

    public static String longestNiceSubstring(String s) {

        int max = Integer.MIN_VALUE;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        String s1 = s.toLowerCase();
        for (int i = 0; i < s1.length(); i++) {
            map.put(s1.charAt(i), map.get(s1.charAt(i)) != null ? map.get(s1.charAt(i)) + 1 : 1);
        }
        // {a=4, y=2, z=1}
        String temp = "";
        for (int j = 0; j < s.length(); j++) {
            if (map.get(Character.toLowerCase(s.charAt(j))) >= 1) {
                temp += s.charAt(j);
                map.put(s1.charAt(j), map.get(s1.charAt(j)) - 1);
            }
            if (map.get(Character.toLowerCase(s.charAt(j))) < 1) {

            }
        }
        System.out.println(map);
        return s1;

    }
}
