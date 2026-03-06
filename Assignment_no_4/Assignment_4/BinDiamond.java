

import java.util.*;
class Pattern{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter n number");
        int n= sc.nextInt();

        for(int i=1; i<=n; i++){        // n
            //space
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }

              for(int j=1; j<=i; j++){    // n     //n*n= n^2

                if((i+j)%2==0){
                  System.out.print("1 ");
                }else{
                   System.out.print("0 ");
                }
              }
            System.out.println();
        }
        for(int i=n-1; i>=1; i--){
            //space
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }

              for(int j=1; j<=i; j++){
                if((i+j)%2==0){
                  System.out.print("1 ");
                }else{
                   System.out.print("0 ");
                }
              }
            System.out.println();
        }
       
    }
}

/*

Enter n number
4
   1 
  0 1
 1 0 1
0 1 0 1
 1 0 1
  0 1
   1

Time Complexity - O(n^2)
Space Complexity _ O(1)
 */