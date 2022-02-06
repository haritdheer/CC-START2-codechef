import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        
        if((N%5==0)&&(N%11==0)){
            System.out.println("BOTH");
        }
        else if((N%5==0)||(N%11==0)){
            System.out.println("ONE");
        }
        else{
            System.out.println("NONE");
        }
    }
}