package luyentap.interface_abstract.demoStudent;

import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số lượng học sinh");
        int length = Integer.parseInt(scanner.nextLine());
        Student[] arr = new Student[length];
        for (int i = 0; i < arr.length; i++) {
           arr[i] = new Student();
           arr[i].disPlay();
           System.out.println(arr[i].toString());
        }
    }
}
