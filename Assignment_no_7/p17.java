class Array{


    static int f(int arr[], int i, int count, int k){
            if(i== arr.length){
                return count;
            }
            if(arr[i]%k==0){
                    count = count +1;
            }
            return f(arr, i+1, count, k);
    }
    public static void main(String[] args) {
        int arr[]={2,4,5,6,9};
        int k=2;
        System.out.println(f(arr, 0, 0, k));
    }
}

//op :- 3