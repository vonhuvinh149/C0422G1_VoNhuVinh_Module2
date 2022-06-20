package inTerFace;
public class CaTre extends LopCa implements iBo{
    // khai báo thuộc tính
    double soKm ;
    public CaTre(String tenCa, String color, double canNang, boolean coVay,double soKm) {
        super(tenCa, color, canNang, coVay);
        this.soKm = soKm ;
    }

    @Override
    public void CachBo() {
        System.out.println(" bò xa lắm ");
    }

    @Override
    public void cachboi() {
        super.cachboi();
        System.out.println("bơi  kiểu haha");
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println(" bò xa : " + soKm);
    }
}
