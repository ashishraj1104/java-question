// import java.util.Scanner;

// public class conditionalswit  {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int button = sc.nextInt();

//         switch(button){
//             case 1 :System.out.println("ashish");
//             break;
//             case 2 :System.out.println("aman");
//             break;
//             case 3 :System.out.println("mohit");
//             break;
//             case 4 :System.out.println("manish");
//             break;
//             default :System.out.println("invalid button");
            
//         }
//     }
// }

import java.util.Scanner;

public class conditionalswit {


    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int operator = sc.nextInt(); 
        float a = sc.nextFloat(); 
        float b = sc.nextFloat(); 
        switch (operator ){
        
        case 1 :System.out.print("sum is ");
        System.out.println(a+b);
        break;

        case 2 :System.out.print("sub is ");
        System.out.println(a-b);
        
        break;

        case 3  :System.out.print("mul is ");
        System.out.println(a*b);

        case 4   :if (b==0){
            System.out.println("invalid division");
        }
        else{
        System.out.print("div is ");
        System.out.println(a/b);
        }
        break;

        default  :System.out.println("invalid operator ");
        
        
        }
        


    }
}