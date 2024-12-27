
//Q10  BUTTERFLY HAED PATTERNS
// *       *
// **      **
// ***    ***
// ****  ****
// **********
// **********
// ****  ****
// ***    ***
// **      **
// *        *


import java.util.*;

public class patterns2 {
    public static void main(String args[]) {
        int n =5;
         ///upper half
     for (int i=1; i<= n; i++) {
        //first part
        for (int j=1; j<=i; j++) {
            System.out.print("*");
        }
          // spaces
            int spaces =2*(n-i);
            for (int s = 1; s<= spaces; s++){
                System.out.print(" ");
            }
            // second part
            for (int j=1; j<=i;j++){
            System.out.print("*");
        }
         System.out.println();
       }

        ///lower half 
        for (int i=n; i>=1; i--) {
            //first part
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
              // spaces
                int spaces = 2 * (n-i);
                for (int s=1; s<= spaces; s++){
                    System.out.print(" ");
                }
                // second part
                for (int j=1; j<=i;j++){
                System.out.print("*");
            }
             System.out.println();
           }
    }
}



//Q 11 SOLID RHOMBUS HARD PATTERNS
//     *****
//    *****
//   *****
//  *****
// *****


import java.util.*;


public class patterns2{
    public static void main (String args []){
        int n =5;
        
    for(int i=1;i<=n; i++){
            //spaces
           for(int s=1;s<=n-i; s++){
            System.out.print(" ");
           }

           // stars 
           for (int j=1; j<=n; j++){
           System.out.print("*");
        }
        System.out.println();
      }
    }
}
  



  
//Q 12 NUMBER PYRAMID
//     1 
//    2 2
//   3 3 3
//  4 4 4 4
// 5 5 5 5 5


import java.util.*;


public class patterns2{
    public static void main (String args []){
        int n =5;
        for (int i=1; i<=n; i++){
               // for space
               for (int s=1; s<=n-i; s++){
                System.out.print(" ");
               }
               // nubers => print row number row number times
               for (int j=1; j<=i; j++ ){
                System.out.print(i+" ");

               }
               System.out.println();
            }    
        }
        
     }




  // Q 13 HOLLO SOLID RHOMBUS HARD PATTERNS
//     *****
//    *   *
//   *   *
//  *   *
// *****




import java.util.*;


public class patterns2{
    public static void main (String args []){
        int n = 5;
        int m = 5;
        
    for(int i=1;i<=n; i++){
            //spaces
           for(int s=1;s<=n-i; s++){
            System.out.print(" ");
           }

           // stars 
           for (int j=1; j<=n; j++){
            if (i == 1 || j == 1 || i == n || j == m) {
                 System.out.print("*");
            } else {
                 System.out.print(" ");
        }
        
        }
        System.out.println();
      }
    }
}




//Q 14 palindromic pattens 
//     1
//    212
//   32123
//  4321234
// 543212345



import java.util.*;

public class patterns2 {
    public static void main(String args[]){
     int n = 5;
    for(int i=1; i<=n; i++)  {
        // spaces
        for (int j=1; j<=n-i;j++){
            System.out.print(" ");
        }
        // 1st half number
        for (int j=i; j>=1; j--){
            System.out.print(j);
        }
        // 2nd hlaf
        for(int j=2; j<=i; j++){
            System.out.print(j);
        }
        System.out.println();
      }
    }
}




// Q 15 Dimond pattern

//    *
//   ***
//  *****
// *******
// *******
//  *****
//   ***
//    *

import java.util.*;
public class pattwen2{
    public static void main  (String args[]){
      int n = 4;
      // uper half 
      for (int i=1; i<=n; i++){
        // for spaces 
        for (int j=1; j<= n-i; j++){
          System.out.print(" ");
        }
        // for star
        for (int j=1; j <= 2*i-1; j++){
          System.out.print("*");
        }
        System.out.println();
      }

      // lower half 
      for (int i=n; i>=1; i--){
        // for spaces 
        for (int j=1; j<= n-i; j++){
          System.out.print(" ");
        }
        // for star
        for (int j=1; j <= 2*i-1; j++){
          System.out.print("*");
        }
        System.out.println();
      }
    }
}


//Q 16 number pattern 

// 5 5 5 5 5 5 5 5 5 
// 5 4 4 4 4 4 4 4 5 
// 5 4 3 3 3 3 3 4 5 
// 5 4 3 2 2 2 3 4 5 
// 5 4 3 2 1 2 3 4 5 
// 5 4 3 2 2 2 3 4 5 
// 5 4 3 3 3 3 3 4 5 
// 5 4 4 4 4 4 4 4 5 
// 5 5 5 5 5 5 5 5 5


public class Pattern {
  public static void main(String[] args) {
      int n = 14; // size of the pattern
      int layers = (n + 1) / 2; // number of layers in the pattern

      for (int i = 0; i < n; i++) {
          for (int j = 0; j < n; j++) {
              int value = layers - Math.min(Math.min(i, j), Math.min(n - 1 - i, n - 1 - j));
              System.out.print(value + " ");
          }
          System.out.println();
      }
  }
}


//Q 17 ractange number pattern

// 6 6 6 6 6 6 6 6 6 6 6 6 6 
// 6 5 5 5 5 5 5 5 5 5 5 5 6
// 6 5 4 4 4 4 4 4 4 4 4 5 6
// 6 5 4 3 3 3 3 3 3 3 4 5 6
// 6 5 4 3 2 2 2 2 2 3 4 5 6
// 6 5 4 3 2 1 1 1 2 3 4 5 6
// 6 5 4 3 2 1 0 1 2 3 4 5 6
// 6 5 4 3 2 1 1 1 2 3 4 5 6
// 6 5 4 3 2 2 2 2 2 3 4 5 6
// 6 5 4 3 3 3 3 3 3 3 4 5 6
// 6 5 4 4 4 4 4 4 4 4 4 5 6
// 6 5 5 5 5 5 5 5 5 5 5 5 6
// 6 6 6 6 6 6 6 6 6 6 6 6 6

public class Pattern {
  public static void main(String[] args) {
      int n = 13; // size of the pattern
      int[][] matrix = new int[n][n];

      // Fill the matrix
      for (int i = 0; i < n / 2; i++) {
          for (int j = i; j < n - i; j++) {
              matrix[i][j] = n / 2 - i;
              matrix[j][i] = n / 2 - i;
              matrix[n - i - 1][j] = n / 2 - i;
              matrix[j][n - i - 1] = n / 2 - i;
          }
      }

      // Print the matrix
      for (int i = 0; i < n; i++) {
          for (int j = 0; j < n; j++) {
              System.out.print(matrix[i][j] + " ");
          }
          System.out.println();
      }
  }
}





