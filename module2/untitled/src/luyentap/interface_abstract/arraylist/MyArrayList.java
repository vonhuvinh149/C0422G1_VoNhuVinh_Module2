package luyentap.interface_abstract.arraylist;

import ss4_module2.luyentap2.Animal;

import java.util.ArrayList;

public class MyArrayList {
    public static void main(String[] args) {
        ArrayList<Animal> animal =  new ArrayList<>();
        animal.add(new Animal());
        animal.add(new Animal());
        animal.add(new Animal());
        animal.add(new Animal());
        animal.add(new Animal());
        Animal a = animal.get(0);
        animal.set(1,new Animal());
        Animal[] arr = new Animal[5] ;
        animal.toArray(arr);
        System.out.println("size : " + animal.size());
        System.out.println("size2 " + arr.length);

    }
}
