package AdvArray.Matrix2D;
import java.util.Scanner;
public class MatrixZeroOptimalApproch {
    public static int[][] matrixZero(int [][]matrix,int n,int m){
        int col0 = 1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    matrix[0][j] = 0;
                    if(j!=0){
                      matrix[i][0]=0;  
                    }else{
                        col0 = 0;
                    } 
                }
            }
        }   
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(matrix[i][j]!=0){
                    if(matrix[0][j]==0 ||matrix[i][0]==0){
                        matrix[i][j]=0;
                    }
                }   
            }
        } 
        if(col0==0){
           for(int i=0;i<n;i++){
            matrix[i][0] = 0;
           }
        }
        if(matrix[0][0]==0){
             for(int j=0;j<m;j++){
                matrix[0][j]=0;
             }
        }
        return matrix;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][] matrix = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
        } 
        sc.close();
        int ans[][] = matrixZero(matrix, n, m);
        System.out.println("====================Final Results =========================");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
