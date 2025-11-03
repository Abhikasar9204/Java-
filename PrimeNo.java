import java.util.*;
public class PrimeNo {
    public static boolean isprime(int n){
        if(n==2){
            return true;
        }
        for(int i=2;i<n-1;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); 
        if(isprime(n)==false){
            System.out.println("It is not a Prime No.");
        }else{
            System.out.println("It is a Prime No.");
        }
    }
}
