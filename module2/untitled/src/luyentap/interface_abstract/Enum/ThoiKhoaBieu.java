package luyentap.interface_abstract.Enum;

public class ThoiKhoaBieu {
    private Enum thu;
    private String cacMonhoc ;

    public ThoiKhoaBieu(Enum thu, String cacMonhoc) {
        this.thu = thu;
        this.cacMonhoc = cacMonhoc;
    }

    public ThoiKhoaBieu() {
    }

    public Enum getThu() {
        return thu;
    }

    public void setThu(Enum thu) {
        this.thu = thu;
    }

    public String getCacMonhoc() {
        return cacMonhoc;
    }

    public void setCacMonhoc(String cacMonhoc) {
        this.cacMonhoc = cacMonhoc;
    }

    @Override
    public String toString() {
        return "ThoiKhoaBieu{" +
                "thu=" + thu +
                ", cacMonhoc='" + cacMonhoc + '\'' +
                '}';
    }
}
