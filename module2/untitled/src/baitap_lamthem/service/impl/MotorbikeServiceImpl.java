package baitap_lamthem.service.impl;

import baitap_lamthem.model.Motorbike;
import baitap_lamthem.model.Truck;
import baitap_lamthem.service.Service;

import java.util.ArrayList;
import java.util.Scanner;

public class MotorbikeServiceImpl implements Service {
    ArrayList<Motorbike> motorbikesArrayList = new ArrayList<>();
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
        System.out.println("nhập công suất");
        int congSuat = Integer.parseInt(scanner.nextLine());
        Motorbike motorbike = new Motorbike(bienSo, hangSX, namSX, chuSH, congSuat);
        this.motorbikesArrayList.add(motorbike);
    }

    @Override
    public void display() {
        for (Motorbike x : motorbikesArrayList) {
            System.out.println(x);
        }
    }

    @Override
    public void editTransport() {
        String num = scanner.nextLine();
        for (Motorbike s: motorbikesArrayList){
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
                s.setCongSuat(Integer.parseInt(scanner.nextLine()));
            }
        }
    }

    @Override
    public void searchTransport() {
        String num = scanner.nextLine();
        for (Motorbike s: motorbikesArrayList){
            if (s.getBienSo().equals(num)){
                System.out.println(s);
            }
        }}


    @Override
    public void removeTransport() {

    }

    @Override
    public String toString() {
        return "MotorbikeServiceImpl{" +
                "motorbikesArrayList=" + motorbikesArrayList +
                ", scanner=" + scanner +
                '}';
    }
}
