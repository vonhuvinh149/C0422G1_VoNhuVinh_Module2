package ss17_module2.baitap.bai1.service.impl;

import ss17_module2.baitap.bai1.common.ReadAndWriteBinaryFile;
import ss17_module2.baitap.bai1.model.Product;
import ss17_module2.baitap.bai1.service.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductServiceImpl implements Service {
    private final String PATH_FILE = "src/ss17_module2/baitap/bai1/common/product.dat";
    private final Scanner scanner = new Scanner(System.in);
    List<Product> products = new ArrayList<>();

    @Override
    public void add() {
        products = ReadAndWriteBinaryFile.readBinaryFile(PATH_FILE);

        try {
            System.out.println("Enter product code:");
            int code = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter product name:");
            String name = scanner.nextLine();
            System.out.println("Enter manufacture:");
            String manufacture = scanner.nextLine();
            System.out.println("Enter price:");
            double price = Double.parseDouble(scanner.nextLine());
            System.out.println("Enter others description");
            String othersDescription = scanner.nextLine();
            products.add(new Product(code, name, manufacture, price, othersDescription));
            ReadAndWriteBinaryFile.writeBinaryFile(products, PATH_FILE);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void display() {
        products = ReadAndWriteBinaryFile.readBinaryFile(PATH_FILE);
        for (Product p : products) {
            System.out.println(p);
        }
    }

    @Override
    public void search() {
        try {
            System.out.println("Enter product code you want to search:");
            int code = Integer.parseInt(scanner.nextLine());
            products = ReadAndWriteBinaryFile.readBinaryFile(PATH_FILE);
            for (Product p : products) {
                if (code == p.getCode()) {
                    System.out.println(p);
                }
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

    }}
