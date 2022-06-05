package slidingWindow;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingChars {
    public static void main(String args[]) {
        String s = "aaabcdaefgrstriewabcdefghiiiierst";
        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0;
        int max = Integer.MIN_VALUE;
        String temp = "";
        String ans = "";
        for (int j = 0; j < s.length(); j++) {
            temp+=s.charAt(j);
            map.put(s.charAt(j), map.get(s.charAt(j))!=null ? map.get(s.charAt(j))+1 : 1);
            if(map.size()==j-i+1) {
                if(max<map.size()) {
                    max = map.size();
                    ans = temp;
                }
            }
            else if (map.size() < j-i+1){
                while (map.size() < j-i+1) {
                    map.put(s.charAt(i), map.get(s.charAt(i))-1);
                    if(map.get(s.charAt(i))==0) {
                        map.remove(s.charAt(i));
                    }
                    temp=s.substring(i+1,j+1);
                    i++;
                }

            }
        }
        System.out.println(max);
        System.out.println(ans);
    }
}
