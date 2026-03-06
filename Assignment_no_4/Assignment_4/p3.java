class Demo{
    public static void main(String args[]){
        int n=5;
        for(int i=1; i<=n; i++){      //n
            for(int j=1; j<=i; j++){        
                    System.out.print("*");
               
            }                              // n(n+1)/2 == n^2 +n /2 => n^2 wrost case
         System.out.println();

        }
    }
}

/* op-

*
**
***
****
*****

Time Complexity - O(n^2)
Space Complexity _ O(1)

 */