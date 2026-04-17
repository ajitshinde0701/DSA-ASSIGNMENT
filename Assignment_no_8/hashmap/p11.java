import java.util.*;

class Demo {
    public static void main(String[] args) {
        String str1 = "heart";
        String str2 = "earth";
        if (str1.length() != str2.length()) {
            System.out.println("false");
            return;
        }
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            hm.put(ch, hm.get(ch) - 1);
        }       
        for (int val : hm.values()) {
            if (val != 0) {
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }
}
