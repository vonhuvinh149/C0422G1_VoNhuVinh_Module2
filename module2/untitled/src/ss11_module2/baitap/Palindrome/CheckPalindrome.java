package ss11_module2.baitap.Palindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class CheckPalindrome {
    private static boolean Palindrome(String string){
        string = string.toLowerCase();

        Stack<Character> stack = new Stack<>();
        Queue<Character> characters = new LinkedList<>();

        for (int i = string.length()-1; i >= 0 ; i--) {
            characters.add(string.charAt(i));
            stack.push(string.charAt(i));
        }


        boolean result = false;
        while (!characters.isEmpty()){
            if (stack.pop() == characters.poll()){
                result = true;
            }else {
                result = false;
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chuỗi kí tự");
        String string = scanner.nextLine();
        System.out.println(Palindrome(string));
    }
}
