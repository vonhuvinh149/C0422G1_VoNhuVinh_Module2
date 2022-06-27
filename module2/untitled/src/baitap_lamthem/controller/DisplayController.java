package baitap_lamthem.controller;

import baitap_lamthem.model.Car;
import baitap_lamthem.service.impl.CarServiceImpl;
import baitap_lamthem.service.impl.MotorbikeServiceImpl;
import baitap_lamthem.service.impl.TruckServiceImpl;

import java.util.Scanner;

public class DisplayController {

    public static void DisplayMainMenu() {
        CarServiceImpl carService = new CarServiceImpl();
        TruckServiceImpl truckService = new TruckServiceImpl();
        MotorbikeServiceImpl motorbikeService = new MotorbikeServiceImpl();
        Scanner sc = new Scanner(System.in);
        int option;
        do {
            System.out.println("-----Menu------");
            System.out.println("1. Thêm mới phương tiện.\n" +
                    "2. Hiện thị phương tiện\n" +
                    "3. Xóa phương tiện\n" +
                    "4. Tìm kiếm theo biển kiểm soát\n" +
                    "0. Thoát\n");
            System.out.println("nhập lựa chọn");
            option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case 1:
                    AddTransport();
                    break;
                case 2:
                    DisplayTransport();
                    break;
                case 3:

                case 4:
                    carService.editTransport();
                    motorbikeService.editTransport();
                    truckService.editTransport();
                    break;
            }
        } while (option != 0);
    }

    public static void AddTransport() {
        CarServiceImpl carService = new CarServiceImpl();
        TruckServiceImpl truckService = new TruckServiceImpl();
        MotorbikeServiceImpl motorbikeService = new MotorbikeServiceImpl();
        Scanner sc = new Scanner(System.in);
        int option2;
        do {
            System.out.println("chọn xe muốn thêm");
            System.out.println("1. thêm oto\n" +
                    "2. thêm xe tải \n" +
                    "3. thêm xe máy \n" +
                    "0. exit");
            System.out.println("nhập sự lựa chọn");
            option2 = Integer.parseInt(sc.nextLine());
            switch (option2) {
                case 1:
                    carService.addTransport();
                    break;
                case 2:
                    truckService.addTransport();
                    break;
                case 3:
                    motorbikeService.addTransport();
                    break;
            }
        } while (option2 != 0);
    }

    public static void DisplayTransport() {
        Scanner sc = new Scanner(System.in);
        int option2;
        do {
            System.out.println("chọn xe muốn hiển thị");
            System.out.println("1. hiển thị oto\n" +
                    "2. hiển thị xe tải \n" +
                    "3. hiển thị xe máy \n" +
                    "0. exit");
            System.out.println("nhập sự lựa chọn");
            option2 = Integer.parseInt(sc.nextLine());
            switch (option2) {
                case 1:
                    CarServiceImpl carService = new CarServiceImpl();
                    carService.display();
                    break;
                case 2:
                    TruckServiceImpl truckService = new TruckServiceImpl();
                    truckService.display();
                    break;
                case 3:
                    MotorbikeServiceImpl motorbikeService = new MotorbikeServiceImpl();
                    motorbikeService.display();
                    break;
            }
        } while (option2 != 0);
    }
}
