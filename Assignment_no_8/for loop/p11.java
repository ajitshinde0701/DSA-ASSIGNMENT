class Main {
    public static void main(String[] args) {
        String str1 = "heart";
        String str2 = "earth";
        if (str1.length() != str2.length()) {
            System.out.println("false");
            return;
        }
        boolean isAnagram = true;
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            int str1Count = 0;
            int str2Count = 0;           
            for (int j = 0; j < str1.length(); j++) {
                if (str1.charAt(j) == ch) {
                    str1Count++;
                }
            }
            for (int j = 0; j < str2.length(); j++) {
                if (str2.charAt(j) == ch) {
                    str2Count++;
                }
            }
            if (str1Count != str2Count) {
                isAnagram = false;
                break;
            }
        }
        System.out.println(isAnagram);
    }
}
//javac p11.java
//java Demo
// Output: true
//time complexity: O(n^2)
//space complexity: O(1)