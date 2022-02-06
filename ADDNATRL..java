import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scin = new Scanner(System.in);
        long n = scin.nextInt();
        System.out.println(n*(n+1)/2);
    }
}