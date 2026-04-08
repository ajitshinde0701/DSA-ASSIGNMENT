 class Array {
    static boolean f(int arr[], int i){
        if(i==arr.length){
            return false;
        }
        if(arr[i] < 0){
            return true;
        }
        return f(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,-3,4};
        boolean isNeg=f(arr,0);
        System.out.println(isNeg);
        

    }
}

//op :- true