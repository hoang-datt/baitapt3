/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.test2;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Test2 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n;
        int arr[] = new int[100];
        
        do {
            System.out.println("Nhap n: ");
            n = sc.nextInt();
        } while ( n < 3 || n > 50);
        
        nahp(arr, n);
        
        System.out.println("nhap so nguyen x: ");
        int x = sc.nextInt();
        
        int nhap = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] < x) {
                nhap++;
            }
        }
        
        int sum = 0;
        int chiaHetCho3 = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] % 3 == 0 && arr[i] % 5 != 0) {
                sum += arr[i];
                chiaHetCho3++;
            }
        }
        
        double tbCong = 0;
        if(chiaHetCho3 != 0) {
            tbCong = (double) sum / chiaHetCho3;
        }
        
        boolean tangDan = true;
        boolean giamDan = true;
        
        for(int i = 0; i < n; i++) {
            if(arr[i] < arr[i + 1]) {
                giamDan = false;
            }else if (arr[i] > arr[i + 1]) {
                tangDan = false;
            }
        }
        
        System.out.println("So phan tu co gia tri nho hon x: " + nhap);
        System.out.println("Trung binh cong cac so chia het cho 3 ma khong chia het cho 5: " + tbCong);
        
        if(giamDan || tangDan) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }

    private static void nahp(int[] arr, int n) {
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }
}
