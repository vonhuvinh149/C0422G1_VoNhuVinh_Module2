package ss3_nodule2.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class MyMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap do dai mang");
        int length = Integer.parseInt(scanner.nextLine());
        int [] arr = new int [length];
        System.out.println("nhap phan tu mang");
        for (int i=0;i<arr.length;i++) {
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("arr = " + Arrays.toString(arr));
        int min = arr[0];
        for (int i=1;i<arr.length;i++){
            if (arr[i]<min) {
                min = arr[i];
            }
        }
        System.out.println( min  + " la so nho nhat");

    }
}
