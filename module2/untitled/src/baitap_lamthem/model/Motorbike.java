package baitap_lamthem.model;

public class Motorbike extends Transport{
    private int congSuat ;

    public Motorbike(String bienSo, String hangSX, int namSX, String chuSH, int congSuat) {
        super(bienSo, hangSX, namSX, chuSH);
        this.congSuat = congSuat;
    }

    public Motorbike() {
    }

    public int getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return "Motorbike{" +super.toString()+
                "congSuat=" + congSuat +
                '}';
    }
}
