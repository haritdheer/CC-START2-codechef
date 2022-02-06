 import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
           int b=sc.nextInt();
              int c=sc.nextInt();
              
             float S=(a+b+c)/2;
             float K=S*(S-a)*(S-b)*(S-c);
             float H=(int) Math.pow(K,0.5);
             
             if(H>0){
              
              if((a+b>c)||(a+c>b)||(b+c>a)){
                  System.out.println("YES");
                  
              }
              else{
                  System.out.println("NO");
              }
             }
             else{
                 System.out.println("NO");
             }
    }
}