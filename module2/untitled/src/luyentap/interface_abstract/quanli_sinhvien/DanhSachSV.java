package luyentap.interface_abstract.quanli_sinhvien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachSV {
    private ArrayList<SinhVien> danhSach;

    public DanhSachSV(ArrayList<SinhVien> danhSach) {
        this.danhSach = danhSach;
    }

    public DanhSachSV() {
        this.danhSach = new ArrayList<SinhVien>();
    }

    // thêm sinh viên vào danh sách
    public void add(SinhVien sv) {
        this.danhSach.add(sv);
    }

    // in danh sách sin viên
    public void inDSSV(){
        for(SinhVien x: danhSach){
            System.out.println(x);
        }
    }

    // kiểm tra danh sách sinh viên có rỗng hay không
    public boolean kiemtra(){
      return   this.danhSach.isEmpty();
    }

    // lấy ra số lượng sinh viên trong danh sách
    public int laySoLuong(){
        return this.danhSach.size();
    }

    // làm rỗng danh sách sinh viên
    public void lamRongDanhSach(){
        this.danhSach.removeAll(danhSach);
    }

    // kiểm tra xem sinh viên có tồn tại trong danh sách hay không
    public boolean kiemTraTonTai(SinhVien sv){
        return this.danhSach.contains(sv);
    }

    // xoá 1 sinh viên ra khỏi danh sách
    public boolean xoaSinhVien(SinhVien sv){
        return this.danhSach.remove(sv);
    }

    // tìm kiếm sinh vien có trong danh sách hay không
    public void timSinhVien(String ten){
        for(SinhVien x: danhSach){
            if (x.getName().indexOf(ten) >= 0){
                System.out.println(x);
            }
        }
    }

    // sắp xếp dan sách sinh viên giảm dần theo điểm
    public void sapXep(){
        Collections.sort(this.danhSach, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien sv1, SinhVien sv2) {
                if (sv1.getTrungBinh()< sv2.getTrungBinh()){
                    return 1 ;
                }else if (sv1.getTrungBinh() > sv2.getTrungBinh()){
                    return -1 ;
                }else{
                    return 0 ;
                }
            }
        });
    }
}
