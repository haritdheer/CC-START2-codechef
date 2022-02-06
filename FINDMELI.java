import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        int N=sc.nextInt();
        int K=sc.nextInt();
        int temp=0;
        int array[]=new int[N];
        
        for(int i=0;i<N;i++){
            array[i]=sc.nextInt();
            
        }
        for(int i=0; i<N;i++){
            if(array[i]==K){
                System.out.println("1");
                temp=1;
                break;
            }
        }
        if(temp==0){
            System.out.println("-1");
        }
    }
}