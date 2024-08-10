/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.test;

import java.util.Scanner;


/**
 *
 * @author ADMIN
 */
public class test1 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n;
        int arr[] = new int[100];
        
        do {
            System.out.println("nhap n: ");
            n = sc.nextInt();
        } while(n < 3 || n > 50);
                
        nhap(arr, n);      
        
        if(task1(arr, n)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        task2(arr, n);
        sapXepMang(arr, n);
    }

    private static void nhap(int[] arr, int n) {
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }

    private static boolean task1(int[] arr, int n) {
        for(int i = 0; i < n - 1; i++) {
            if(arr[i] % 2 == 0 && arr[i + 1] % 2 == 0) {
                return true;
            }
        }
        return false;
    }

    private static void task2(int[] arr, int n) {
        int mangChan[] = new int[n];
        int mangLe[] = new int[n];
        int chan = 0;
        int le = 0;
        
        for(int i = 0; i < n; i++) {
            if(arr[i] % 2 == 1) {
                mangLe[le++] = arr[i];
            } else if(arr[i] != 0) {
                mangChan[chan++] = arr[i];
            }
        }
        
        if(le == 0 || chan == 0 ) {
            System.out.println("-1");
        }else {
            for(int i = 0; i < le; i++) {
                System.out.print(mangLe[i] + " ");
            }
            System.out.print("- ");
            
            for(int i = 0; i < chan; i++) {
                System.out.print(mangChan[i] +" ");
            }
        }
    }

    private static void sapXepMang(int[] arr, int n) {
        for(int i = 0; i < n - 1; i++) {
            for(int j = i; j < n; j++) {
                if(arr[i] > arr[j]) {
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("");
    }
    
    
}
