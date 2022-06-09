package ss3_nodule2.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class Delete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap do dai mang");
        int length = Integer.parseInt(scanner.nextLine());
        int[] arr1 = new int[length];
        System.out.println("nhap giá trị phần tử của mảng");
        for (int i =0;i< arr1.length;i++) {
            arr1[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("arr1 = "+Arrays.toString(arr1))  ;
        System.out.println("nhap giá trị phần tử của mảng");
        int num = Integer.parseInt(scanner.nextLine());
        for (int i=0;i<arr1.length;i++) {
            if (num == arr1[i]) {
                System.out.println("Vi tri cua" + arr1[i] + "la" + i);
                for (int j=i;j<arr1.length-1;j++){
                    arr1[j] = arr1[j+1] ;
                }
            }
        }
        arr1[arr1.length-1] = 0;
        System.out.println("arr1 ="+ Arrays.toString(arr1));

    }
}
