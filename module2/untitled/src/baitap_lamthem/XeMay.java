package baitap_lamthem;

public class XeMay extends PhuongTien {
    private String congSuat;

    public XeMay(String bienKiemSoat, String hangSX, String namSx, String chuSoHuu, String congSuat) {
        super(bienKiemSoat, hangSX, namSx, chuSoHuu);
        this.congSuat = congSuat;
    }

    public XeMay() {
    }

    public XeMay(String bienKiemSoat) {
        super(bienKiemSoat);
    }

    public String getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(String congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return "XeMay: " + super.toString() +
                "congSuat: " + congSuat;
    }
}
