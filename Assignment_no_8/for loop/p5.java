class Main{
    public static void main(String args[]){
        int arr[]={1,2,2,2,3};

        for(int i =0;i<arr.length;i++){
            int count =0;
            for(int j =0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==1){
                System.out.println(arr[i]);
            }
        }
    }
}

//javac p5.java
//java main
//output :- 1,3
// time complexity :- O(n^2)