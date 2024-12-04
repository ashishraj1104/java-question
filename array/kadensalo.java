public class kadensalo {
    public static void kds(int number[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++){
            currsum=currsum+number[i];
            if(currsum<0){
                currsum=0;
            }
        maxsum=Math.max(currsum,maxsum);   
    }
    System.out.println("our max subarray sum is "+maxsum);
}
    

public static void main(String args[]){
    int number[]={1,-2,3,4,5,7};
    kds(number);
}

}

    

