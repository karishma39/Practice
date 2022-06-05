package slidingWindow;

import java.util.HashMap;

public class LongestSubstringWithKUniqueChars {
    public static void main(String args[]) {
        String s = "aabacdaccefadga"; //aababcbebe
        String res = "";
        String ans = "";
        int k = 3;
        int i = 0;
        int max = Integer.MIN_VALUE;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int j = 0; j < s.length(); j++) {
            res += s.charAt(j);
            map.put(s.charAt(j), map.get(s.charAt(j)) == null ? 1 : map.get(s.charAt(j)) + 1);
            if (map.size() == k) {
                if (res.length() > max) {
                    max = Math.max(max, res.length());
                    ans = res;
                }
            }
           else if (map.size() > k){
                while (map.size() > k) {
                    map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                    if(map.get(s.charAt(i))==0) {
                        map.remove(s.charAt(i));
                        res = s.substring(i + 1, j+1);
                    }
                    i++;
                }

            }

        }
        System.out.println(ans);
    }

}
