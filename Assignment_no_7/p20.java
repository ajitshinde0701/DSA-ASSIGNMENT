 class Array {

    static boolean f(int arr[], int i){
        if(i==arr.length-1){
            return true;
        }

        if(arr[i]<=arr[i+1] ){
            return false;
        }
        return f(arr, i+1);
    }

    public static void main(String[] args) {
        int arr[]={9,7,5,2};
        boolean isStricDec= f( arr, 0);
        System.out.println(isStricDec);
    }
    
}

//op :- true

