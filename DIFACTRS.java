 import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
        int count=0;
        for(int i=1; i<=N; i++){
            if(N%i==0){
            count++;
            
             
            }
        }
            
            System.out.println(count);
            
             for(int j=1; j<=N; j++){
            if(N%j==0){
            
            System.out.println(j);
             
            }
        }
            
            
        
        
        
       
    }
}