package baitap_lamthem;

import java.util.ArrayList;

public class DanhSachXeMay {
    private ArrayList<XeMay> danhSachXM;

    public DanhSachXeMay(ArrayList<XeMay> danhSachXM) {
        this.danhSachXM = danhSachXM;
    }

    public DanhSachXeMay() {
        this.danhSachXM = new ArrayList<XeMay>();
    }



    // thêm vào danh sách
    public void addXM(XeMay pt){
        this.danhSachXM.add(pt);
    }
    // in ra danh sách
    public void inXM(){
      for(XeMay x: danhSachXM){
          System.out.println(x);
      }
    }

    // xoá phương tiện
    public boolean xoa(XeMay pt){
        return   this.danhSachXM.remove(pt);
    }
    // tìm kiếm theo biển kiểm soát
    public void searchXM(String bienSo){
        for (XeMay x: danhSachXM){
            if (x.getBienKiemSoat().indexOf(bienSo) >= 0){
                System.out.println(x);
            }
        }
}
}
