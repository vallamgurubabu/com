// Given the row number n. Print the n-th row of Pascal’s triangle
package AdvArray;
import java.util.*;
public class PrintPascleTriangle {
    public static void printPascleTrianglever1(long n){
            for(long c=1;c<=n;c++){
                System.out.print(ncr(n-1,c-1)+" ");
            }  
    }
    public static long ncr(long n, long r){
        long res =1;
        for(int i=0;i<r;i++){
          res *= (n-i);
          res /= (i+1);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();
        printPascleTrianglever1(n); 
    }   
}
