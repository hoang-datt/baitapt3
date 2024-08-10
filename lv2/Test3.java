/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.test3;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Test3 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        int arr[] = new int[100];

        do {
            System.out.println("nhap n: ");
            n = sc.nextInt();
        } while (n < 3 && n > 50);

        System.out.println("nhap so phan tu: ");
        nhap(arr, n);

        double sum = 0;
        int nhap = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
                nhap++;
            }
        }
        double tbCong = sum / nhap;
        if (nhap > 0) {
            System.out.println("tong trung binh cong: " + tbCong);
        } else {
            System.out.println("-1");
        }

        System.out.println("mang da sap xep tang dan: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] = (int) 1.23;
            }
        }

        System.out.println("mang sau khi chuyen doi: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    private static void nhap(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }
}
