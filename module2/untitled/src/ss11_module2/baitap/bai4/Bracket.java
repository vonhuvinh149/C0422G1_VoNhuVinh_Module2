package ss11_module2.baitap.bai4;

import java.util.Scanner;
import java.util.Stack;

public class Bracket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập kí tự ");
        String expression = scanner.nextLine();
        Stack<Character> characterStack = new Stack<>();
        boolean isExpression = true;
        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '(') {
                characterStack.push(expression.charAt(i));
            } else if (expression.charAt(i) == ')') {
                if (characterStack.isEmpty()) {
                    isExpression = false;
                    break;
                } else {
                    characterStack.pop();
                }
            }
        }
        if (!isExpression) {
            System.out.println("False ");
        } else if (characterStack.isEmpty()) {
            System.out.println(" True ");
        } else {
            System.out.println(" False ");
        }

    }
}
