package ss5.baitap.Student;


import java.util.Scanner;

public class Student {
    private String name;
    private String classes;
    public Student() {

    }

//    public Student(String name, String classes) {
//        this.name = name;
//        this.classes = classes;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   public String getClasses() {

        return classes;

    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public void display() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập tên ");
        name = scanner.nextLine();
        System.out.println("nhập lớp ");
        classes = scanner.nextLine();
        Student student = new Student();
    }

    public String myToString() {
        return "Student{" +
                "name='" + this.name + '\'' +
                ", classes='" + this.classes + '\'' +
                '}';
    }
}
