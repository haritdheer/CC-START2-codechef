import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc= new Scanner(System.in);
	    long N=sc.nextInt();
	    long sum=0;
	    long add=0;
	    
	    for(long i=1; i<=2*N-1; i=i+2){
	        sum=sum+i;
	        
	        
	        
	        }
	        System.out.print(sum);
	        System.out.print(" ");
	        
	        for(long j=2; j<=2*N; j=j+2){
	            add=add+j;
	        }
	       System.out.print(add);
		
	}
}