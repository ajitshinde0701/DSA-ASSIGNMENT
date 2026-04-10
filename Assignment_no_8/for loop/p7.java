class Main{
    public static void main(String args[]){
        int arr[]={1,1,2,2,2,3};
        int leastFreq = Integer.MAX_VALUE;
        int secondLeastFreq = Integer.MAX_VALUE;

        int leastEle=-1;
        int secondLeastEle = -1;

        for(int i =0;i<arr.length;i++){
            int count =0;
            for(int j =0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count<leastFreq){
                secondLeastFreq = leastFreq;
                secondLeastEle = leastEle;

                leastFreq = count;
                leastEle = arr[i];
            }else if(count > leastFreq && count < secondLeastFreq){
                secondLeastFreq = count;
                secondLeastEle = arr[i];
            }

        }
        System.out.println(secondLeastEle);
    }
}

//javac p7.java
//java Main
//output :- 1;
// time complexity :- O(n^2)
