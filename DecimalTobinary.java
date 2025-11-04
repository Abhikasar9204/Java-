public class DecimalTobinary {
    public static void dcitobin(int mynum){
        int binnum=mynum;
        int bin=0;
        int pow=0;
        while(binnum>0){
            int rem=binnum%2;
            bin=bin+rem*(int)Math.pow(10, pow);
            binnum=binnum/2;
            pow++;
        }
        System.out.println(bin);
    }
    public static void main(String args[]){
        dcitobin(7);
    }
}
