package ss12_module2.baitap.baitap1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductManager list = new ProductManager();
        int option;
        do {
            System.out.println("----Menu----");
            System.out.println("1. Thêm sản phẩm \n " +
                    "2. In sản phẩm \n" +
                    "3. xoá sản phẩm \n" +
                    "4. tìm kiếm sản pẩm \n" +
                    "5. sắp xếp \n" +
                    "6. Cập nhật sản phẩm"+
                    "0. exit");
            System.out.println("nhập sự lựa chọn ");
            option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case 1:
                    System.out.println("--nhập thông tin sản phẩm--");
                    System.out.println("nhập mả sản phẩm ");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.println("nhập tên sản phẩm");
                    String name = sc.nextLine();
                    System.out.println("nhập hạn sử dụng");
                    int expiry = Integer.parseInt(sc.nextLine());
                    System.out.println("nhập giá sản phẩm");
                    double price = Double.parseDouble(sc.nextLine());
                    Product product = new Product(id, name, expiry, price);
                    list.add(product);
                    break;
                case 2:
                    list.outPut();
                    break;
                case 3:
                    System.out.println("nhập id sản pẩm muốn xoá");
                    id = Integer.parseInt(sc.nextLine());
                    product = new Product(id);
                    list.remove(product);
                    break;
                case 4:
                    System.out.println("nhập tên sản pẩm muốn tìm ");
                    name = sc.nextLine();
                    list.search(name);
                case 5:
                    list.sort();
                    break;
                case 6:
                    System.out.println("nhập mả sản phẩm muốn sửa");
                    id = Integer.parseInt(sc.nextLine());
                    list.edit(id);
            }

        } while (option != 0);
    }
}
