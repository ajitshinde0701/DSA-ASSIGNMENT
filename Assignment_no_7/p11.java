class Array {
    static int f(int arr[], int i, int max, int Secondmax){
        if(i==arr.length){
         
            return Secondmax;
        }

        if(arr[i]>max){
            Secondmax=max;
            max=arr[i];
        } else if(arr[i]> Secondmax && arr[i] !=max){
            Secondmax=arr[i];

        }
        return f(arr, i+1, max, Secondmax);
        
    }
    public static void main(String[] args) {
        int arr[]={10, 5, 8,20, 15};
        int smax= f(arr, 0, 0, 0);
        System.out.println(smax);
    }
}

//op :- 15