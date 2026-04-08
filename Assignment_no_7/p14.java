class Array {
    static boolean f(int arr[], int i, int target){
        if(i==arr.length){
            return false;
        }
        if(arr[i]==target){
            return true;
        }
        return f(arr, i+1, target);
    }


    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int target=3;
        System.out.println(f(arr, 0, target));
        
    }
    
}



//op :- true