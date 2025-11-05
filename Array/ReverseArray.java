package Array;
public class ReverseArray{
    public static int reverse(int n[]){
        int first=0;
        int last=n.length-1;
        while(first<last){
            int temp=n[last];
            n[last]=n[first];
            n[first]=temp;
            first++;
            last--;
        }
        return -1;
        
    }
    public static void main(String args[]){
        int n[]={2,4,6,8,10,12,14,16,18,20};
        reverse(n);
        for(int i=0;i<n.length;i++){
            System.out.print(n[i]+" ");
        }
        System.out.println();
    }
}