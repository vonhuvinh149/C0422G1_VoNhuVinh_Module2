package ss3_nodule2.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class Total {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập độ dài mảng 1");
        int a = Integer.parseInt(scanner.nextLine());
        int[] arr1 = new int[a];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Nhap phan tu mang 1 tại index " + i);
            arr1[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("nhập độ dài mảng 2");
        int b = Integer.parseInt(scanner.nextLine());
        int[] arr2 = new int[b];
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Nhap phan tu mang 2 tại index "+ 1);
            arr2[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("arr1 = " + Arrays.toString( arr1));
        System.out.println("arr2 = " +Arrays.toString(arr2));
        int[] array = new int[arr1.length + arr2.length];
        System.arraycopy(arr1,0,array,0,arr1.length);
        System.arraycopy(arr2,0,array,arr1.length,arr2.length);
        System.out.println("array = " +Arrays.toString(array));

    }
}
