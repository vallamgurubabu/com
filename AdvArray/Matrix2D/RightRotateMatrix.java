package AdvArray.Matrix2D;
import java.util.Scanner;
public class RightRotateMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] arr = new int[n][n]; 
        for(int i=0;i<n;i++){
           for(int j =0;j<n;j++){
            arr[i][j] = sc.nextInt();
           }
        }
        sc.close();
        rotateMatrix(arr,n);
        System.out.println("====================Final Results =========================");
        for(int  i =0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
    public static void rotateMatrix(int arr[][],int n){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for(int i=0;i<n;i++){
            int []  temp = arr[i];
            int j=0;
            int k = temp.length-1;
            while(j<=k){
                int t = temp[j];
                temp[j] = temp[k];
                temp[k] = t;
                j++;
                k--;
            }
            arr[i] = temp;
        }
    }
}
