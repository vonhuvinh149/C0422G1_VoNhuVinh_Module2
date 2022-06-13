package ss5.baitap.Student;


import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số lượng học sinh");
        int length = Integer.parseInt(scanner.nextLine());
        Student[] s1 = new Student[length];
        for (int i = 0; i < s1.length; i++) {
            s1[i] = new Student();
            s1[i].display();
            System.out.println(s1[i].myToString());
        }
    }
}
