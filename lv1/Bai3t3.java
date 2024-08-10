/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai3t3;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Bai3t3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        
        System.out.println("Enter the elements: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int count = count(arr, 3);
        
        System.out.println("Array: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println("");
        System.out.println("Number of times 3 appears in the array: " + count);
    }

    private static int count(int[] arr, int n) {
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == n) {
                count++;
            }
        }
        return count;
    }
}
