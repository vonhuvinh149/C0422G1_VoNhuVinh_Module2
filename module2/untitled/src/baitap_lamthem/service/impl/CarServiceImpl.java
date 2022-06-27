package baitap_lamthem.service.impl;

import baitap_lamthem.model.Car;
import baitap_lamthem.service.Service;
import java.util.ArrayList;
import java.util.Scanner;
public class CarServiceImpl implements Service {
    ArrayList<Car> carArrayList = new ArrayList<>();
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
        System.out.println("nhập số chỗ ngồi");
        int choNgoi = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập kiểu xe");
        String kieuXe = scanner.nextLine();
        Car car = new Car(bienSo, hangSX, namSX, chuSH, choNgoi, kieuXe);
        carArrayList.add(car);
    }
    @Override
    public void display() {
        for (Car x : carArrayList) {
            System.out.println(x);
        }
    }

    @Override
    public void editTransport() {
        String num = scanner.nextLine();
        for (Car s : carArrayList) {
            if (s.getBienSo().equals(num)) {
                System.out.println("sửa biển số cần sửa");
                s.setBienSo(scanner.nextLine());
                System.out.println("sửa hãng sản xuất");
                s.setHangSX(scanner.nextLine());
                System.out.println("sửa năm sản xuất");
                s.setNamSX(Integer.parseInt(scanner.nextLine()));
                System.out.println("sửa tên chủ sở hữu");
                s.setChuSH(scanner.nextLine());
                System.out.println("sửa trọng tải");
                s.setChoNgoi(Integer.parseInt(scanner.nextLine()));
                System.out.println("sửa kiểu xe");
                s.setKieuXe(scanner.nextLine());
            }
        }
    }

        @Override
        public void searchTransport () {
            String num = scanner.nextLine();
            for (Car s: carArrayList){
                if (s.getBienSo().equals(num)){
                    System.out.println(s);
                }
            }
        }

        @Override
        public void removeTransport () {

        }

    }
