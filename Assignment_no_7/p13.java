 class Array {
    static int f(int arr[],int count, int i, int x){
        if(i== arr.length){
            return count;
        }
        if(arr[i]>x){
            count = count +1;
        }
            
        return f(arr, count, i+1, x);
    }
    public static void main(String[] args) {

        int arr[]={1, 5, 3, 7, 2};
        int x=3;
        
        System.out.println(f(arr, 0, 0, x));
        

    }
    
}

//op :- 2