import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
       int L=sc.nextInt();
       int R=sc.nextInt();
       
       for(int i=L; i<=R; i++){
           
           if(i%2==1){
               System.out.println(i);
           }
       }
        
        
       
    }
}