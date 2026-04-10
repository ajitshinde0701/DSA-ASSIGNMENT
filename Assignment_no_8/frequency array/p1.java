class Main{
    public static void main(String arga[]){
        int arr[]={1,2,2,3,3,3,4,4};
        int max = 0;
       
        for(int i =0;i<arr.length;i++){
            max = Math.max(max,arr[i]);
        }
        int freq[] = new int[max+1];
        for(int i =0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        
        int maxEle = 0;
        int secondMaxEle =0;
        int maxEleIndex = 0;
        int secondMaxIndex = 0;

        for(int i =0;i<freq.length;i++){
            if(freq[i] > maxEle){
                secondMaxEle = maxEle;
                secondMaxIndex = maxEleIndex;
                maxEle = freq[i];
                maxEleIndex = i;
            }else if(freq[i] > secondMaxEle && freq[i] != maxEle){
                secondMaxEle = freq[i];
                secondMaxIndex = i;
            }
        }
        System.out.println(secondMaxIndex);

    }
}

//javac p1.java
//java Main
//Output: 2
//time complexity: O(n)
