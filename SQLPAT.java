import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
        int count=0;
        
        for(int i=1; i<=N; i++){
            
            if(i%2!=0)
            {
                for(int j=1; j<=5; j++){
                    count=count+1;
                    System.out.print(count+" ");
                    
                }
            }
            else{
                int temp=count+1;
                for(int j=count+5;j>=temp;j--){
                    count=count+1;
                    System.out.print(j+" ");
                }
                
            }
            System.out.println();
        }
        
        
    }
}