import java.util.*;
class Demo{
    public static void main(String[]args){
      String str = "apple";
      char result = 'a';
      int maxFreq = 0;
      HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        for (char key : hm.keySet()) {
            if (hm.get(key) > maxFreq) {
                maxFreq = hm.get(key);
                result = key;
            }
        }
        System.out.println(result);

    }
}