package baitap_lamthem.service.impl;

import baitap_lamthem.model.Truck;
import baitap_lamthem.service.Service;

import java.util.ArrayList;
import java.util.Scanner;

public class TruckServiceImpl implements Service {
    ArrayList<Truck> trucksArrayList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void addTransport() {
        System.out.println("nhập biển số xe");
        String bienSo = scanner.nextLine();
        System.out.println("nhập hảng sản xuát");
        String hangSX = scanner.nextLine();
        System.out.println("nhập năm sản xuất");
        int namSX = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập tên chủ sở hữu");
        String chuSH = scanner.nextLine();
        System.out.println("nhập trọng tải xe");
        int trongTai = Integer.parseInt(scanner.nextLine());
        Truck truck = new Truck(bienSo, hangSX, namSX, chuSH, trongTai);
        this.trucksArrayList.add(truck);
    }

    @Override
    public void display() {
        for (Truck x : trucksArrayList) {
            System.out.println(x);
        }
    }

    @Override
    public void editTransport() {
     String num = scanner.nextLine();
     for (Truck s: trucksArrayList){
         if (s.getBienSo().equals(num)){
             System.out.println("sửa biển số cần sửa");
             s.setBienSo(scanner.nextLine());
             System.out.println("sửa hãng sản xuất");
             s.setHangSX(scanner.nextLine());
             System.out.println("sửa năm sản xuất");
             s.setNamSX(Integer.parseInt(scanner.nextLine()));
             System.out.println("sửa tên chủ sở hữu");
             s.setChuSH(scanner.nextLine());
             System.out.println("sửa trọng tải");
             s.setTaiTrong(Integer.parseInt(scanner.nextLine()));
         }
     }
     display();
    }

    @Override
    public void searchTransport() {
        String num = scanner.nextLine();
        for (Truck s: trucksArrayList){
            if (s.getBienSo().equals(num)){
                System.out.println(s);
            }
    }}

    @Override
    public void removeTransport() {

    }
}
