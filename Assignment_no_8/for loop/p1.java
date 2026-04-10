class Main{
    public static void main(String args[]){
        int arr[]={1,2,2,3,3,3,4,4};
        int max = 0;
        int secondMax =0;

        for(int i =0;i<arr.length;i++){
            int count = 0;
            for(int j =0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count > max){
                secondMax = max;
                max = count;
            }else if(count > secondMax && count != max){
                secondMax = count;
            }
        }
        System.out.println(secondMax);
    }
}

//javac p1.java

//java Main

//Output: 2

//time complexity: O(n^2) because of the nested loops

//space complexity: O(1) 