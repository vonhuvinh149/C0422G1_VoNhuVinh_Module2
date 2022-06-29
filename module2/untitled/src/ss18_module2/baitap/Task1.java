package ss18_module2.baitap;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String regex = "^[(A|C|P)][0-9]{4}[G|H|I|K|L|M]$";
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập tên lớp ");
        String myClass = scanner.nextLine();
        boolean matches = myClass.matches(regex);
        if (matches){
            System.out.println("tên lớp là: "+ myClass);
        }else {
            System.out.println("tên lớp lp hợp lệ");
        }
    }
}
