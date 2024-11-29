public class bintodec {
    public static void btod(int n){
        int mynumber=n;
        int pow =0;
        int decnum=0;
        
        while (n>0) {
            int lastdigit=n%10;
            decnum=decnum+(lastdigit*(int)Math.pow(2, pow));

            pow ++;
            n=n/10;
        } 
            System.out.println("decimal of "+mynumber + " = " +decnum);
        }
        public static void main(String[] args) {
            btod(101);
        }
    }

    

