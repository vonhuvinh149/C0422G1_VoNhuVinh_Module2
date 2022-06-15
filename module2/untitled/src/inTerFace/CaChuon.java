package inTerFace;

public class CaChuon extends LopCa implements iBay{
    double speed ;
    public CaChuon(String tenCa, String color, double canNang, boolean coVay, double speed) {
        super(tenCa, color, canNang, coVay);
       this.speed = speed ;
    }

    @Override
    public void CachBay() {
        System.out.println("bay nhu tên lưa");
    }

    @Override
    public void cachboi() {
        super.cachboi();
        System.out.println("kakaka");
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("bay với vận tốc" + speed + "km/h");
    }
}
