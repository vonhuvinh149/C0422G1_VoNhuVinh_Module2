package ss12_module2.baitap.controller;

import ss12_module2.baitap.Model.Product;
import ss12_module2.baitap.service.iplm.ProductService;

import java.util.Scanner;

public class MainProduct {
    public static void displayMainMenu() {
        ProductService productService = new ProductService();
        Scanner sc = new Scanner(System.in);
        int option ;
        do {
            System.out.println("----Menu----");
            System.out.println("1. Thêm sản phẩm \n " +
                    "2. In sản phẩm \n" +
                    "3. xoá sản phẩm \n" +
                    "4. tìm kiếm sản pẩm \n" +
                    "5. sắp xếp \n" +
                    "6. Cập nhật sản phẩm \n" +
                    "0. exit");
            System.out.println("nhập sự lựa chọn ");
            option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case 1:
                    productService.add();
                    break;
                case 2:
                    productService.display();
                    break;
                case 3:
                    System.out.println("nhập mả sản phẩm muốn xoá");
                    int id = Integer.parseInt(sc.nextLine());
                    Product product = new Product(id);
                    productService.remove(product);
                    break;
                case 4:
                    System.out.println("nhập tên sản phẩm");
                    String name = sc.nextLine();
                    productService.search(name);
                    break;
                case 5:
                    productService.sort();
                    break;
                case 6:
                    System.out.println("nhập id sản phẩm muốn sửa");
                    id = Integer.parseInt(sc.nextLine());
                    productService.edit(id);
                    break;
            }
        }while (option != 0);
    }
}