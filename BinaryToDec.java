public class BinaryToDec {
    public static void binartodec(int mynum){
        int binnum = mynum;
        int pow=0;
        int dec=0;
        while(binnum>0){
            int lastdigit=binnum%10;
            dec=dec+lastdigit*(int)Math.pow(2, pow);
            binnum=binnum/10;
            pow++;
        }
        System.out.println(dec);
    }
    public static void main(String args[]){
        binartodec(1001);
    }
}
