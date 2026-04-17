import java.util.*;

class Demo {
    public static void main(String[] args) {
         int[] arr = {1,1,2,2,2,3};
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int num : arr) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int freq : hm.values()) {
            if (freq < min) {
                min = freq;
            }
        }
        for (int freq : hm.values()) {
            if (freq > min && freq < secondMin) {
                secondMin = freq;
            }
        }
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() == secondMin) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}
