

import java.util.*;
class Pattern{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter n number");
        int n= sc.nextInt();


            int count=1;
          for(int i=1; i<=n; i++){      //n
          

            //space
            for(int j=1; j<=(n-i); j++){  //n
                System.out.print(" ");
            }

              for(int j=1; j<=i; j++){      //n
                System.out.print(count +" ");
                count++;
              }
            System.out.println();                         //tc= n*n= n^2
        }
         for(int i=n-1; i>=1; i--){
          

            //space
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }

              for(int j=1; j<=i; j++){
                System.out.print(count +" ");
                count++;
              }
            System.out.println();
        }
    }
}

/*

Enter n number
4
   1 
  2 3
 4 5 6
7 8 9 10
 11 12 13
  14 15
   16

Time Complexity - O(n^2)
Space Complexity _ O(1)

 */