
////Q10  BUTTERFLY HAED PATTERNS


// import java.util.*;

// public class patterns2 {
//     public static void main(String args[]) {
//         int n =5;
//          ///upper half
//      for (int i=1; i<= n; i++) {
//         //first part
//         for (int j=1; j<=i; j++) {
//             System.out.print("*");
//         }
//           // spaces
//             int spaces =2*(n-i);
//             for (int j = 1; j<= spaces; j++){
//                 System.out.print(" ");
//             }
//             // second part
//             for (int j=1; j<=i;j++){
//             System.out.print("*");
//         }
//          System.out.println();
//        }

//         ///lower half 
//         for (int i=n; i>=1; i--) {
//             //first part
//             for (int j=1; j<=i; j++) {
//                 System.out.print("*");
//             }
//               // spaces
//                 int spaces = 2 * (n-i);
//                 for (int j=1; j<= spaces; j++){
//                     System.out.print(" ");
//                 }
//                 // second part
//                 for (int j=1; j<=i;j++){
//                 System.out.print("*");
//             }
//              System.out.println();
//            }
//     }
// }
    
////Q 11 SOLID RHOMBUS HARD PATTERNS


// import java.util.*;


// public class patterns2{
//     public static void main (String args []){
//         int n =5;
        
//     for(int i=1;i<=n; i++){
//             //spaces
//            for(int j=1;j<=n-i; j++){
//             System.out.print(" ");
//            }

//            // stars 
//            for (int j=1; j<=n; j++){
//            System.out.print("*");
//         }
//         System.out.println();
//       }
//     }
// }
  

  
//Q 12 NUMBER PYRAMID

// import java.util.*;


// public class patterns2{
//     public static void main (String args []){
//         int n =5;
//         for (int i=1; i<=n; i++){
//                // for space
//                for (int j=1; j<=n-i; j++){
//                 System.out.print(" ");
//                }
//                // nubers => print row number row number times
//                for (int j=1; j<=i; j++ ){
//                 System.out.print(i+" ");

//                }
//                System.out.println();
//             }    
//         }
        
//      }

  /// Q 13 HOLLO SOLID RHOMBUS HARD PATTERNS


// import java.util.*;


// public class patterns2{
//     public static void main (String args []){
//         int n = 5;
//         int m = 5;
        
//     for(int i=1;i<=n; i++){
//             //spaces
//            for(int j=1;j<=n-i; j++){
//             System.out.print(" ");
//            }

//            // stars 
//            for (int j=1; j<=n; j++){
//             if (i == 1 || j == 1 || i == n || j == m) {
//                  System.out.print("*");
//             } else {
//                  System.out.print(" ");
//         }
        
//         }
//         System.out.println();
//       }
//     }
// }


// Q 14 palindromic pattens 

// import java.util.*;

// public class patterns2 {
//     public static void main(String args[]){
//      int n = 5;
//     for(int i=1; i<=n; i++)  {
//         // spaces
//         for (int j=1; j<=n-i;j++){
//             System.out.print(" ");
//         }
//         // 1st half number
//         for (int j=i; j>=1; j--){
//             System.out.print(j);
//         }
//         // 2nd hlaf
//         for(int j=2; j<=i; j++){
//             System.out.print(j);
//         }
//         System.out.println();
//       }
//     }
// }


// Q 15 Dimond pattern
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


