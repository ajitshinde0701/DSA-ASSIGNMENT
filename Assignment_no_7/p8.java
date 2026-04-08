class Array {
    static int f(int arr[], int i){
        if(i==arr.length-1){
            return arr[i];
        }
        int right= f(arr, i+1);
        right=Math.min(arr[i], right);
        
        return right;
    }
    public static void main(String[] args) {
        int arr[]={3,9,1,7};
        int min=f(arr, 0);
        System.out.println(min);
    }
    
}

//op :- 1