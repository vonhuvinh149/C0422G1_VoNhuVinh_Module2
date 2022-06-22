package luyentap.interface_abstract.Stact;

import java.util.Scanner;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> stringStack = new Stack<String>();
        System.out.println("nhập vào 1 chuỗi");
        String s = scanner.nextLine();
        for (int i = 0; i < s.length(); i++) {
            stringStack.push(s.charAt(i) + " ");
        }
        for (int i = 0; i < s.length(); i++) {
            System.out.print(stringStack.pop());
        }

        // stringStack.push("giá trị")  -> đưa giá trị vao stack
        // stringStack.pop("giá trị")  -> lấy giá trị ra , xoá khỏi stack
        // stringStack.peek("giá trị")  -> lấy giá trị ra , ko xoá khỏi stack
        // stringStack.clear("giá trị")  -> xoá tất cả phần tử trong stack
        // stringStack.contains("giá trị")  -> xác định giá trị có tồn tại trong stack
        // stringStack.size()  -> lấy ra độ dài của stack


        // ví dụ đảo ngược chuỗi
//        System.out.println("nhập vào chuỗi");
//        String s = scanner.nextLine();
//        for (int i = 0; i < s.length(); i++) {
//            stringStack.push(s.charAt(i)+ "");
//        }
//        System.out.println("chuỗi đảo ngược");
//        for (int i = 0; i < s.length(); i++) {
//            System.out.println(stringStack.pop());
//        }

        // lấy ra độ lớn của stack


        /// ví dụ chuyển hệ thập phân qua hệ nhị phân
        Stack<Integer> stackSoDu = new Stack<Integer>();
        System.out.println("nhập 1 số nguyên từ bàn phím");
        int x = Integer.parseInt(scanner.nextLine());
        while (x > 0) {
            int soDu = x % 2;
            stackSoDu.push(soDu);
            x = x / 2;
        }
        int n = stackSoDu.size();
        System.out.println("số nhị phân là");
        for (int i = 0; i < n; i++) {
            System.out.println(stackSoDu.pop());
        }
    }
}
