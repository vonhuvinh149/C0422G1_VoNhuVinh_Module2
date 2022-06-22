package baitap_lamthem;

import java.util.ArrayList;

public class DanhSachOTo {
    private ArrayList<OTo> danhSach1;


    public DanhSachOTo(ArrayList<OTo> danhSach1) {
        this.danhSach1 = danhSach1;
    }

    public DanhSachOTo() {
        this.danhSach1 = new ArrayList<OTo>();
    }


    // thêm phương tiện vào danh sách
    public void addOTo(OTo pt) {
        this.danhSach1.add(pt);
    }

    // in thông tin xe
    public void inOTo() {
        for (OTo x : danhSach1) {
            System.out.println(x);
        }
    }

    // xoá phương tiện
    public boolean xoa(OTo pt) {
        return this.danhSach1.remove(pt);
    }

    // tìm kiếm theo biển kiểm soát
    public void searchOTo(String bienSo) {
        for (OTo x : danhSach1) {
            if (x.getBienKiemSoat().indexOf(bienSo) >= 0) {
                System.out.println(x);
            }
        }
    }

}
