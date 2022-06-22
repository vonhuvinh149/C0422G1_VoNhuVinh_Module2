package luyentap.interface_abstract.student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("nhập id");
            String id = scanner.nextLine();
            System.out.println("nhập tên");
            String name = scanner.nextLine();
            System.out.println("nhập địa chỉ");
            String address = scanner.nextLine();
            System.out.println("nhập tuổi");
            int age = Integer.parseInt(scanner.nextLine());
            students.add(new Student(id,name,address,age));
        }


        Collections.sort(students);
        showInfo(students);
    }

    public static void showInfo(ArrayList<Student> list) {
        for (Student student : list) {
            System.out.println(student);
        }
    }
}
