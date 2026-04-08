class Array{

    static boolean isUnique(int arr[], int i, int num){
        if(i== arr.length){
                return true;
            }

        if(num==arr[i]){
            return false;

        }
        return isUnique(arr, i+1, num);


    }


    static boolean f(int arr[], int i){
            if(i== arr.length-1){
                return true;
            }

            if(isUnique(arr, i+1, arr[i]) == false){
                return false;
            }
            
            return f(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        System.out.println(f(arr, 0));
    }
}

//op :- true