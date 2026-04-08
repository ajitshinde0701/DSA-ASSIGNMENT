class Array{
    static int fun(int arr[],int i,int target){
        if(arr[i]==target){
            return i;
        }
        return fun(arr, i+1, target);
    }

    public static void main(String args[]){
        int arr[]={5,2,3,2,4};
        int target=2;

        int index=fun(arr, 0, target);
        System.out.println(index);
    }
}


//op :- 1