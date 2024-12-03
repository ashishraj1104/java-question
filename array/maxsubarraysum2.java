public class maxsubarraysum2 {
    public static void prefixsum(int number[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        int prefix[]=new int [number.length];

        prefix[0]=number[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+number[i];
        }
        for(int i=0;i<number.length;i++){
            int start=number[i];
            for(int j=1;j<number.length;j++){
                int end=number[j];
                currsum= start==0 ?prefix[end] :(prefix[end]-prefix[start-1]);
                
                if (maxsum<currsum){
                    maxsum=currsum;
                
        }
    }
}
    
}
public static void main(String args[]){
    int number[]={1,-2,3,4,5,7};
    prefixsum(number);
}
}


