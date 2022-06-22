package ss12_module2.baitap.service.iplm;

import ss12_module2.baitap.Model.Product;
import ss12_module2.baitap.service.IProduct;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ProductService implements IProduct {
    Scanner scanner = new Scanner(System.in);
    private static ArrayList<Product> list = new ArrayList<>();
    @Override
    public void add() {
        System.out.println("nhập thông tin sản phẩm");
        System.out.println("nhập mả sản phẩm");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập tên sản phẩm");
        String name = scanner.nextLine();
        System.out.println("nhập giá sản phẩm");
        Double price = Double.parseDouble(scanner.nextLine());
        Product product = new Product(id, name, price);
        list.add(product);
    }

    @Override
    public void display() {
        for (Product x : list) {
            System.out.println(x);
        }
    }

    @Override
    public void edit(int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                System.out.println("Sửa mã sản phẩm: ");
                list.get(i).setId(Integer.parseInt(scanner.nextLine()));
                System.out.println("Sửa tên sản phẩm: ");
                list.get(i).setName(scanner.nextLine());
                System.out.println("Sửa giá sản phẩm: ");
                list.get(i).setPrice(Double.parseDouble(scanner.nextLine()));
                return;
            }
        }
    }

    @Override
    public boolean remove(Product product) {
        return list.remove(product);
    }

    @Override
    public void search(String name) {
        for (Product x : list) {
            if (x.getName().indexOf(name) >= 0) {
                System.out.println(x);
            }
        }
    }

    @Override
    public void sort() {
        Collections.sort(this.list, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrice() < o2.getPrice()){
                    return 1;
                }else if (o1.getPrice() > o2.getPrice()){
                    return -1;
                }else {
                    return 0;
                }
            }
        });

    }
}
