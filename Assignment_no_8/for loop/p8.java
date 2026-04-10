class Main{
    public static void main(String args[]){
        String str = " thequickbrownfoxjumpsoverthelazydog";

        boolean isPangram = true;
        for(char ch = 'a'; ch<='z';ch++){
            boolean found = false;
            for(int i=0;i<str.length();i++){
                if(str.charAt(i) == ch){
                    found = true;
                    break;
                }
            }
            if(!found){
                isPangram = false;
                break;
            }
        }
        System.out.println(isPangram);
    }
}
//javac p8.java
//java Main
// Output: true
//time complexity: O(n) 
//space complexity: O(1)