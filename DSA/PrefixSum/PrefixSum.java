package com.DSA.PrefixSum;

import java.util.Scanner;

class PrefixSum{
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int [] arr = new int[n];
         for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
         } 
         sc.close();
        prefixSum(arr);
         

    }
    public static void prefixSum(int arr[]){
        int n = arr.length;
        int [] prefix = new int[n];
        prefix[0] = arr[0];
        for(int i=1;i<n;i++){
            prefix[i] = prefix[i-1]+arr[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(prefix[i]+" ");
         }
    }
}