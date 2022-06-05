package slidingWindow;

import java.util.HashMap;

public class MaxAnagramsUsingHashmap {
    public static void main(String args[]) {
        String s = "abcghdbachucabbacd";
        String s1 = "abc";

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < s1.length(); i++) {
            map.put(s1.charAt(i), map.get(s1.charAt(i)) != null ? map.get(s1.charAt(i)) + 1 : 1);
        }

        int i = 0;
        int result = 0;
        int count =map.size();
        HashMap<Character, Integer> map2 = map;
        for (int j = 0; j < s.length(); j++) {
            char s2=s.charAt(j);
            if (map.containsKey(s.charAt(j))) {
                map.put(s.charAt(j), map.get(s.charAt(j)) - 1);
                if (map.get(s.charAt(j)) == 0){
                    count--;
                }
            }
            if (j - i + 1 == s1.length()) {
                if (count == 0) {
                    result++;
                    System.out.println(s.substring(i,j+1));
                }
                if(map.containsKey(s.charAt(i))){
                    map.put(s.charAt(i), map.get(s.charAt(i))+1);
                    if(map.get(s.charAt(i))==1) {
                        count++;
                    }
                }

                i++;
            }

        }
        System.out.println(result);
    }
}
