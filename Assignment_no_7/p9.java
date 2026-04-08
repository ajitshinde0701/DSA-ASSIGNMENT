class Array{
    static int fun(int arr[],int i,int sum){
        if(i%2 !=0){
            sum+=arr[i];
        }
        if(i==arr.length-1){
            return sum;
        }
        return fun(arr, i+1, sum);
    }

    public static void main(String args[]) {
        int arr[]={10,20,30,40,50};
        int sum=fun(arr, 0, 0);
        System.out.println(sum);
    }
}


//op :- 60