package ss14_module2.baitap.insertion_sort;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
          int  pos = i;
          int   x = array[pos];
            while (pos > 0 && x < array[pos - 1]) {
                array[pos] = array[pos - 1];
                pos--;
                System.out.println(Arrays.toString(array));
            }
            array[pos] = x;
            System.out.println(Arrays.toString(array));
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều dài của mảng:");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập phần tử tại index :  " + i);
            array[i] = scanner.nextInt();
        }
        insertionSort(array);
        System.out.println("Mảng sau khi sắp xếp");
        System.out.println(Arrays.toString(array));
    }

}
