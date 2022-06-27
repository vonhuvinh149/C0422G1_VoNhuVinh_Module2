package baitap_lamthem.model;

public class Car extends Transport{
    private int choNgoi ;
    private String kieuXe ;

    public Car(String bienSo, String hangSX, int namSX, String chuSH, int choNgoi, String kieuXe) {
        super(bienSo, hangSX, namSX, chuSH);
        this.choNgoi = choNgoi;
        this.kieuXe = kieuXe;
    }

    public Car() {
    }

    public int getChoNgoi() {
        return choNgoi;
    }

    public void setChoNgoi(int choNgoi) {
        this.choNgoi = choNgoi;
    }

    public String getKieuXe() {
        return kieuXe;
    }

    public void setKieuXe(String kieuXe) {
        this.kieuXe = kieuXe;
    }

    @Override
    public String toString() {
        return "Car{" +super.toString()+
                "choNgoi=" + choNgoi +
                ", kieuXe='" + kieuXe + '\'' +
                '}';
    }
}
