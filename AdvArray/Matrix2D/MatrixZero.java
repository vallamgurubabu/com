package AdvArray.Matrix2D;

import java.util.Scanner;

public class MatrixZero {
    public static void markrow(int [][]matrix,int m,int i){
           for(int j=0;j<m;j++){
            if(matrix[i][j]!=0){
                matrix[i][j] = -1;
            }
           }
    }
    public static void markcol(int [][]matrix,int n,int j){
           for(int i=0;i<n;i++){
            if(matrix[i][j]!=0){
                matrix[i][j]= -1;
            }
             
           }
    }
    public static int[][] matrixZero(int [][]matrix,int n,int m){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    markrow(matrix,m,i);
                    markcol(matrix,n,j);
                }
            }
        }   
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==-1){
                    matrix[i][j]=0;
                }
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
