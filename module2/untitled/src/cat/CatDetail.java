package cat;

import java.util.Scanner;

public class CatDetail implements ICat{
   String color ;
   String loai ;
   String address    ;
   public CatDetail(){

   }
    public CatDetail(String color, String loaiMau, String address) {
        this.color = color;
        this.loai = loaiMau;
        this.address = address;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLoaiMau() {
        return loai;
    }

    public void setLoaiMau(String loaiMau) {
        this.loai = loaiMau;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("loài");
        String loai = scanner.nextLine();
        System.out.println("nhập màu");
        String color= scanner.nextLine();
        System.out.println("nơi sống");
        String address = scanner.nextLine();

    }

    @Override
    public void xuat() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "CatDetail{" +" tên " + name +
                "color='" + color + '\'' +
                ", loai='" + loai + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
