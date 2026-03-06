

import java.util.*;
class Pattern{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter n number");
        int n= sc.nextInt();


            
          for(int i=1; i<=n; i++){    //n

            for(int j=1; j<=n; j++){    //n       tc= n*n = n^2
               if(i==j || i+j==n+1 ){
                 System.out.print(i);
               }
               else{
                 System.out.print(" ");
               }
               
            }
            
            System.out.println();
        }
    }
}

/*

Enter n number
5

1   1
 2 2
  3
 4 4
5   5

Time Complexity - O(n^2)
Space Complexity _ O(1)

 */