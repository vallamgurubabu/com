package AdvArray;

import java.util.*;
public class PrintPascleTrangleUptoN {
    // Given the row number up to n. Print the n-th row of Pascal’s triangle
    public static void printPascleTrianglever1(long n){
        for(int i=1;i<=n;i++){
            for(long c=1;c<=i;c++){
                System.out.print(ncr(i-1,c-1)+" ");
            }
            System.out.println(" ");
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
