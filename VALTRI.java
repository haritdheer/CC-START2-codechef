 import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        int N=sc.nextInt();
        
        if((N%5==0)||(N%6==0)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}