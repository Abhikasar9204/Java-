package Array;
import java.util.*;
public class inputArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int Maths=sc.nextInt();
        int English=sc.nextInt();
        int History=sc.nextInt();

        int Subjectmarks[]={Maths,English,History};
        for(int i=0;i<Subjectmarks.length;i++){
            System.out.print(Subjectmarks[i]+" ");
        }
    }
}
