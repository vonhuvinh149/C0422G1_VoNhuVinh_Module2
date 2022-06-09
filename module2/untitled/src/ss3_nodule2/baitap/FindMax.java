package ss3_nodule2.baitap;

import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap số hàng");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap số cột");
        int col = Integer.parseInt(scanner.nextLine());
        int[][] arr = new int[row][col];
        System.out.println("Nhap phần tử của mảng");
        for (int i =0;i<row;i++) {
            for (int j=0;j<col;j++) {
                arr[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++) {
                System.out.print("Phan tu thu" + i + "-" + j + ":" + arr[i][j] + "\t");
            }
            System.out.println();
        }
        int max = arr[0][0];
        for (int i =0;i<arr.length;i++) {
            for (int j=0; j<arr[i].length;j++) {
                if (arr[i][j]>max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println(max + "la so lon nhat");
    }
}
