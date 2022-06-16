package Candidate;

import java.util.Scanner;

public class TestCandidate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số lượng thí sinh");
        int n = Integer.parseInt(scanner.nextLine());
        Candidate[] arr = new Candidate[n] ;

        for (int i = 0; i < arr.length; i++) {
            System.out.println("nhập thông tin thí sinh " + (i + 1));
            System.out.println("nhập id ");
            int id = Integer.parseInt(scanner.nextLine());
            System.out.println("nhập tên ");
            String name = scanner.nextLine();
            System.out.println("nhập ngày sinh");
            int date = Integer.parseInt(scanner.nextLine());
            System.out.println("nhập điểm môn toán ");
            double Toan = Double.parseDouble(scanner.nextLine());
            System.out.println("nhập điểm môn văn ");
            double Van = Double.parseDouble(scanner.nextLine());
            System.out.println("nhập điểm môn anh");
            double Anh = Double.parseDouble(scanner.nextLine());
            arr[i] = new Candidate(id,name,date,Toan,Van,Anh);
            if (arr[i].getSum() > 15){
                System.out.println(arr[i]);
            }
        }



    }
}
