/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai4t3;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Bai4t3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        System.out.println("Enter the elements: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int count = count(arr);
        
        
        System.out.println("Array: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println("");
        System.out.println("The prime number in the array is: " + count);
        
    }

    private static int count(int[] arr) {
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(isPrime(arr[i])) {
                count++;
            }
        }
        return count;
    }

    private static boolean isPrime(int n) {
        if(n <= 1) {
            return false;
        }
        for(int i = 2; i < n; i++) {
            if( n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
