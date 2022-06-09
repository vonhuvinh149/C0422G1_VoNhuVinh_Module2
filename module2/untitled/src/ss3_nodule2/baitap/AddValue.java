package ss3_nodule2.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class AddValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập độ dài mảng");
        int length = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Nhap phan tu vao mang tại index " + i);
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("arr = "+Arrays.toString(arr));
        System.out.println("Nhap so can chen");
        int num = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap vi tri index can chen");
        int index = Integer.parseInt(scanner.nextLine());
        if (index < 0 || index > arr.length - 1) {
            System.out.println("Vi tri khong ton tai");
        } else {
            for (int i = arr.length - 1; i > index; i--) {
                arr[i] = arr[i - 1];
            }
            arr[index] = num;
        }
        System.out.println("arr = "+ Arrays.toString(arr));
    }
}
