package luyentap.interface_abstract.on_tap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachSV {
    private ArrayList<SinhVien1> danhSach;

    public DanhSachSV(ArrayList<SinhVien1> danhSach) {
        this.danhSach = danhSach;
    }

    public DanhSachSV() {
        this.danhSach = new ArrayList<SinhVien1>();
    }

    // thêm 1 sinh viên vào danh sách
    public void addSV(SinhVien1 sv) {
        this.danhSach.add(sv);
    }


    //in ra danh sách sinh viên
    public void inSV() {
        for (SinhVien1 x : danhSach) {
            System.out.println(x);
        }
    }

    //kiểm tra dann sách có rỗng hay không
    public boolean kiemTra() {
        return this.danhSach.isEmpty();
    }

    // in số lượng sinh viên trong danh sách
    public void soLuong() {
        System.out.println("số lượng sinh viên trong danh sách" + this.danhSach.size());
    }

    // làm rỗng danh sách
    public void xoaAll() {
        this.danhSach.clear();
    }


    // kiểm tra xem sinh viên có trong danh sách hay không bằng id
    public boolean check(SinhVien1 sv) {
       return this.danhSach.contains(sv);
    }
    // xoá 1 sinh viên ra khỏi danh sách dựa trên mả sinh viên
    public boolean xoa1(SinhVien1 sv) {
       return this.danhSach.remove(sv);
    }

    // tiềm sinh viên trong danh sách bằng tên
    public void timTheoTen(String ten) {
        for (SinhVien1 x : danhSach) {
            if (x.getName().indexOf(ten) >= 0) {
                System.out.println(x);
            }
        }
    }

    // sắp xếp dựa trên điểm trung bình
    public void sapXep() {
        Collections.sort(this.danhSach, new Comparator<SinhVien1>() {
            @Override
            public int compare(SinhVien1 sv1, SinhVien1 sv2) {
                if (sv1.getDiemTrungBinh() > sv2.getDiemTrungBinh()) {
                    return 1;
                } else if (sv1.getDiemTrungBinh() < sv2.getDiemTrungBinh()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });

    }


}
