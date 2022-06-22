package luyentap.interface_abstract.set;

import java.util.*;

public class TestMain {

        List<String> tapHopPhieu = new LinkedList<String>();

    public TestMain(List<String> tapHopPhieu) {
        this.tapHopPhieu = tapHopPhieu;
    }

    public TestMain() {
    }

    // thêm phiếu vào
    public boolean add(String gt) {
        return this.tapHopPhieu.add(gt);
    }

    // xoá phiếu
    public boolean xoaPhieu(String gt) {
        return this.tapHopPhieu.remove(gt);
    }

    // kiểu tra phiếu có tồn tại hay không
    public boolean kiemTra(String gt) {
        return this.tapHopPhieu.contains(gt);
    }

    // xoá tất cả phiếu
    public void xoaAll() {
        this.tapHopPhieu.clear();
    }

    // lấy sô lượng phiếu
    public int soLuong() {
        return this.tapHopPhieu.size();
    }

    // rút 1 phiếu
    public String rutPhieu() {
        String kq = "";
        Random rd = new Random();
        int viTri = rd.nextInt(this.tapHopPhieu.size());
        kq = (String) this.tapHopPhieu.toArray()[viTri];
        return kq;
    }


    // in ra màn hình
    public void inPhieu() {
        System.out.println(Arrays.toString(this.tapHopPhieu.toArray()));
    }


    public static void main(String[] args) {
        // rút thăm trúng thưởng hashset
        TestMain thungPhieu = new TestMain();
        Scanner scanner = new Scanner(System.in);
        int luaChon ;
        do {
            System.out.println("----Menu-----");
            System.out.println("1. Thêm mả số dự thưởng \n" +
                    "2. xoá mả số dự thưởng \n" +
                    "3. kiểm tra phiếu có tồn tại hay k \n" +
                    "4. xoá tất cả cá phiếu dự thưởng \n" +
                    "5. số lượng phiếu dự thưởng \n" +
                    "6. rút thăm trúng thưởng \n" +
                    "7. in ra \n" +
                    "0. thoát khỏi chương trình \n");


        System.out.println("lựa chọn chức năng");
         luaChon = Integer.parseInt(scanner.nextLine());

        switch (luaChon) {
            case 1:
                System.out.println("nhập vào mả dự thưởng");
                String gt = scanner.nextLine();
                thungPhieu.add(gt);
                break;
            case 2:
                System.out.println("nhập vào mả dự thưởng muốn xoá");
                gt = scanner.nextLine();
                thungPhieu.xoaPhieu(gt);
                break;
            case 3:
                System.out.println("nhập mả mả phiếu muốn kiểm tra");
                gt = scanner.nextLine();
                System.out.println("kết quả kiểm tra " + thungPhieu.kiemTra(gt));
                break;
            case 4:
                thungPhieu.xoaAll();
                break;
            case 5:
                System.out.println("số lượng phiếu dự thưởng " + thungPhieu.soLuong());
                break;
            case 6:
                System.out.println("mả só trúng thưởng " + thungPhieu.rutPhieu());
                break;
            case 7:
                System.out.println("các mả phiếu dự thưởng là ");
                thungPhieu.inPhieu();
        }
        } while (luaChon != 0);
    }
}
