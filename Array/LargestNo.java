package Array;
public class LargestNo {
    public static int largeNum(int n[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<n.length;i++){
            if(largest<n[i]){
                largest=n[i];
            }
        }
        return largest;
    }

    public static void main(String args[]){
        int n[]={12,34,3,5,56,90,36,78,99};
        int largestNum=largeNum(n);
        System.out.println("Largest Number in the Array is "+largestNum);
    }
}
