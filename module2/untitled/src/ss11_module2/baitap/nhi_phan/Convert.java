package ss11_module2.baitap.nhi_phan;

import java.util.Scanner;
import java.util.Stack;

public class Convert {
    public static void main(String[] args) {
        Stack<Integer> stackSurPlus = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập 1 số nguyên từ bàn phím");
        int number = Integer.parseInt(scanner.nextLine());
        while (number > 0) {
            int surPlus = number % 2;
            stackSurPlus.push(surPlus);
            number = number / 2 ;
        }
        while (!stackSurPlus.isEmpty()){
            System.out.println(stackSurPlus.pop());
        }
    }
}
