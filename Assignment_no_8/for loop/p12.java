    class Main{
    public static void main(String[]args){
        int [] arr = {1,1,2,2,3,5};
        for(int i=0;i<arr.length;i++){
            int count = 0;
            for(int j=0;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            System.out.println(arr[i] + " : " + count);
        }
    }
}

//javac p12.java
//java Main
//Output:
//1 : 2 
//2 : 2
//3 : 1
//5 : 1
//time complexity: O(n^2)
//space complexity: O(1)