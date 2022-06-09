package demomenu;

import java.util.Scanner;

public class menudemo {
    public static void main(String[] args) {
        displayMenu();
    }

    public static void displayMenu() {
        boolean flag = true;

        do {
            System.out.println("chức năng hệ thống" +
                    "\n 1.Display" +
                    "\n 2.add" +
                    "\n 3.edit" +
                    "\n 4.search" +
                    "\n 5.exit");
            Scanner scanner = new Scanner(System.in);
            System.out.println("chọn chức năng");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("chức năng hiển thị");
                    break;
                case 2:
                    System.out.println("chức năng thêm mới");
                    break;
                case 3:
                    System.out.println("chức năng cập nhật");
                    break;
                case 4:
                    System.out.println("chức năng tìm kiếm");
                    break;
                default:
                    flag = false;
            }
        } while (flag);
    }
}

