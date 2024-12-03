import javax.sound.sampled.SourceDataLine;

public class maxsubarraysum {
    public static void bruteforce(int number[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++){
            int start=number[i];
            for(int j=1;j<number.length;j++){
                int end=number[j];
                currsum=0;
                for(int k=start;k<=end;k++){
                currsum+=number[k];
                }
            
            System.out.println(currsum);
            if(maxsum<currsum){
                maxsum=currsum;
            }
        }
    }
    System.out.println("maxsum = "+maxsum);
}
public static void main(String args[]){
    int number[]={1,2,3,4,5,6,7,8,9};
    bruteforce(number);
}
}
