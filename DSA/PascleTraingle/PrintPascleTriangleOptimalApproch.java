package AdvArray;
import java.util.Scanner;
public class PrintPascleTriangleOptimalApproch {
    public static void printPascleTrianglever1(long n){
        long ans = 1;
        System.out.print(ans+" ");
        for(int i=1;i<n;i++){
            ans = ans*(n-i);
            ans = ans/i;
            System.out.print(ans+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();
        printPascleTrianglever1(n);   
    }
}
