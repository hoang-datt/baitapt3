/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai5t3;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Bai5t3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        
        int arr[] = new int [n];
        
        System.out.println("Enter the elements: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Enter the position to remove (0 - " + (n - 1) + " )");
        int postition = sc.nextInt();
        if(postition >= 0 && postition <= n) {
            for(int i = postition; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            n--;
            System.out.println("Element at position " + postition + " removed.");
        }else {
            System.out.println("Invalid postition. ");
        }
        
        System.out.println("Array: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        
        System.out.println("");
    }
}
