package baitap_lamthem;

import java.util.Objects;

public  class PhuongTien implements Comparable<PhuongTien>{
    private String bienKiemSoat ;
    private String hangSX;
    private String namSx ;
    private String chuSoHuu;

    public PhuongTien(String bienKiemSoat, String hangSX, String namSx, String chuSoHuu) {
        this.bienKiemSoat = bienKiemSoat;
        this.hangSX = hangSX;
        this.namSx = namSx;
        this.chuSoHuu = chuSoHuu;
    }

    public PhuongTien(String bienKiemSoat) {
        this.bienKiemSoat = bienKiemSoat;
    }

    public PhuongTien() {
    }

    public String getBienKiemSoat() {
        return bienKiemSoat;
    }

    public void setBienKiemSoat(String bienKiemSoat) {
        this.bienKiemSoat = bienKiemSoat;
    }

    public String getHangSX() {
        return hangSX;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public String getNamSx() {
        return namSx;
    }

    public void setNamSx(String namSx) {
        this.namSx = namSx;
    }

    public String getChuSoHuu() {
        return chuSoHuu;
    }

    public void setChuSoHuu(String chuSoHuu) {
        this.chuSoHuu = chuSoHuu;
    }

    @Override
    public String toString() {
        return  "biển số : " + bienKiemSoat +
                ", hangSX: " + hangSX +
                ", namSx: " + namSx +
                ", chuSoHuu: " + chuSoHuu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhuongTien phuongTien = (PhuongTien) o;
        return Objects.equals(bienKiemSoat, phuongTien.bienKiemSoat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bienKiemSoat, hangSX, namSx, chuSoHuu);
    }

    @Override
    public int compareTo(PhuongTien o) {
        return this.bienKiemSoat.compareTo(o.bienKiemSoat);
    }
}
