//To print below pattern
/*
 *  *  *  *  *
 *           *
 *           *
 *           *
 *  *  *  *  *
 */
// import java.util.Scanner;
// public class _4Pattern
// {
//     public static void main(String []args)
//     {   
//         Scanner scan= new Scanner(System.in);
//         int n=scan.nextInt();
//         for (int i=0;i<n;i++)
//         {
//             for(int j=0;j<n;j++){
//                 if(i==0 || i==n-1 || j==0 || j==n-1)
//                 {
//                     System.out.print(" * ");
//                 }
//                 else{
//                     System.out.print("   ");
//                 }
//                 }
//                 System.out.println();
//             }
//         }
// }




//To print below pattern
//  *           *
//  *           *
//  *  *  *  *  *
//  *           *
//  *           *
// import java.util.Scanner;
// public class _4Pattern
// {
//     public static void main(String []args)
//     {   
//         Scanner scan= new Scanner(System.in);
//         int n=scan.nextInt();
//         for (int i=0;i<n;i++)
//         {
//             for(int j=0;j<n;j++){
//                 if(i==(n-1)/2 || j==0 || j==n-1)
//                 {
//                     System.out.print(" * ");
//                 }
//                 else{
//                     System.out.print("   ");
//                 }
            
//                 }
//                 System.out.println();
//             }
//         }
// }


//To print below pattern
// *  *  *  *  *
//       *
//       *
//       *
// *  *  *  *  * 
// import java.util.Scanner;
// public class _4Pattern
// {
//     public static void main(String []args)
//     {   
//         Scanner scan= new Scanner(System.in);
//         int n=scan.nextInt();
//         for (int i=0;i<n;i++)
//         {
//             for(int j=0;j<n;j++){
//                 if(i==0 || i==n-1 || j==(n-1)/2)
//                 {
//                     System.out.print(" * ");
//                 }
//                 else{
//                     System.out.print("   ");
//                 }
            
//                 }
//                 System.out.println();
//             }
//         }
// }






//    *  *  *
// *           *
// *           *
// *           *
// *  *  *  *  *
// *           *
// *           *
// *           *
// *           *
// *           *
// import java.util.Scanner;
// public class _4Pattern
// {
//     public static void main(String []args)
//     {   
//         Scanner scan= new Scanner(System.in);
//         int n=scan.nextInt();
//         for (int i=0;i<n;i++)
//         {
//             for(int j=0;j<n;j++){
//                 if(i==0 && j>0 && j<(n-1)/2 || j==0 && i>0 || i==(n-1)/2 && j<(n-1)/2 || j==(n-1)/2 && i>0)
//                 { 
//                     System.out.print(" * ");
//                 }
                
//                 else{
//                     System.out.print("   ");
//                 }
            
//                 }
//                 System.out.println();
//             }
//         }
// }



// *  *  *  *
// *           *
// *           *
// *           *
// *           *
// *           *
// *           *
// *           *
// *           *
// *  *  *  *

// import java.util.Scanner;
// public class _4Pattern
// {
//     public static void main(String []args)
//     {   
//         Scanner scan= new Scanner(System.in);
//         int n=scan.nextInt();
//         for (int i=0;i<n;i++)
//         {
//             for(int j=0;j<n;j++){
//                 if(i==0 && j<(n-1)/2 || j==(n-1)/2 && i>0 && i<n-1 || j==0 || i==n-1 && j<(n-1)/2)
//                 { 
//                     System.out.print(" * ");
//                 }
                
//                 else{
//                     System.out.print("   ");
//                 }
            
//                 }
//                 System.out.println();
//             }
//         }
// }

//     *  *  *
// *           *
// *
// *
// *
// *
// *
// *
// *           *
//    *  *  *
// import java.util.Scanner;
// public class _4Pattern
// {
//     public static void main(String []args)
//     {   
//         Scanner scan= new Scanner(System.in);
//         int n=scan.nextInt();
//         for (int i=0;i<n;i++)
//         {
//             for(int j=0;j<n;j++){
//                 if(i==0 && j>0 && j<(n-1)/2 || j==0 && i>0 && i<n-1 || i==n-1 && j>0 && j<(n-1)/2 ||
//                  j==((n-1)/2) && i>0 && i<2 ||j==(n-1)/2 && i<n-1 && i>n-3)
//                 { 
//                     System.out.print(" * ");
//                 }
                
//                 else{
//                     System.out.print("   ");
//                 }
            
//                 }
//                 System.out.println();
//             }
//         }
// }

