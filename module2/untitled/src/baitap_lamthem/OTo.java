package baitap_lamthem;


import java.util.ArrayList;

public class OTo extends PhuongTien{
    private String choNgoi ;
    private String kieuXe ;

    public OTo(String bienKiemSoat, String hangSX, String namSx, String chuSoHuu, String choNgoi, String kieuXe) {
        super(bienKiemSoat, hangSX, namSx, chuSoHuu);
        this.choNgoi = choNgoi;
        this.kieuXe = kieuXe;
    }

    public OTo() {
    }

    public String getChoNgoi() {
        return choNgoi;
    }

    public void setChoNgoi(String choNgoi) {
        this.choNgoi = choNgoi;
    }

    public String getKieuXe() {
        return kieuXe;
    }

    public OTo(String bienKiemSoat) {
        super(bienKiemSoat);
    }

    public void setKieuXe(String kieuXe) {
        this.kieuXe = kieuXe;
    }

    @Override
    public String toString() {
        return "OTo{" +super.toString()+
                "choNgoi='" + choNgoi + '\'' +
                ", kieuXe='" + kieuXe + '\'' +
                '}';
    }
}
