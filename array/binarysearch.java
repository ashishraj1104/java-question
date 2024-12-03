public class binarysearch {
    public static int binsear(int number[],int key) {
        int start=0,end=number.length-1;
        while (start<=end){
            int mid=(start+end)/2;
            if (number[mid]==key){
                return mid;
            }
            if (number[mid]<key){   //right
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return-1;
        
    }
    public static void main(String[] args) {
        int number[]={1,2,3,4,5,6,7,8,9};
        int key=8;
        System.out.println("index for key is :" +binsear(number, key));
    }
    
}