/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.test4;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Test4 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        int arr[] = new int[100];

        do {
            System.out.println("nhap n: ");
            n = sc.nextInt();
        } while (n < 3 && n > 50);

        System.out.println("nhap phan tu: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0 && arr[i] != 0) {
                arr[i] /= 2;
            } else if (!soNguyenTo(arr[i])) {
                arr[i] = soNguyenTogan(arr[i]);
            }
        }
        
        System.out.println("mang sau khi thay doi: ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static boolean soNguyenTo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static int soNguyenTogan(int num) {
        int lowerPrime = num - 1;
        int higherPrime = num + 1;
        while (!soNguyenTo(lowerPrime)) {
            lowerPrime--;
        }
        while (!soNguyenTo(higherPrime)) {
            higherPrime++;
        }
        if ((num - lowerPrime) < (num - higherPrime)) {
            return lowerPrime;
        } else {
            return higherPrime;
        }
    }
}
