package luyentap.interface_abstract.quanli_sinhvien;

import java.util.Objects;

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
public  class SinhVien implements Comparable<SinhVien>{
    private String id ;
    private String name ;
    private int date ;
    protected double trungBinh ;

    public SinhVien(String id, String name, int date, double trungBinh) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.trungBinh = trungBinh;
    }

    public SinhVien() {
    }

    public SinhVien(String id) {
        this.id = id;
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

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public double getTrungBinh() {
        return trungBinh;
    }

    public void setTrungBinh(double trungBinh) {
        this.trungBinh = trungBinh;
    }
    @Override
    public String toString() {
        return "SinhVien{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", trungBinh=" + trungBinh +
                '}';
    }
    @Override
    public int compareTo(SinhVien o) {
       return this.id.compareTo(o.id);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SinhVien sinhVien = (SinhVien) o;
        return  Objects.equals(id, sinhVien.id) ;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, date, trungBinh);
    }
}
