/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai2t3;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Bai2t3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        
        System.out.println("enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int sum = sum(arr);
        int product = product(arr);
        int average = average(arr);
        
        System.out.println("Array: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println("");
        System.out.println("sum: " + sum);
        System.out.println("product: " + product);
        System.out.println("average: " + average);
    }

    private static int sum(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    private static int product(int[] arr) {
        int product = 1;
        for(int i = 0; i < arr.length; i++) {
            product *= arr[i];
        }
        return product;
    }

    private static int average(int[] arr) {
        int sum = sum(arr);
        return (int) ((float) sum / arr.length);
    }   
}
