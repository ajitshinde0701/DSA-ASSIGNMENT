class Array {

    static int fun(int arr[], int i, int target) {
        
        if (i == arr.length) {
            return -1;
        }

      
        int index = fun(arr, i + 1, target);

        
        if (index != -1) {
            return index;
        }

       
        if (arr[i] == target) {
            return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {5,2,3,2,4};
        int target= 2;

        System.out.println(fun(arr, 0, target));
    }
}