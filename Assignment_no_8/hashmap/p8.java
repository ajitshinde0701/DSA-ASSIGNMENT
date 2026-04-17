import java.util.*;

class Demo {
    public static void main(String[] args) {
        String str = "Thequickbrownfoxjumpsoverthelazydog";
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch >= 'a' && ch <= 'z') {
                hm.put(ch, hm.getOrDefault(ch, 0) + 1);
            }
        }
        if (hm.size() == 26) {
            System.out.println("pangram");
        } else {
            System.out.println("not a pangram");
        }
    }
}
