//package ss12_module2.baitap.baitap1;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.Scanner;
//
//public class ProductManager {
//    Scanner scanner = new Scanner(System.in);
//    private ArrayList<Product> list;
//
//    public ProductManager(ArrayList<Product> list) {
//        this.list = list;
//    }
//
//    public ProductManager() {
//        this.list = new ArrayList<Product>();
//    }
//
//    public ArrayList<Product> getList() {
//        return list;
//    }
//
//    public void setList(ArrayList<Product> list) {
//        this.list = list;
//    }
//
//    // thêm sản phẩm
//    public void add(Product product) {
//        this.list.add(product);
//    }
//
//    // in sản phẩm
//
//    public void outPut() {
//        for (Product x : list) {
//            System.out.println(x);
//        }
//    }
//
//    // xoá sản phẩm theo id
//
//    public boolean remove(Product product) {
//        return this.list.remove(product);
//    }
//
//
//    // tìm kiếm
//    public void search(String name) {
//        for (Product x : list) {
//            if (x.getName().indexOf(name) >= 0) {
//                System.out.println(x);
//            }
//        }
//    }
//
//
//    // sắp xếp
//    public void sort() {
//        Collections.sort(this.list, new Comparator<Product>() {
//            @Override
//            public int compare(Product o1, Product o2) {
//                if (o1.getPrice() > o2.getPrice()) {
//                    return 1;
//                } else if (o1.getPrice() < o2.getPrice()) {
//                    return -1;
//                } else {
//                    return 0;
//                }
//            }
//        });
//
//    }
//
//    // cập nhât sản phẩm
//    public void edit(int id) {
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i).getId() == id) {
//                System.out.println("Sửa mã sản phẩm: ");
//                list.get(i).setId(Integer.parseInt(scanner.nextLine()));
//                System.out.println("Sửa tên sản phẩm: ");
//                list.get(i).setName(scanner.nextLine());
//                System.out.println("cập nhật hạn sử dụng");
//                list.get(i).setExpiry(Integer.parseInt(scanner.nextLine()));
//                System.out.println("Sửa giá sản phẩm: ");
//                list.get(i).setPrice(Double.parseDouble(scanner.nextLine()));
//                return;
//            }
//        }
//    }
//}
//
//
