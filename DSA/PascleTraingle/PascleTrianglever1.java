package AdvArray;
import java.util.Scanner;
public class PascleTrianglever1 {
    public static long pascleTrianglever1(long r,long c){
       return ncr(r-1,c-1);
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
        long r = sc.nextLong();
        long c = sc.nextLong();
        sc.close();
        System.out.println(pascleTrianglever1(r,c)); 
    }
    
    
}
