class Main {
    public static void main(String[] args) {
        String str1 = "heart";
        String str2 = "earth";
        if (str1.length() != str2.length()) {
            System.out.println("false");
            return;
        }
        int[] freq = new int[26];
        for (int i = 0; i < str1.length(); i++) {
            freq[str1.charAt(i) - 'a']++;
            freq[str2.charAt(i) - 'a']--;
        }
        boolean isAnagram = true;
        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) {
                isAnagram = false;
                break;
            }
        }
        System.out.println(isAnagram);
    }
}
