/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai6t3;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Bai6t3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        
        System.out.println("Enter the elements: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        
        System.out.println("Enter the position to insert (0 - " + (n - 1) + " ):");
        int p = sc.nextInt();
        
        System.out.println("Enter the value to insert: ");
        int v = sc.nextInt();
        
        n++;
        for(int i = n - 1; i <= p; i--) {
        arr[i] = arr[i - 1] ;
        }
        arr[p] = v;
            System.out.println("Value " + v + " inserted at position " + p + ".");
        
        System.out.println("Array: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println("");
    }
}
