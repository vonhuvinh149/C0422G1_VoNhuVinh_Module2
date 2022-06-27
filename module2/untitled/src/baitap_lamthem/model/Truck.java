package baitap_lamthem.model;

public class Truck extends Transport{
    private int taiTrong ;

    public Truck(String bienSo, String hangSX, int namSX, String chuSH, int taiTrong) {
        super(bienSo, hangSX, namSX, chuSH);
        this.taiTrong = taiTrong;
    }

    public Truck() {
    }

    public int getTaiTrong() {
        return taiTrong;
    }

    public void setTaiTrong(int taiTrong) {
        this.taiTrong = taiTrong;
    }

    @Override
    public String toString() {
        return "Truck{" +super.toString()+
                "taiTrong=" + taiTrong +
                '}';
    }
}
