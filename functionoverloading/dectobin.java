public class dectobin {
    public static void btod(int n){
        int mynumber=n;
        int pow =0;
        int decnum=0;
        
        while (n>0) {
            int lastdigit=n%2;
            decnum=decnum+(lastdigit*(int)Math.pow(10, pow));

            pow ++;
            n=n/2;
        } 
            System.out.println("decimal of "+mynumber + " = " +decnum);
        }
        public static void main(String[] args) {
            btod(5);
        }
    }

    

