package baitap_lamthem;

public class XeTai extends PhuongTien{
    private String taiTrong ;

    public XeTai(String bienKiemSoat, String hangSX, String namSx, String chuSoHuu, String taiTrong) {
        super(bienKiemSoat, hangSX, namSx, chuSoHuu);
        this.taiTrong = taiTrong;
    }

    public XeTai() {
    }

    public XeTai(String bienKiemSoat) {
       super(bienKiemSoat);
    }

    public String getTaiTrong() {
        return taiTrong;
    }

    public void setTaiTrong(String taiTrong) {
        this.taiTrong = taiTrong;
    }

    @Override
    public String toString() {
        return "xetai : " +super.toString()+
                "taiTrong : " + taiTrong  ;
    }
}
