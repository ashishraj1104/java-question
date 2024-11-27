import java.util.*;
public class datastrurte {
    public static int Index(int[] arr,int n, int ele) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == ele) {
                return i+1; 
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
            System.out.println("enter the size of arrar");
            int size =sc.nextInt();
            int[] arr= nextint(size);
            for(int i=0;i<size;i++)
            {
                arr[i]=sc.nextInt();
            }
            for(int v:element(arr,size))
            {
                System.out.println();
            }
    }
}
