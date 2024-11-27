public class funo{
    //     public static int sum(int a,int b){
    //         return a+b;
    //     }
    //     public static int sum(int a,int b,int c){
    //         return a+b+c;
    // }
//     public static int sum(int a,int b){
//         return a+b;
//     }
//     public static float sum(float a,float b){
//         return a+b;
//     }
    
//     public static void main(String[] args) {
//         System.out.println(sum(2,3));
//         System.out.println(sum(2.4f,5.8f));
//     }
// }    
public static boolean isprime(int n){
    if (n==2){
        return true;
    }

    for (int i=2;i<= Math.sqrt(n);i++){
        if (n%i==0){
            return false;

        }
    }
    return true;
}
    public static void primeinrange(int n){
        for(int i=2;i<=n;i++){
            if(isprime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

public static void main(String[] args) {
    primeinrange(20);
    
}
}
