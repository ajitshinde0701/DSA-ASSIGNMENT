class Array{
    static int fun(int arr[],int i,int count,int target){
       if(arr[i]==target){
           count++;
       }
       if(i==arr.length-1){
           return count;
       }
       return fun(arr, i+1, count, target);

    }

    public static void main(String args[]){
        int arr[]={1,2,2,3,2};
        int target=2;
        int result=fun(arr, 0, 0, target);
        System.out.println("The count of "+target+" is: "+result);
    }
}

//Output:
//The count of 2 is: 3