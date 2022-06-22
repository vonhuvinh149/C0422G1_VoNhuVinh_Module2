package luyentap.interface_abstract.demoStudent;

import java.util.Scanner;

public class Student {
    private int id ;
    private String name ;
    private String address ;
    private String email;
    private Boolean gender;
    public static String school = "CodeGym" ;
    Scanner scanner =new Scanner(System.in);
    public Student(){

    }
    public Student(int id, String name, String address, String email, Boolean gender) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public static String getSchool() {
        return school;
    }

    public static void setSchool(String school) {
        Student.school = school;
    }
    public void disPlay(){
        System.out.println("nhập id ");
         id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập tên");
         name =scanner.nextLine();
        System.out.println("nhập địa chỉ ");
         address =scanner.nextLine();
        System.out.println("nhập email");
         email =scanner.nextLine();
        System.out.println("nhập giới tính");
         gender =scanner.nextBoolean();
    }
    @Override
    public String toString() {
        return "id : " + this.id +", tên : "+ this.name +", địa chỉ : " + this.address + ", email: " + this.email +",gới tính của bạn là Nam : "+this.gender ;
    }
}
