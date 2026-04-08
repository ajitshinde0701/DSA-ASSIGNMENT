 class Array {
    static boolean f(int arr[], int i){
        if(i==arr.length){
            return true;
        }
        if(arr[i]%2 !=0){
            return false;
        }
        return f(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[]={2,4,6 };
        boolean isEven= f(arr, 0);
        System.out.println(isEven);
    }
    
}

//op :- true
