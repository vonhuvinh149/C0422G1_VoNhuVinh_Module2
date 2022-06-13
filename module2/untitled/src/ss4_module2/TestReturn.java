package ss4_module2;

import java.util.Scanner;

public class TestReturn {
    public static void main(String[] args) {
      Student student1 = new Student();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập mả ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập tên");
        String b = scanner.nextLine();
        Student student2 = new Student(a , b);
        System.out.println("học viên "+ student2.getName());
        System.out.println("mả số "+ student2.getId());
        System.out.println("địa chỉ  "+ student2.getAddress());
        System.out.println("email : "+ student2.getEmail());
      System.out.println("gioiws tinh :" + student2.getGender());
    }
}
