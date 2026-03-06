


import java.util.*;
class Pattern{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter n number");
        int n= sc.nextInt();


          for(int i=1; i<=n; i++){      //n
                                                    tc= n*3n= n^2
            for(int j=1; j<=i; j++){    //n
                System.out.print(j);
            }
             //space
            for(int j=1; j<=2*(n-i); j++){ //n
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--){ //n
                System.out.print(j);
            }
            System.out.println();
        }

        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
             //space
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            System.out.println();
        }


    }
}

/*

Enter n number
4
1      1
12    21
123  321
12344321
12344321
123  321
12    21
1      1

Time Complexity - O(n^2)
Space Complexity _ O(1) 
 */