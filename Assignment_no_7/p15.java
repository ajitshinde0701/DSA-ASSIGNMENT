class Array {

    static int fun(int arr[], int i,int sum) {
      
        if (i == arr.length) {
            return 0;
        }

     
        if (arr[i] < 0) {
            sum += arr[i];
        }

        return fun(arr, i + 1, sum) + sum;
    }

    public static void main(String[] args) {
        int arr[] = {1, -2, 3, -4, 5};
        int negativeSum = fun(arr, 0, 0);
        System.out.println(negativeSum);
    }
} 
//Output:
//-6