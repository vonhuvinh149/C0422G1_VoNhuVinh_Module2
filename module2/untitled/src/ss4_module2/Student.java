package ss4_module2;

import java.util.Scanner;

public class Student {
    private int id; // thuộc tính biến toàn cục
    private String name;
    String address;
    String email;
    boolean gender;

    // contructor ko tham số
    public Student() {

    }

    public Student(int id, String name, String address, String email, boolean gender) {
this(id,name);
//        this.id = id ;
//        this.name = name ;
        this.address = address ;
        this.email = email ;
        this.gender = gender ;
    }
    // contructor 2 tham số
    public  Student(int id , String name){
        this.id = id ;
        this.name = name ;
    }
    public int getId(){
        return id ;
    }
    public String getName(){
        return name ;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public boolean getGender() {
        return gender;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
    public void setName(){
        this.name = name ;
    }
    public void Study(String subject){
        System.out.println("học sinh "+ this.name+" đang học mon " + subject);
    }
}
