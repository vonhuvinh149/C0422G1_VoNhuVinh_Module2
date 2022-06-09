package ss3_nodule2.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập độ dài của mảng");
        int a = scanner.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            System.out.println("nhập giá trị phần tử của mảng ở index " + i);
            arr[i] = scanner.nextInt();
        }
        System.out.println("arr =  " + Arrays.toString(arr));


        //  <-- thay dổi 1 phần tử trong mảng -->
//        arr[0] = 8 ;
//        System.out.println("arr =  " + Arrays.toString(arr));

        // <-- sắp xếp mảng -->
//          Arrays.sort(arr);
//        System.out.println("arr =  " + Arrays.toString(arr));
        int[] array = new int[7];
        System.arraycopy(arr,2,array,1,6);
        System.out.println("array =  " + Arrays.toString(array));

  //      <-- sao chép mảng -->




//      <--  kiểm tra 1 số có trong mảng không và in ra vị trí -->
//        System.out.println("nhập số bất kì");
//        int b = scanner.nextInt();
//        for(int j = 0; j < arr.length;j++) {
//            if(arr[j] == b) {
//                System.out.println("index của " + b + "trong mảng là : " + j);
//                break;
//            } else {
//                System.out.println("không có phần tử " + b + "trong mảng");
//                break;
//            }
//        }

    }

}