//    *  *  *
// *           *
// *
// *
// *
// *     *  *  *
// *           *
// *           *
// *           *
//    *  *  *
// import java.util.Scanner;
// public class _4Pattern
// {
//     public static void main(String []args)
//     {   
//         Scanner scan= new Scanner(System.in);
//         int n=scan.nextInt();
//         for (int i=0;i<n;i++)
//         {
//             for(int j=0;j<n;j++){
//                 if(i==0 && j>0 && j<(n-1)/2 || j==0 && i>0 && i<n-1 || i==n-1 && j>0 && j<(n-1)/2 ||
//                  j==((n-1)/2) && i>0 && i<2 ||j==(n-1)/2 && i<n-1 && i>(n-1)/2 || i==(n-1)/2+1 && j>((n)/4-1) && j<(n-1)/2)
//                 { 
//                     System.out.print(" * ");
//                 }
                
//                 else{
//                     System.out.print("   ");
//                 }
            
//                 }
//                 System.out.println();
//             }
//         }
// }

import java.util.Scanner;
public class _4Pattern
{
    public static void main(String []args)
    {   
        Scanner scan= new Scanner(System.in);
        int n=scan.nextInt();
        for (int i=0;i<n;i++)
        {
            // for(int j=0;j<n;j++){
            //     if(i==0 && j>0 && j<(n-1)/2 || j==0 && i>0 || i==(n-1)/2 && j<(n-1)/2 || j==(n-1)/2 && i>0)
            //     { 
            //         System.out.print(" * ");
            //     }
                
            //     else{
            //         System.out.print("   ");
            //     }
            
            //     }
                System.out.print("   ");
            for(int j=0;j<n;j++){
                if(i==0 && j<(n-1)/2 || i==(n-1)/2 && j<(n-1)/2 || i==n-1 && j<(n-1)/2 || 
                j==0 && i<=(n-1) || j==(n-1)/2 && i>0 && i<(n-1)/2 ||
                j==(n-1)/2 && i>(n-1)/2 && i<(n-1) )
                {
                        System.out.print(" * ");
                        
                }
                else{
                        System.out.print("   ");
                }
                                
                }
                System.out.print("  ");
            for(int j=0;j<n;j++){
                if(i==0 && j>0 && j<(n-1)/2 || j==0 && i>0 && i<n-1 || i==n-1 && j>0 && j<(n-1)/2 ||
                 j==((n-1)/2) && i>0 && i<2 ||j==(n-1)/2 && i<n-1 && i>n-3)
                { 
                    System.out.print(" * ");
                }
                
                else{
                    System.out.print("   ");
                }
            
                }
                System.out.print("  ");
            for(int j=0;j<n;j++){
                if(i==0 && j<(n-1)/2 || j==(n-1)/2 && i>0 && i<n-1 || j==0 || i==n-1 && j<(n-1)/2)
                { 
                    System.out.print(" * ");
                }
                
                else{
                    System.out.print("   ");
                }
            
                }   
                System.out.print("  ");
            for(int j=0;j<n;j++){
                if(j==0 || i==0 && j<=(n-1)/2 || i==(n-1)/2 && j<=(n-1)/2 || i==(n-1) && j<=(n-1)/2)
                { 
                    System.out.print(" * ");
                }
                
                else{
                    System.out.print("   ");
                }
            
                }
                System.out.print("  ");
            for(int j=0;j<n;j++){
                if(j==0 || i==0 && j<=(n-1)/2 || i==(n-1)/2 && j<=(n-1)/2 || i==(n-1) && j<=(n-1)/2)
                { 
                    System.out.print(" * ");
                }
                
                else{
                    System.out.print("   ");
                }
            
                }
            for(int j=0;j<n;j++){
                if(j==0 || i==0 && j<=(n-1)/2 || i==(n-1)/2 && j<=(n-1)/2 || i==(n-1) && j<=(n-1)/2)
                { 
                    System.out.print(" * ");
                }
                
                else{
                    System.out.print("   ");
                }
            
                }             
            for(int j=0;j<n;j++){
                if(j==0 || i==0 && j<=(n-1)/2 || i==(n-1)/2 && j<=(n-1)/2 )
                { 
                    System.out.print(" * ");
                }
                    
                else{
                    System.out.print("   ");
                }
                
                }
                System.out.print("  ");
            for(int j=0;j<n;j++){
                if(i==0 && j>0 && j<(n-1)/2 || j==0 && i>0 && i<n-1 || i==n-1 && j>0 && j<(n-1)/2 ||
                 j==((n-1)/2) && i>0 && i<2 ||j==(n-1)/2 && i<n-1 && i>(n-1)/2 || i==(n-1)/2+1 && j>((n)/4-1) && j<(n-1)/2)
                { 
                    System.out.print(" * ");
                }
                
                else{
                    System.out.print("   ");
                }
            
                }                              

                System.out.println();
            }
            scan.close();
        }
}