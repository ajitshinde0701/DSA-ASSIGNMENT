class Main{
    public static void main(String[]args){
     String str = "Thequickbrownfoxjumpsoverthelazydog";
        int [] freq = new int[26];
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch>='a' && ch<='z'){
                freq[ch-'a']++;
            }
        }
        boolean isPangram = true;
        for(int i =0;i<26;i++){
            if(freq[i] == 0){
                isPangram = false;
                break;
            }
        }
        if(isPangram){
            System.out.println(" pangram");
        }
        else{
            System.out.println(" not a pangram");
        }
    }
}
