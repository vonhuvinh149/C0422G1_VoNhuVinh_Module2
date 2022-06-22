package ss4_module2.luyentap2;

import java.util.Scanner;

public  class Animal {
     public int id;
     public String name;
    public  Animal(int id, String name) {
         this.id = id;
        this.name = name + " là học sinh giỏi ";
    }

    public Animal() {

    }

   public  int getId() {
        return id;
    }

   public   void setId(int id) {
        this.id = id;
    }

  public String getName() {
        return name;
    }

  public void setName(String name) {
        this.name = name;
    }
    public void getVinh(){
        System.out.println("name "+this.name);
    }
    public void getH(){
        System.out.println("id "+ this.id);
    }
}


