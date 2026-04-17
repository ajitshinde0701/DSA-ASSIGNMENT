class Main{
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3};
        int max = arr[0];
        for(int i =1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        int[] freq = new int[max+1];
        for(int i =0;i<arr.length;i++){
            freq[arr[i]]++;
        }
       
        int maxFreq = arr[0];
        int secondMax = arr[0];
        int maxEle = arr[0];
         int secondEle = arr[0];
        for(int i =0;i<freq.length;i++){
            if(freq[i]>maxFreq){
                secondEle = maxEle;
                maxEle = i;
                secondMax = maxFreq;
                maxFreq = freq[i];
               
            }
            else if(freq[i]>secondMax && freq[i]!=maxFreq){
                secondMax = freq[i];
                secondEle = i;
            }
        }
        System.out.print(secondEle+" ");
      
    }
}
