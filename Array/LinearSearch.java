package Array;
public class LinearSearch {
    public static int linearsearch(int n[],int key){
        for(int i=0;i<n.length;i++){
           if(n[i]==key){
              return i;
           }
        }
        return -1;
    }
    public static void main(String args[]){
        int n[]={12,34,78,10,34,90,21};
        int key=10;
        int index=linearsearch(n,key);
        if(index==-1){
            System.out.println("Key is not found");
        }else{
            System.out.println("index no is"+" "+index);
        }
    }
}
