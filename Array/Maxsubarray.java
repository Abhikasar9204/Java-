package Array;
public class Maxsubarray {
    public static void Maxsubarray(int n[]){
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<n.length;i++){
            int start=i;
            for(int j=i;j<n.length;j++){
                int end=j;
                int sum=0;
                for(int k=start;k<end;k++){
                    System.out.print(n[k]+" ");
                    sum=sum+n[k];
                }
                System.out.println("="+sum);
                if(maxsum<sum){
                    maxsum=sum;
                }
            }
        }
        System.out.println("Maxisum sum of in subarray are="+maxsum);
    }
    public static void main(String args[]){
        int n[]={2,4,6,8,10,12,14,16};
        Maxsubarray(n);
    }
}
