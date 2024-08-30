package AdvArray.PascleTraingle;
import java.util.Scanner;
public class PrintPascleTriangleUptoNOptimalApporach {
    public static void printPascleTriangleverOptimal(long n){
        for(int row = 1;row<=n;row++){
        long ans = 1;
        System.out.print(ans+" ");
        for(int i=1;i<row;i++){
            ans = ans*(row-i);
            ans = ans/i;
            System.out.print(ans+" ");
        } 
        System.out.println(" ");
    }

 }
    // public static void printAllrows(long n){
    //     for(int row = 1;row<=n;row++){
    //         printPascleTrianglever1(row);
    //         System.out.println(" ");
    //     }
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();
        printPascleTriangleverOptimal(n);   
    }
}
