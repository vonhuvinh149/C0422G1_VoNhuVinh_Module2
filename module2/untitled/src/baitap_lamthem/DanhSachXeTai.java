package baitap_lamthem;

import java.util.ArrayList;

public class DanhSachXeTai {
    private ArrayList<XeTai> danhSachXT ;

    public DanhSachXeTai(ArrayList<XeTai> danhSachXT) {
        this.danhSachXT = danhSachXT;
    }

    public DanhSachXeTai() {
        this.danhSachXT = new ArrayList<XeTai>();
    }

    // thêm vào danh sách
    public void addXT(XeTai pt){
        this.danhSachXT.add(pt);
    }

    // in ra danh sách
    public void inXT(){
        for (XeTai x: danhSachXT){
            System.out.println(x);
        }
    }

    // xoá phương tiện
    public boolean xoa(XeTai pt){
        return  this.danhSachXT.remove(pt);
    }


    // tìm kiếm phương tiện theo biển kiểm soát
    public void searchXT(String bienSo){
        for (XeTai x: danhSachXT){
            if (x.getBienKiemSoat().indexOf(bienSo) >= 0){
                System.out.println(x);
            }
        }
    }


}
