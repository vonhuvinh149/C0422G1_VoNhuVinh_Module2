package ss3_nodule2.baitap;

import java.util.Scanner;

public class SumCol {
    public static void main(String[] args) {
        int i , j ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap hang");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap cot");
        int col = Integer.parseInt(scanner.nextLine());
        int[][] arr = new int[row][col];
        System.out.println("nhap ptu");
        for ( i = 0; i < row; i++) {
            for ( j = 0; j < col; j++) {
                arr[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        for ( i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                System.out.print("Phan tu thu" + i + "-" + j + ":" + arr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println(sumCol(arr));
    }

    public static int sumCol(int[][] arr) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap cot muon tinh");
        int col = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int k = 0; k < arr.length; k++) {
            for (int l = 0; l < arr[k].length; l++) {
                if ((col-1)==l){sum = sum + arr[k][col-1];
                }
            }
        }
        return sum;
    }
}
