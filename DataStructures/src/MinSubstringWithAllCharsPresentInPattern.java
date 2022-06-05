package slidingWindow;

import java.util.HashMap;

public class MinSubstringWithAllCharsPresentInPattern {
    public static void main(String args[]) {
        String s = "totamtaptat";
        String t = "tta";
        String ans = "";
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < t.length(); i++) {
            map.put(t.charAt(i), map.get(t.charAt(i)) != null ? map.get(t.charAt(i)) + 1 : 1);
        }
        System.out.println(map);
        int i = 0, j = 0;
        int min = Integer.MAX_VALUE;
        int count = map.size();
        for (j = 0; j < s.length(); j++) {
            if (map.containsKey(s.charAt(j))) {
                map.put(s.charAt(j), map.get(s.charAt(j)) - 1);
                if (map.get(s.charAt(j)) == 0) {
                    count--;
                }
            }
            if (count == 0) {
                if (min > j - i + 1) {
                    min = j - i + 1;
                    ans = s.substring(i, j + 1);
                }
                while (count == 0) {
                    if (map.containsKey(s.charAt(i))) {
                        map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
                        if (map.get(s.charAt(i)) == 1) {
                            if (min > j - i + 1) {
                                min = j - i + 1;
                                ans = s.substring(i, j + 1);
                            }
                            count++;
                        }
                    }
                    i++;
                }
            }
        }
        System.out.println(min + " " + ans);
    }
}
