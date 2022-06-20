package inTerFace;

public abstract class LopCa implements IBoi{
    // khai báo biến
    String tenCa ;
    String color ;
    double canNang ;
    boolean coVay ;
    // hàm khởi tạo

    public LopCa(String tenCa, String color, double canNang, boolean coVay) {
        this.tenCa = tenCa;
        this.color = color;
        this.canNang = canNang;
        this.coVay = coVay;
    }
    // phương thức
    public  void inThongTin(){
        System.out.println("tên cá: " + tenCa );
        System.out.println("màu sắc: "+color);
        System.out.println("cân nặng: "+ canNang);
        System.out.println("là cá" + (coVay?" co vay":" da trơn"));
    }
    // implement cachboi()

    @Override
    public void cachboi() {
        System.out.println("cá là phải biết bơi");
    }
}
