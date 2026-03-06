class Pattern{
    public static void main(String args[]){
        int n=5;

        for(int i=0; i<n; i++){
            int num=1;
            for(int j=0; j<=i; j++){
                    System.out.print(num);
                    num = num * (i-j)/(j+1);
               
            }
         System.out.println();

        }
    }
}

/* op-

1
11
121
1331
14641

Time Complexity - O(n^2)
Space Complexity _ O(1)
 */