package luyentap.interface_abstract.on_tap;

import luyentap.interface_abstract.quanli_sinhvien.SinhVien;

import java.util.ArrayList;
import java.util.Objects;

public class SinhVien1 implements Comparable<SinhVien1> {
    /*
     *  Thông tin bao gồm
     *     - mã sinh viên
     *     - họ và tên
     *     - năm sinh
     *     - điểm trung bình
     * yêu cầu
     *     - sử dụng ArrayList
     *     - Cho phép người dùng chọn
     *          1. thêm sinh viên vào danh sách
     *          2. in danh sách sinh viên ra màng hình
     *          3. kiểm tra danh sách có rỗng hay k
     *          4. lấy ra số lượng sinh viên trong danh sách
     *          5. làm rỗng danh sách sinh viên
     *          6. kiểm tra sinh viên có tồn tại trong danh sách hay ko dựa trên mả sinh viên
     *          7. xoá 1 sinh viên ra khỏi danh sách dựa trên mả sinh viên
     *          8. tìm kiểm tất cả sinh viên dựa trên tên và nhập từ bàn phím
     *          9 . xuất ra danh sách sinh viên có điểm từ cao đến thấp
     */
    private String id ;
    private String name ;
    private int year ;
    private double diemTrungBinh ;

    public SinhVien1(String id, String name, int year, double diemTrungBinh) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.diemTrungBinh = diemTrungBinh;
    }

    public SinhVien1(String id) {
        this.id = id;
    }

    public SinhVien1() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    @Override
    public int compareTo(SinhVien1 o) {
       return this.id.compareTo(o.id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SinhVien1 sinhVien1 = (SinhVien1) o;
        return Objects.equals(id, sinhVien1.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "SinhVien1{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", diemTrungBinh=" + diemTrungBinh +
                '}';
    }
}
