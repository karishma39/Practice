import java.util.HashMap;
import java.util.Scanner;

public class CheckAnagram {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < s1.length(); i++) {
            map.put(s1.charAt(i), map.get(s1.charAt(i)) != null ? map.get(s1.charAt(i)) + 1 : 1);
        }
        System.out.println(map);
        System.out.println(isAnagram(map, s2, s1.length()));
    }

    private static boolean isAnagram(HashMap<Character, Integer> map, String s2, int count) {
        if (count != s2.length())  //abca bcad
            return false;

        for (int i = 0; i < s2.length(); i++) {
            if(map.containsKey(s2.charAt(i))) {
                if (map.get(s2.charAt(i)) > 0) {
                    map.put(s2.charAt(i), map.get(s2.charAt(i)) - 1);
                    count--;
                }
            }

        }
        if (count == 0)
            return true;
        else
            return false;

    }
}
