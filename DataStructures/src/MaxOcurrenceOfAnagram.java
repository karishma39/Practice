package slidingWindow;

import java.util.Arrays;

public class MaxOcurrenceOfAnagram {

    public static void main(String args[]) {
        String s = "abcghdbachucabbacd";
        String pattern = "abc";
        String s2 = "";
        int i = 0;
        int count =0;
        for (int j = 0; j < s.length(); j++) {
            s2 += s.charAt(j);
            if (j - i + 1 == pattern.length()) {
                if(isAnagram(pattern.toCharArray(),s2.toCharArray())){
                    count ++;
                    System.out.println(count+" "+s2);
                }
                i++;
                s2=s2.substring(1);
            }
        }
    }

    private static boolean isAnagram(char[] pattern, char[] s2) {
        Arrays.sort(pattern);
        Arrays.sort(s2);

        for(int i=0;i<pattern.length;i++){
            if(pattern[i]!=s2[i])
                return false;
        }

        return true;
    }

}
