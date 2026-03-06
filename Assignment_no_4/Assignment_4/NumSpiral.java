

import java.util.*;
class Pattern{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter n number");
        int n= sc.nextInt();

         int l= 2*n-1;
  for(int i=1; i<=l; i++){   //n          tc= n*n = n^2
    for (int j=1; j<=l; j++){  //n
      int top= i-1;
      int bottom= 2*n-1 -i;
      int left= j-1;
      int right= 2*n -1-j;

      int smalltopbottom= Math.min(top, bottom);
      int smallleftright= Math.min(left, right);
      int small= Math.min(smalltopbottom, smallleftright);

      int layer= small;
      System.out.print(n-layer);
    }
    System.out.println();
  }

    }
}

/*

Enter n number
3

33333
32223
32123
32223
33333


Time Complexity - O(n^2)
Space Complexity _ O(1)
 */