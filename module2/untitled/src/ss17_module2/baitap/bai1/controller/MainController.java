package ss17_module2.baitap.bai1.controller;

import ss17_module2.baitap.bai1.service.impl.ProductServiceImpl;

import java.util.Scanner;

public class MainController {
    public static void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        ProductServiceImpl service = new ProductServiceImpl();
        System.out.println("---------Menu---------");
        String choose = "";
        do {
            System.out.println("1. add." +
                    "\n2. display." +
                    "\n3. search." +
                    "\n4. exit.");
            System.out.println("Enter your choice:");
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    service.add();
                    break;
                case "2":
                    service.display();
                    break;
                case "3":
                    service.search();
                    break;
                case "4":
                    System.out.println("-----End-----");
                    break;
                default:
                    System.out.println("just choice from 1 to 4.");
            }
        } while (choose != "4");
    }
}
