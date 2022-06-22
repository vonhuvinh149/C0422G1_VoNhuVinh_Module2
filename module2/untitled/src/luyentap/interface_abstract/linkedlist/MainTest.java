package luyentap.interface_abstract.linkedlist;

import java.util.*;

public class MainTest {
    public static void main(String[] args) {

           //ví dụ linkedlisst
//        Queue<String> danhSachSV = new LinkedList<String>();
//        danhSachSV.offer("vonhuvinh1");
//        danhSachSV.offer("nguyenvanA");
//        danhSachSV.offer("nguyenvanB");
//
//        while (true){
//            String ten = danhSachSV.poll();    // peek lấy ra nhưng k xoá
//            if (ten == null){
//                break;
//            }
//            System.out.println(ten);
//
//        }


        // ví dụ PriorityQueue sắp xếp
//        Queue<String> danhSachSV = new PriorityQueue<String>();
//        danhSachSV.offer("vonhuvinh1");
//        danhSachSV.offer("nguyenvanA");
//        danhSachSV.offer("nguyenvanB");
//
//        while (true) {
//            String ten = danhSachSV.poll();    // peek lấy ra nhưng k xoá
//            if (ten == null) {
//                break;
//            }
//            System.out.println(ten);
//        }


        // ví dụ DeQueue
        Deque<String> danhSachSV = new ArrayDeque<String>();


        danhSachSV.offer("võ nhu vinh 1");
        danhSachSV.offer("võ nhu vinh 2");
        danhSachSV.offerFirst("võ nhu vinh 3");
        danhSachSV.offerLast("võ như vinh 4");

        while (true){
            String ten = danhSachSV.poll();
            if (ten == null){
                break;
            }
            System.out.println(ten);
        }
    }
}



