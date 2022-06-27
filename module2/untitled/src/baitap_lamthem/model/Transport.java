package baitap_lamthem.model;

import java.util.Objects;

public abstract class Transport {
    private String bienSo ;
    private String hangSX ;
    private int namSX;
    private String chuSH;

    public Transport(String bienSo, String hangSX, int namSX, String chuSH) {
        this.bienSo = bienSo;
        this.hangSX = hangSX;
        this.namSX = namSX;
        this.chuSH = chuSH;
    }

    public Transport() {
    }

    public String getBienSo() {
        return bienSo;
    }

    public void setBienSo(String bienSo) {
        this.bienSo = bienSo;
    }

    public String getHangSX() {
        return hangSX;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public int getNamSX() {
        return namSX;
    }

    public void setNamSX(int namSX) {
        this.namSX = namSX;
    }

    public String getChuSH() {
        return chuSH;
    }

    public void setChuSH(String chuSH) {
        this.chuSH = chuSH;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "bienSo='" + bienSo + '\'' +
                ", hangSX='" + hangSX + '\'' +
                ", namSX=" + namSX +
                ", chuSH='" + chuSH + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return bienSo.equals(transport.bienSo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bienSo);
    }
}
