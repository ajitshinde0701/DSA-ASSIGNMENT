class Main{
    public static void main(String[]args){
        int[] arr1 = {1,2,2,3};
        int[] arr2 = {2,2,4};
        int[] freq = new int [Math.max(arr1.length, arr2.length)+1];
        for(int i=0;i<arr1.length;i++){
           for(int j=0;j<arr2.length;j++){
               if(arr1[i] == arr2[j]){
                   freq[arr1[i]]++;
                   break;
               }
           }
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]>0){
                System.out.print(i+","+freq[i]+" ");
            }
        }
    }
}
