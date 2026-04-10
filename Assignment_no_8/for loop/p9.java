class Main{
    public static void main(String args[]){
        int arr1[]={1,1,2,2,2,3,7};
        int arr2[]={1,1,2,2,2,3};

        boolean found;
        for(int i=0;i<arr1.length;i++){
            found = false;
            for(int j=0;j<arr2.length;j++){
                if(arr1[i] == arr2[j]){
                    found = true;
                    break;
                }
            }
            if(!found){
                System.out.println(arr1[i]);
                break;
            }
        }
    }
}
//

//javac p9.java
//java Main 
// Output: 7
//time complexity: O(n^2)
//space complexity: O(1)