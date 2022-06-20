package ss11_module2.baitap.dao_nguoc;

import java.util.Scanner;
import java.util.Stack;

public class Reverse {
    public static void main(String[] args) {
        Stack<String> stringStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhập chuỗi kí tự ");
        String s = scanner.nextLine();

        // đảo ngược theo từ

        System.out.println("đảo ngược theo từ");
        String[] arr = s.split(" ");
        for (int i = 0; i < arr.length; i++) {
            stringStack.push(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(stringStack.pop() + " ");
        }

        // đảo ngược từng kí tự

        System.out.println("\n đảo ngựơc từng kí tự ");
        for (int i = 0; i < s.length(); i++) {
            stringStack.push(s.charAt(i) + "");
        }
        for (int i = 0; i < s.length(); i++) {
            System.out.print(stringStack.pop());
        }
    }
}
