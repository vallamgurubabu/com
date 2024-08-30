package AdvArray.PascleTraingle;
import java.util.Scanner;
public class NcrOptimalFormula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long r = sc.nextLong();
        sc.close();
        System.out.println(ncr(n,r)); 
    }
    public static long ncr(long n,long r){
          long res=1;
          for(int i=0;i<r;i++){
            res =res*(n-i);
            res =res/(i+1);
          }
          return res;
    }
    
}
