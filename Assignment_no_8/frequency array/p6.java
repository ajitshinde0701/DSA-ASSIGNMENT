class Main{
    public static void main(String[]args){
        String str = "apple";
        char result = 'a';
        int[] freq = new int[26];
        for(int i=0;i<str.length();i++){    
            char ch = str.charAt(i);
            freq[ch - 'a']++;
        }  
        int maxcount = freq[0]; 
        for(int i=1;i<freq.length;i++){
          if(freq[i]> maxcount){
              maxcount = freq[i];
              result = (char)(i + 'a');
            } 
        }
       System.out.println(result);

    }
}
