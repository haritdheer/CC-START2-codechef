import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        
         float s=(a+b+c)/2;
        float K=s*(s-a)*(s-b)*(s-c);
        float A= (int) Math.pow(K,0.5);
        
         if(A>0){
            if((a+b>c)&&(a+c>b)&&(b+c>a)){
        if((a==b)&&(b==c)&&(c==a)){
            System.out.println("1");
        }
        else if((a==b)||(b==c)||(c==a)){
            System.out.println("2");
            
        }
        else{
            System.out.println("3");
        }
    }
}
else{
                System.out.println("-1");
            }
    }
}
 