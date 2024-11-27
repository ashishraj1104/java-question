import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
//         System.out.println("*");
//         System.out.println("**");
//         System.out.println("***");
//         System.out.println("****");
//         System.out.println("*****");
//     }
    
// }


    //   print 100 star in one line 
    
//     for(int i=1;i<2;i++){
//         for(int j=1;j<=500;j++){
//         System.out.print("*");
//     }
    
//     }
//     }
// }
        //   print a solid rectangle

        // for(int i=1;i<=4;i++){            // we take i and j as a input from user
            // for(int j=1;j<=5;j++){
                // System.out.print("*");
// }
            // System.out.println();           // this is used for print star in next line
// }
// }
// }

    // print the hollow rectangle

//         Scanner sc =new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();

//         for(int i=1;i<=a;i++){
//             for(int j=1;j<=b;j++){
//                 if(i==1||j==1||i==a||j==b){
//                     System.out.print("*");
//                 }
//                 else
//                 {
//                     System.out.print(" ");
//                 }
//             }
//         System.out.println();
//         }
//     }
// }

//  print half pyramid

//             Scanner sc =new Scanner(System.in);
//             int a=sc.nextInt();


//             for(int i=1;i<=a;i++)
//             {
//                 for(int j=1;j<=i;j++)
//                 {
//                     System.out.print("*");
//             }
//                     System.out.println();
//             }
//     }
// }


//         Scanner sc =new Scanner(System.in);
//             int a=sc.nextInt();


//             for(int i=1;i<=a;i++)
// {
//             for(int j=1;j<=i;j++)
//     {
//         System.out.print("*");
// }
//         System.out.println();
// }
// }

//         Scanner sc =new Scanner(System.in);
//         int n=sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//     }
// } 
            
        //         for(int i=1;i<=5;i++){
        //             for(int j=1;j<=5-i+1;j++){
        //                 System.out.print(j+" ");
        //             }
        //             System.out.println();
        //         }
        //     }
        // } 
            

            // floyds triangle
                        
    //         Scanner sc =new Scanner(System.in);
    //         int n=sc.nextInt();
    //         int a=1;
    //         for(int i=1;i<=n;i++){
    //             for(int j=1;j<=i;j++){
    //                 System.out.print(a+" ");
    //                 a++;
    //             }
    //             System.out.println();
    //         }
    //     }
    // } 
        
        
            // Scanner sc =new Scanner(System.in);
            // int n=sc.nextInt();
//             for(int i=1;i<=n;i++){
//                 for(int j=1;j<=i;j++){
//                     int a=i+j;
//                     if(a%2==0){
//                         System.out.print("1 ");
//                     }
//                     else{
//                     System.out.print("0 ");
                
//             }
//         }
//             System.out.println();
//     }
// }
// }

        // butterfly
        
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            int space=2*(n-i);
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
            for(int i=n;i>=1;i--){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                int space=2*(n-i);
                for(int j=1;j<=space;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }

        }
    }